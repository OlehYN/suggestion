package com.cw.recommendation.system.service;

import java.util.List;

import com.cw.recommendation.system.entity.Subject;

public interface SubjectService {
	List<Subject> getAll();

	Subject create(Subject obj);

	Subject read(Long key);

	void update(Subject obj);

	boolean delete(Long key);
}
