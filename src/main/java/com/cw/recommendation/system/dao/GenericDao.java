package com.cw.recommendation.system.dao;

import java.util.List;

public interface GenericDao<Entity, Key> {

	List<Entity> getAll();

	Entity create(Entity obj);

	Entity read(Key key);

	void update(Entity obj);

	boolean delete(Key key);
}
