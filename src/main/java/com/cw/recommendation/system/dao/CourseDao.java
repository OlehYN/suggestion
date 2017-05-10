package com.cw.recommendation.system.dao;

import org.springframework.stereotype.Repository;

import com.cw.recommendation.system.entity.Course;

@Repository
public interface CourseDao extends GenericDao<Course, Long> {

}
