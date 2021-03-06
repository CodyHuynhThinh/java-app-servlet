package com.java.app.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.java.app.dao.ICategoryDAO;
import com.java.app.model.CategoryModel;
import com.java.app.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
	
}
