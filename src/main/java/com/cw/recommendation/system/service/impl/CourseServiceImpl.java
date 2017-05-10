package com.cw.recommendation.system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.recommendation.system.dao.CourseDao;
import com.cw.recommendation.system.entity.Course;
import com.cw.recommendation.system.service.CourseService;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	public List<Course> getAll() {
		return courseDao.getAll();
	}

	public Course create(Course obj) {
		return courseDao.create(obj);
	}

	public Course read(Long key) {
		return courseDao.read(key);
	}

	public void update(Course obj) {
		courseDao.update(obj);

	}

	public boolean delete(Long key) {
		return courseDao.delete(key);
	}

}
