package com.yash;

import java.util.Scanner;

public class UserRegistration {

	String username;
	String userCountry;
	
	
//	public UserRegistration(String username, String userCountry) {
//		super();
//		this.username = username;
//		this.userCountry = userCountry;
//		
//	}
	
	public void registerUsers(String username,String userCountry) throws InvalidCountryException {
	

		if(userCountry.equals("India")) {
		
			System.out.println("User registration done successfully");
		}
		else{
		
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
		     throw ice;
		
		}
	}
	
	public static void main(String[] args) {
		
		
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter Your Name");
		 
		 String name = scan.next();
		 
		 System.out.println("Enter Your Country");
		 
		 String country = scan.next();
		 
		 UserRegistration k1 = new UserRegistration();
//		 k1.checkDetails(name, country);
		 try {
			 k1.registerUsers(name, country);
		 }
		 catch(InvalidCountryException ice) {
			 System.out.println(ice.getMessage());
		 }
	}
}
