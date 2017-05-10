package com.cw.recommendation.system.service.application.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.cw.recommendation.system.entity.Module;
import com.cw.recommendation.system.entity.Subject;
import com.cw.recommendation.system.service.application.SubjectSelectorService;

@Service(value = "MinSubjects")
public class MinSubjectsSelectorService implements SubjectSelectorService {

	@Override
	public int compareSubjects(Subject subject1, Subject subject2, Set<Module> modules) {
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
		int compareResult = count2.compareTo(count1);

		if (compareResult != 0)
			return compareResult;

		return Double.valueOf(subject1.getCredits()).compareTo(Double.valueOf(subject2.getCredits()));
	}

}
