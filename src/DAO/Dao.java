package DAO;

import java.io.Serializable;
import java.util.List;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface Dao<T extends Object> {
	boolean insert(T t);
	T select(Serializable id);
	List<T> getAll();
	List<T> getList(T condition);
	boolean update(T t);
	boolean delete(T t);
	void deleteById(Serializable id);
	long count();
	boolean exists(Serializable id);
}