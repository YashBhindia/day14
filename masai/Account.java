package com.masai;

public class Account  {

	 String accountNumber;
	 double Balance;
	 
	 public void deposit(int amount) {
		
		 Balance = Balance+amount;
	 }
	 
	 
	 
	 public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		Balance = balance;
	}

	public void withdraw(double amount)throws InsufficientFundException  {
		 
		
			 if(amount<=Balance) {
				 System.out.println("your money is withdraw:"+amount); 
			 } 
		 
			 else{
			
			InsufficientFundException ae = new InsufficientFundException("Insufficient Balance");
			throw ae;
		} 
		
			 
		
	 }
}
