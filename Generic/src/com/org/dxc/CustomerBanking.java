package com.org.dxc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class MyBankClass <T> {
	T obj;
	
	void create(T obj) {
		this.obj = obj;
	}
	
	T getInstance() {
		return obj;
	}
}


public class CustomerBanking 
{
	
	InputStreamReader isr = null;
	BufferedReader buff = null;
	ICICI mICICI = null;
	HDFC mHDFC = null;1
	AXIS mAxis = null;
	
	public static void main(String[] args) throws Exception
	{
		
CustomerBanking mObject = new CustomerBanking();
		
		mObject.isr = new InputStreamReader(System.in);
		mObject.buff = new BufferedReader(mObject.isr);
		
		System.out.println("Welcome to INDIAN BANKING SYSTEM\n");
		System.out.println("SELECT  YOUR BANK\n1. ICICI\n2. HDFC\n3. AXIS");
		String mBankChoice = mObject.buff.readLine();
		
		switch(Integer.parseInt(mBankChoice))
		{
		case 1: MyBankClass<ICICI> obj = new MyBankClass<ICICI>();
				obj.create(new ICICI());
				mObject.mICICI = obj.getInstance();
				break;
		
		case 2: MyBankClass<HDFC> obj1 = new MyBankClass<HDFC>();
				obj1.create(new HDFC());
				mObject.mHDFC = obj1.getInstance();
				break;
		
		case 3: MyBankClass<AXIS> obj2 = new MyBankClass<AXIS>();
				obj2.create(new AXIS());
				mObject.mAxis = obj2.getInstance();
				break;
		
		default: System.out.println("No Choice of Bank Done");
		}
		
		mObject.buff = new BufferedReader(mObject.isr);
	}	


		
	}

