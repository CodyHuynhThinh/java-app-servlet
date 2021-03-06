package com.java.app.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.app.dao.IAbstractDAO;
import com.java.app.mapper.RowMapper;

public class AbstractDAO<T> implements IAbstractDAO<T> {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/java_app";
			String user = "root";
			String password = "123456";
		
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> listResult = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet result = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			// set parameter
			result = pstmt.executeQuery();
			while (result.next()) {
				listResult.add(rowMapper.MapRow(result));
			}
			return listResult;
		}
		catch (SQLException e) {
			return null;
		}
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
				
				if (pstmt != null) {
					conn.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
