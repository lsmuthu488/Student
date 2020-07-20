package com.std2.org;

public abstract class LiablityFixed extends LiablityCurrent
{

	@Override
	public void currentAccount() {

		
		System.out.println("Current Account Interest rate is zero");
	}
	
	public abstract void savingsAccount();	
	
}
