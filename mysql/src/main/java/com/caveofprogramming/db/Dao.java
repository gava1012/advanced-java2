package com.caveofprogramming.db;

import com.google.common.base.Optional;

public interface Dao<T> {
	void save(T t);
	Optional<T> findById(int id);
	void update(T t);
	void delete(T t);
}
