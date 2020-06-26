package com.org.dxc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


class UserClass <T> {
			T obj;
			
			void create(T obj) {
				this.obj = obj;
			}
			
			T getInstance() {
				return obj;
			}
		}

	public class MainClass 

	{
		
		
			InputStreamReader isr = null;
		 static	BufferedReader buff = null;
			Admin_login mAdmin=null;
			Accountant mAccountant=null;
			
			
			public static void main(String[] args) throws Exception
			{
				
				MainClass mObject = new MainClass();

				mObject.isr = new InputStreamReader(System.in);
				mObject.buff = new BufferedReader(mObject.isr);

				System.out.println("Welcome to Fees Management SYSTEM\n");
				System.out.println("Enter your choice");
				System.out.println("1.Admin Login\n 2.Accountant");
				String mChoice = mObject.buff.readLine();

				String mOperationChoice, continueChoice;
				boolean transaction = true;
				

				String url="jdbc:mysql://localhost:3306/test";  
				
				String user="root";
				
				String password="12345";
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection(url,user,password);
				

				switch(Integer.parseInt(mChoice))
				{
				case 1: UserClass<Admin_login> obj = new UserClass<Admin_login>();
						obj.create(new Admin_login());
						mObject.mAdmin = obj.getInstance();
					
						
						
						String query="insert into test.admin_login_db values(?,?)";
						
						PreparedStatement preparedStatement=connection.prepareStatement(query);
												
						System.out.println("enter username");
						String name=buff.readLine();
						preparedStatement.setString(1,name);
						

						System.out.println("enter password");
						String pwd=buff.readLine();
						preparedStatement.setString(2,pwd);
						
						preparedStatement.executeUpdate();
						
						connection.close();
						
			do {
			System.out.println("SELECT  YOUR  Operation\n1. Add Account\n2. View Accountantt\n3. logout");
			mOperationChoice = mObject.buff.readLine();
									
			switch(Integer.parseInt(mOperationChoice)) {
			case 1: mObject.mAdmin.addAccountant(mObject.buff);
					break;						
			
			case 2: mObject.mAdmin.viewAccountant(mObject.buff);
					break;
			
			case 3: System.out.println("admin is logout");
					break;
	
			default: System.out.println("No Operation can be performed");
			}
		System.out.println("Do you Want to Continue\nYes\nNo");
		continueChoice = mObject.buff.readLine();
									
		if(continueChoice.equalsIgnoreCase("No"))
			transaction = false;
		}while(transaction);			
			break;

				case 2: UserClass<Accountant> obj1 = new UserClass<Accountant>();
						obj1.create(new Accountant());
						mObject.mAccountant = obj1.getInstance();
						
					
						do {
							System.out.println("SELECT  YOUR  Operation\n1. Add Student\n2.view Student"
									+ "\n3. editStudent\n4. dueFees\n 5. logout");
							
							mOperationChoice = mObject.buff.readLine();
							
							switch(Integer.parseInt(mOperationChoice)) 
							{
							case 1: mObject.mAccountant.addStudent(mObject.buff);
									break;
									
							case 2: mObject.mAccountant.viewStudent(mObject.buff);
									break;
							case 3: mObject.mAccountant.editStudent(mObject.buff);
									break;
							case 4:  mObject.mAccountant.dueFees(mObject.buff);
									break;
							case 5: System.out.println("student can be logout");
									break;
							default: System.out.println("No Operation Choice Selected");
							}
							System.out.println("Do you Want to Continue\nYes\nNo");
							continueChoice = mObject.buff.readLine();
							if(continueChoice.equalsIgnoreCase("No"))
								transaction = false;
					
						}while(transaction);
						break;
						
				default: System.out.println("No Choice of fee management system");
				}
			}	
		
}
