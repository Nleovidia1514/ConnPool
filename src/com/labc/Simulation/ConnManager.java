package com.labc.Simulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnManager {
	static String connString = "jdbc:postgresql:Mantenimiento";
	static String user = "postgres";
	static String pass = "masterkey";
	
	public static Connection getConnection() {
		Connection connection;
		try
		{
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("You must have JDBC Driver installed in the JVM.");
			return null;
		}
		try
		{
			connection = DriverManager.getConnection(connString, user, pass);
			System.out.println("Connection successful");
		}catch(SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
			return null;
		}
		
		return connection;
		
	}
}
