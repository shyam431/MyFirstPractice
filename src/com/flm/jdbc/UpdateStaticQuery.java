package com.flm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStaticQuery {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flmtest","root","root");
			Statement stmt = con.createStatement();){
			
			//insertion ::
			//int count = stmt.executeUpdate("insert into Student values(8,'Rajini','CNC','9701234567')");
			
			//updation ::
			//stmt.executeUpdate("Update Student set address='Dharmaram' where name='Harish'");
			
			//delation ::
			stmt.executeUpdate("delete from student where id=6");
			
			
			//System.out.println("incerted rows : "+ count);
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
