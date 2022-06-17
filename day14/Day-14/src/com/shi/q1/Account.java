package com.shi.q1;

public class Account {
	String accountNumber;
	double Balance;
	
	Account(String accountNumber){
        this.accountNumber=accountNumber;
    }

    void deposit(int amount){
        this.Balance=amount;
    }
    
    double  withdraw(int amount) throws InsufficientFundsException {
    	
        if(amount>=this.Balance)  {
            InsufficientFundsException i = new InsufficientFundsException("Insufficient Balance");
            throw i;
        }
        else {
           double r= this.Balance-amount;
           return r;
        }

    }

}
