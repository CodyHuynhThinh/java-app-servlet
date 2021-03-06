package com.java.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.app.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel MapRow(ResultSet rs) {
		CategoryModel categoryModel = new CategoryModel();
		try {
			categoryModel.setId(rs.getInt("id"));
			categoryModel.setCategoryName(rs.getString("name"));
			return categoryModel;
		} catch (SQLException e) {
			return null;
		}
	}

}
