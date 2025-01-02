package com.flm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//loading the mysql explicilty, It is not required with after 4.0 version of jdbc connecter
		//Class .forName("com.mysql.cj.jdbc.Driver");
		
		//Create the jdbc connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flmtest","root","root");
		
		//Create statment
		Statement statement = connection.createStatement();
		
		//Execute
		ResultSet result= statement.executeQuery("Select * from Student");
		
		//Fetching data
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			String address = result.getString("address");
			String mobile = result.getString("Ph_no");
			System.out.println(id+"\t"+name+"\t"+address+"\t"+mobile);
		}
	}
}
