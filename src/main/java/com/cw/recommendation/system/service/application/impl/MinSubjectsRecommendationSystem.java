package com.cw.recommendation.system.service.application.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.recommendation.system.entity.Course;
import com.cw.recommendation.system.entity.Module;
import com.cw.recommendation.system.entity.Student;
import com.cw.recommendation.system.entity.Subject;
import com.cw.recommendation.system.service.application.RecommendationService;
import com.cw.recommendation.system.service.domain.CourseService;
import com.cw.recommendation.system.service.domain.StudentService;

@Service
public class MinSubjectsRecommendationSystem implements RecommendationService {

	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseService courseService;

	public Set<Subject> recommendSubjects(Long userId, Long courseId) {
		Student student = studentService.read(userId);
		Course course = courseService.read(courseId);

		Set<Module> modules = course.getCourseModules();
		Set<Subject> studentSubjects = student.getStudentSubjects();

		for (Subject studentSubject : studentSubjects)
			modules.removeAll(studentSubject.getSubjectModules());

		List<Subject> possibleSubjects = new ArrayList<>();
		Set<Subject> resultSubjects = new HashSet<>();

		for (Module courseModule : modules)
			possibleSubjects.addAll(courseModule.getModuleSubjects());

		possibleSubjects.removeAll(studentSubjects);

		while (possibleSubjects.size() > 0 && modules.size() > 0) {
			possibleSubjects.sort((subject1, subject2) -> {
				Set<Module> modules1 = subject1.getSubjectModules();
				Set<Module> modules2 = subject2.getSubjectModules();

				Integer count1 = 0;
				Integer count2 = 0;

				for (Module module : modules) {
					if (modules1.contains(module))
						++count1;

					if (modules2.contains(module))
						++count2;
				}
				return count2.compareTo(count1);
			});

			Subject currentBestSubject = possibleSubjects.get(0);
			resultSubjects.add(currentBestSubject);

			possibleSubjects.remove(0);
			modules.removeAll(currentBestSubject.getSubjectModules());
		}

		if (possibleSubjects.size() == 0 && modules.size() > 0)
			throw new IllegalArgumentException("Cannot recommend subjects: unpossible to handle course modules");

		return resultSubjects;
	}

}
