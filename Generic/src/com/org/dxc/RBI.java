package com.org.dxc;

import java.io.BufferedReader;

public interface RBI 
{
	
	public int ROI = 3;
	public int MIN_FD_AMOUNT = 500;

	public int MIN_BAL = 1000;
	
	public void openAccount(BufferedReader buff);
	public void deposit(BufferedReader buff);
	public void withdrawl(BufferedReader buff);
	public void openFD(BufferedReader buff);

}


