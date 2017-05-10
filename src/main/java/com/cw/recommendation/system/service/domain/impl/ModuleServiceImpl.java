package com.cw.recommendation.system.service.domain.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.recommendation.system.dao.ModuleDao;
import com.cw.recommendation.system.entity.Module;
import com.cw.recommendation.system.service.domain.ModuleService;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleDao moduleDao;

	public List<Module> getAll() {
		return moduleDao.getAll();
	}

	public Module create(Module obj) {
		return moduleDao.create(obj);
	}

	public Module read(Long key) {
		return moduleDao.read(key);
	}

	public void update(Module obj) {
		moduleDao.update(obj);

	}

	public boolean delete(Long key) {
		return moduleDao.delete(key);
	}

}
