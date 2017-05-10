package com.cw.recommendation.system.service;

import java.util.List;

import com.cw.recommendation.system.entity.Student;

public interface StudentService {
	List<Student> getAll();

	Student create(Student obj);

	Student read(Long key);

	void update(Student obj);

	boolean delete(Long key);
}
