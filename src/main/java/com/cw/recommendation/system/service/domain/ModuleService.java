package com.cw.recommendation.system.service.domain;

import java.util.List;

import com.cw.recommendation.system.entity.Module;

public interface ModuleService {
	List<Module> getAll();

	Module create(Module obj);

	Module read(Long key);

	void update(Module obj);

	boolean delete(Long key);
}
