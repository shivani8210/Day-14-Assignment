package com.shi.q2;

import java.util.Scanner;

public class UserRegistration {
	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		
        if(userCountry.equals("India")) {
        	
            System.out.println("User registration done successfully");
            
        }
        else {
        	
            InvalidCountryException i =new InvalidCountryException("User outside India cannot be registered");
            
            throw i;
        }
	}
	public static void main(String[] args) {
		UserRegistration user=new UserRegistration();

        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter user Name");
            String name=sc.next();
            System.out.println("Enter your country");
            String country=sc.next();
            user.registerUser(name,country);
        }
        catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

	}

}
