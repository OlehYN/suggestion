package com.cw.recommendation.system.service;

import java.util.List;

import com.cw.recommendation.system.entity.Course;

public interface CourseService {
	List<Course> getAll();

	Course create(Course obj);

	Course read(Long key);

	void update(Course obj);

	boolean delete(Long key);
}
