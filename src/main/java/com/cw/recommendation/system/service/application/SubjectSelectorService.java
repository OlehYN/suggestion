package com.cw.recommendation.system.service.application;

import java.util.Set;

import com.cw.recommendation.system.entity.Module;
import com.cw.recommendation.system.entity.Subject;

public interface SubjectSelectorService {
	int compareSubjects(Subject subject1, Subject subject2, Set<Module> modules);
}
