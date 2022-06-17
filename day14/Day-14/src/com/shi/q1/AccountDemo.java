package com.shi.q1;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account ac=new Account("9123663125");

        try {
            ac.deposit(1000);

            double net= ac.withdraw(4000);
            
            System.out.println("The net balance is: "+net);

        }
        catch (InsufficientFundsException in) {
        	
            System.out.println(in.getMessage());
        }
        catch (Exception e) {
        	
            System.out.println(e);
        }
        System.out.println("The account number is: "+ ac.accountNumber);

	}

}
