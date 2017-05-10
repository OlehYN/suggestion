package com.cw.recommendation.system.dao.impl;

import org.springframework.stereotype.Repository;

import com.cw.recommendation.system.dao.CourseDao;
import com.cw.recommendation.system.entity.Course;

@Repository
public class CourseDaoImpl extends GenericDaoImpl<Course, Long> implements CourseDao {

	@Override
	protected Class<Course> entityClass() {
		return Course.class;
	}

	@Override
	protected String getEntityName() {
		return "course";
	}

}
