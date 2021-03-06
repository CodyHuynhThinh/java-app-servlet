package com.java.app.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.java.app.dao.ICategoryDAO;
import com.java.app.mapper.CategoryMapper;
import com.java.app.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String strSql = "SELECT * FROM category";
		return query(strSql, new CategoryMapper());
	}
}
