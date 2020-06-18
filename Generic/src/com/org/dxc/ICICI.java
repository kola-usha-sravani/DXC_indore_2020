package com.org.dxc;

import java.io.BufferedReader;

public class ICICI  implements RBI
{

	private char[] sName;
	private char[] email;
	private char[] phoneNumber;

	@Override
	public ICICI openAccount(BufferedReader buff) {
		ICICI mICICI=new ICICI();
			String sName="Raja";
			String email="raja@523";
			String phoneNumber="9876543210";
			System.out.println(mICICI.sName);
			System.out.println(mICICI.email);
			System.out.println(mICICI.phoneNumber);
			return mICICI;
	}

	@Override
	public void deposit(BufferedReader buff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawl(BufferedReader buff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openFD(BufferedReader buff) {
		// TODO Auto-generated method stub
		
	}

}
