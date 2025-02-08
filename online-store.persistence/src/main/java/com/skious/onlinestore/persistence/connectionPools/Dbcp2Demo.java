package com.skious.onlinestore.persistence.connectionPools;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class Dbcp2Demo {
	private static BasicDataSource ds = new BasicDataSource();

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		ds.setUrl("jdbc:mysql://localhost:3306/test_connection_pool");
		ds.setUsername("root");
		ds.setPassword("skious");
		ds.setMinIdle(3);
		ds.setTimeBetweenEvictionRunsMillis(1000);
		ds.setMaxIdle(20);
		ds.setMaxOpenPreparedStatements(200);
	}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		try (conn) {
			System.out.println(conn);
		}
		System.out.println(conn);
	}
}
