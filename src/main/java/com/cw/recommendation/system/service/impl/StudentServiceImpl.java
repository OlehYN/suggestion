package com.cw.recommendation.system.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.recommendation.system.dao.StudentDao;
import com.cw.recommendation.system.entity.Student;
import com.cw.recommendation.system.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public List<Student> getAll() {
		return studentDao.getAll();
	}

	public Student create(Student obj) {
		return studentDao.create(obj);
	}

	public Student read(Long key) {
		return studentDao.read(key);
	}

	public void update(Student obj) {
		studentDao.update(obj);

	}

	public boolean delete(Long key) {
		return studentDao.delete(key);
	}

}
