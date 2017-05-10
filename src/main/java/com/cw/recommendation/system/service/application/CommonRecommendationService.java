package com.cw.recommendation.system.service.application;

import java.util.Set;

import com.cw.recommendation.system.entity.Subject;

public interface CommonRecommendationService {
	Set<Subject> recommendSubjects(Long userId, Long courseId, SubjectSelectorService subjectSelectorService);
}
