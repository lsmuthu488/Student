package com.std2.org;

public class Liablity extends LiablityFixed

{

@Override
public void savingsAccount() {

	System.out.println("Savings Account Interest rate is 6.5%");
	
	
}	

	public static void main(String[] args) {
		
		Liablity lb = new Liablity();
	lb.savingsAccount();
	lb.currentAccount();
	lb.premiumCurrent();
		
		
		
		
	}
	
}
