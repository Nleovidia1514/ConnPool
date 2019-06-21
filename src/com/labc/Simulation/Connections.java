package com.labc.Simulation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;

public class Connections implements Runnable {
	
	String paragraph;
	JTextArea textArea = UserInterface.textArea;
	
	@Override
	public void run() {
		Connection conn = ConnManager.getConnection();
		String query = "Select * from document";
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while(rs.next())
				 paragraph = rs.getString(2);
			textArea.append(paragraph);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connections() {
		new Thread(this).start();
	}
}
