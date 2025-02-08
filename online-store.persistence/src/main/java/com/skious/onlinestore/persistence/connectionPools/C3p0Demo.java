package com.skious.onlinestore.persistence.connectionPools;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo {
	private static ComboPooledDataSource cpds = new ComboPooledDataSource();

    static {
        try {
            cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test_connection_pool");
            cpds.setUser("root");
            cpds.setPassword("skious");
            cpds.setMaxIdleTime(100);
            cpds.setMaxStatementsPerConnection(10);
        } catch (PropertyVetoException e) {
            // handle the exception
        }
    }
    
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
	
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		try (conn) {
			System.out.println(conn);
		}
		System.out.println(conn);
	}

}
