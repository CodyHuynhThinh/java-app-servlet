package com.java.app.dao;

import java.util.List;

import com.java.app.mapper.RowMapper;

public interface IAbstractDAO<T> {
	
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);

}
