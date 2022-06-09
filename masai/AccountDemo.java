package com.masai;

public class AccountDemo {

	public static void main(String[] args) {
		
	    
		try {
			Account ac = new Account("SBI12345",1000);
			ac.withdraw(10000);
			
		}
		catch(InsufficientFundException ae) {
			System.out.println(ae.getMessage());
		}
		
		
		
	}
}
