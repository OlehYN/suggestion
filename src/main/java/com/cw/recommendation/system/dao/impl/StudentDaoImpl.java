package com.cw.recommendation.system.dao.impl;

import org.springframework.stereotype.Repository;

import com.cw.recommendation.system.dao.StudentDao;
import com.cw.recommendation.system.entity.Student;

@Repository
public class StudentDaoImpl extends GenericDaoImpl<Student, Long> implements StudentDao {

	@Override
	protected Class<Student> entityClass() {
		return Student.class;
	}

	@Override
	protected String getEntityName() {
		return "student";
	}

}
