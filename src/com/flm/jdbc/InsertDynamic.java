package com.flm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamic {

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flmtest","root","root");
			Statement st = con.createStatement();
				Scanner scan= new Scanner(System.in);){
			
			for(int i=0; i<=2;i++) {
			System.out.println("Enter Id : ");
			int id = scan.nextInt();
			System.out.println("Enter name : ");
			String name = scan.next();
			System.out.println("Enter address : ");
			String address = scan.next();
			System.out.println("Enter mobile : ");
			String mobile = scan.next();
			
			String insertQuary ="insert into Student values("+id+",'"+name+"','"+address+"','"+mobile+"')";
			
			st.executeUpdate(insertQuary);
			}
			
			
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
