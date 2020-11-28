package org.intArchMigrationToRest.service;

import java.util.List;

public interface CRUDService<T> {

	boolean create(T t);
	boolean delete(Integer id);
	boolean update(Integer id,T t);
	List<T> getAll();
	T get(Integer id);
	
	
}
