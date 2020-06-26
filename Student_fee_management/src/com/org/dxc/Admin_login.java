package com.org.dxc;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Admin_login 
{	
	
	
	public void addAccountant(BufferedReader buff) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/test";  
		
		String user="root";
		
		String password="12345";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String query="insert into test.accountant_db values(?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		System.out.println("Enter your Name");
		String name = buff.readLine();
		preparedStatement.setString(1,name);
		
		System.out.println("Enter your password");
		String pwd = buff.readLine();
		preparedStatement.setString(2,pwd);
		
		System.out.println("Enter your Email");
		String email = buff.readLine();
		preparedStatement.setString(3,email);
		
		System.out.println("Enter your Phone");
		String phone = buff.readLine();
		preparedStatement.setString(4,phone);

		System.out.println("Congratulations your Account is added !!");
		System.out.println("your Details are \nName: "+name+"\n password:"+pwd+ "\nEmail: "+email+"\nPhone: "+phone);
	preparedStatement.executeUpdate();
		
		connection.close();
		
	}

	public void viewAccountant(BufferedReader buff) throws Exception 
{
		String url="jdbc:mysql://localhost:3306/test";  
		
		String user="root";
		
		String password="12345";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String query="select name,pwd,email,contactNumber from test.accountant_db";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			
		
			String uName=resultSet.getString("name");
			String upwd=resultSet.getString("pwd");
			String uEmail=resultSet.getString("email");
			String uphone=resultSet.getString("contactNumber");
			System.out.println(uName+" "+upwd+" "+uEmail+" "+" "+uphone);
		}
			
	}

	
}
