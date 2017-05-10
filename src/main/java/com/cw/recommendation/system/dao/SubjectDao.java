package com.cw.recommendation.system.dao;

import org.springframework.stereotype.Repository;

import com.cw.recommendation.system.entity.Subject;

@Repository
public interface SubjectDao extends GenericDao<Subject, Long> {

}
