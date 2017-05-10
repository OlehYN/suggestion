package com.cw.recommendation.system.dao.impl;

import org.springframework.stereotype.Repository;

import com.cw.recommendation.system.dao.SubjectDao;
import com.cw.recommendation.system.entity.Subject;

@Repository
public class SubjectDaoImpl extends GenericDaoImpl<Subject, Long> implements SubjectDao {

	@Override
	protected Class<Subject> entityClass() {
		return Subject.class;
	}

	@Override
	protected String getEntityName() {
		return "subject";
	}

}
