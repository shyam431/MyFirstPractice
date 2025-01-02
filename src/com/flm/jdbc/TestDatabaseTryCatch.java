package com.flm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabaseTryCatch {

	public static void main(String[] args) throws SQLException {
		
		try(
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flmtest","root","root");
		Statement stmnt =con.createStatement();
		ResultSet rs = stmnt.executeQuery("Select * from Student")){
		
			while(rs.next()){
				int id = rs.getInt("id");
				String name=rs.getString("name");
				String mobile = rs.getString("ph_no");
				String Address = rs.getString("address");
				
				System.out.println(id+"\t"+name+"\t"+mobile+"\t"+Address);
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
