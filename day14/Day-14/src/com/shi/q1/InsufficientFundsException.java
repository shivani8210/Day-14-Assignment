package com.shi.q1;

public class InsufficientFundsException extends Exception{
	String message;
	InsufficientFundsException(String message) {
		super(message);
	}
}
