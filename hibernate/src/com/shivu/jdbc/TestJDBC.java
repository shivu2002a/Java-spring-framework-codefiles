package com.shivu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	
	public static final String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
	public static final String username = "hbstudent";
	public static final String password = "hbstudent";
	
	public static void main(String Args[]) {
		Connection conn;
		System.out.println("Establishing Connection....");
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established!!");
		} catch(Exception e) {
			System.out.println("Unable to establish connection!!");
			e.printStackTrace();
		}
	}
}
