package com.cw.recommendation.system.service.application.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cw.recommendation.system.entity.Module;
import com.cw.recommendation.system.entity.Subject;
import com.cw.recommendation.system.service.application.SubjectSelectorService;

@Service(value = "MinYears")
public class MinYearsSelectorService implements SubjectSelectorService {

	@Autowired
	@Qualifier("MinSubjects")
	private SubjectSelectorService selectorService;

	@Override
	public int compareSubjects(Subject subject1, Subject subject2, Set<Module> modules) {
		Integer year1 = subject1.getYearOfStudy();
		Integer year2 = subject2.getYearOfStudy();

		int compareResult = year1.compareTo(year2);

		if (compareResult != 0)
			return compareResult;

		return selectorService.compareSubjects(subject1, subject2, modules);
	}

}
