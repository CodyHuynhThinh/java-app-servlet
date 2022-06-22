package com.java.app.dao;

import java.util.List;

import com.java.app.model.CategoryModel;

public interface ICategoryDAO extends IAbstractDAO<CategoryModel> {
	List<CategoryModel> findAll();
	
}
