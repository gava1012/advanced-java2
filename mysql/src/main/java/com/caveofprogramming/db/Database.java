package com.caveofprogramming.db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Database {
	private static Database db = new Database();
	private static String URL = "jdbc:mysql://localhost:3306/people";
	private Connection conn;
	
	
	public static Database instance() {
		return db;
	}
	
	
	private Database() {};
	
	public void connect() throws SQLException {
		
		conn =  DriverManager.getConnection(URL,"root","hello");
		
	}
	
	public void close() throws SQLException {
		conn.close();;
		
	}

}
