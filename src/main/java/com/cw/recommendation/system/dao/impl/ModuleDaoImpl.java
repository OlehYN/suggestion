package com.cw.recommendation.system.dao.impl;

import org.springframework.stereotype.Repository;

import com.cw.recommendation.system.dao.ModuleDao;
import com.cw.recommendation.system.entity.Module;

@Repository
public class ModuleDaoImpl extends GenericDaoImpl<Module, Long> implements ModuleDao {

	@Override
	protected Class<Module> entityClass() {
		return Module.class;
	}

	@Override
	protected String getEntityName() {
		return "module";
	}

}
