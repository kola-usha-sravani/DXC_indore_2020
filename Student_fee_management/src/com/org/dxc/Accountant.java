package com.org.dxc;

import java.io.BufferedReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Accountant {

	public void addStudent(BufferedReader buff) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/test";  
		
		String user="root";
		
		String password="12345";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String query="insert into test.student_db values(?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
			
	System.out.println("Enter student Name");
	String name = buff.readLine();
	preparedStatement.setString(1,name);
	
	System.out.println("Enter student email");
	String email = buff.readLine();
	preparedStatement.setString(2,email);
	
	System.out.println("Enter student course");
	String course = buff.readLine();
	preparedStatement.setString(3,course);

	System.out.println("Enter student fee");
	String fee = buff.readLine();
	preparedStatement.setString(4,fee);
	
	System.out.println("Enter student paid fee");
	String paid = buff.readLine();
	preparedStatement.setString(5,paid);
	
	System.out.println("Enter student due");
	String due = buff.readLine();
	preparedStatement.setString(6,due);
	
	System.out.println("Enter student address");
	String address = buff.readLine();
	preparedStatement.setString(7,address);
	
	System.out.println("Enter student city");
	String city = buff.readLine();
	preparedStatement.setString(8,city);
	
	System.out.println("Enter student state");
	String state= buff.readLine();
	preparedStatement.setString(9,state);
	
	System.out.println("Enter student country");
	String country= buff.readLine();
	preparedStatement.setString(10,country);
	
	System.out.println("Enter student phone number");
	String phone= buff.readLine();
	preparedStatement.setString(11,phone);
	

	System.out.println("Congratulations student Account details is added !!");	
   System.out.println("your Details are \nName: "+name+"\nEmail: "+email+"\nCouse:"+course+
		   "\nFEES:"+fee+"\nPaid:"+paid+"\nDue:"+due+"\nAddress:"+address+"\nCity:"+city+
		   "\nState:"+state+"\nCountry:"+country+"\nPhone: "+phone);
    preparedStatement.executeUpdate();
	
	connection.close();
	}

	public void viewStudent(BufferedReader buff) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/test";  
		
		String user="root";
		
		String password="12345";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String query="select * from test.student_db";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			
			String sName=resultSet.getString("student_name");
			String sEmail=resultSet.getString("student_email");
			String sCourse=resultSet.getString("student_course");
			String sFee=resultSet.getString("student_fee");
			String sPaid=resultSet.getString("student_paid");
			String sDue=resultSet.getString("student_due");
			String sAddress=resultSet.getString("student_address");
			String sCity=resultSet.getString("student_city");
			String sState=resultSet.getString("student_state");
			String sCountry=resultSet.getString("student_country");
			String sPhone=resultSet.getString("student_contactNumber");
			
			System.out.println("your Details are \nName: "+sName+"\nEmail: "+sEmail+"\nCouse:"+sCourse+
					   "\nFEES:"+sFee+"\nPaid:"+sPaid+"\nDue:"+sDue+"\nAddress:"+sAddress+"\nCity:"+sCity+
					   "\nState:"+sState+"\nCountry:"+sCountry+"\nPhone: "+sPhone);
			  
		}
	}

	public void editStudent(BufferedReader buff) throws Exception 
	{

		String url="jdbc:mysql://localhost:3306/test";  
		
		String user="root";
		
		String password="12345";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String query="select * from test.student_db where student_contactNumber=?";
		String query1="update test.student_db set student_name=? where student_contactNumber=?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		PreparedStatement preparedStatement1=connection.prepareStatement(query1);
    

		System.out.println("enter student contact number");
		String phone=buff.readLine();
		preparedStatement.setString(1,phone);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) 
		{
			
		System.out.println(" phone number is verified ");
		System.out.println("enter student name");
		String stuName=buff.readLine();
		preparedStatement1.setString(1, stuName);
		preparedStatement1.setString(2, phone);
		preparedStatement1.executeUpdate();
		System.out.println("student details was updated");
		
		
		}
		
	}

	public void dueFees(BufferedReader buff) throws Exception 
	{
String url="jdbc:mysql://localhost:3306/test";  
		
		String user="root";
		
		String password="12345";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		String query="select *  from test.student_db where student_due=?";
		//String query1="update test.student_db set student_due=? where student_contactNumber=?";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
	
		//PreparedStatement preparedStatement1=connection.prepareStatement(query1);

		System.out.println("enter student due");
		String due=buff.readLine();
		preparedStatement.setString(1,due);

    
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			
		String sName=resultSet.getString("student_name");
		String sEmail=resultSet.getString("student_email");
		String sCourse=resultSet.getString("student_course");
		String sFee=resultSet.getString("student_fee");
		String sPaid=resultSet.getString("student_paid");
		String sDue=resultSet.getString("student_due");
		String sAddress=resultSet.getString("student_address");
		String sCity=resultSet.getString("student_city");
		String sState=resultSet.getString("student_state");
		String sCountry=resultSet.getString("student_country");
		String sPhone=resultSet.getString("student_contactNumber");
		
		System.out.println("your Details are \nName: "+sName+"\nEmail: "+sEmail+"\nCouse:"+sCourse+
				   "\nFEES:"+sFee+"\nPaid:"+sPaid+"\nDue:"+sDue+"\nAddress:"+sAddress+"\nCity:"+sCity+
				   "\nState:"+sState+"\nCountry:"+sCountry+"\nPhone: "+sPhone);
		  
		}
	}


	
}
