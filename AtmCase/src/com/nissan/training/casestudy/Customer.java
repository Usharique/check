package com.nissan.training.casestudy;

public class Customer {

	String name="Umer";
	String address;
	int dob;
	int cardNumber=1234567;
	int pin=1234;
	Boolean b=false;
	Boolean c=false;
	void verifyUser(int user){
		try {
		if(this.cardNumber==user)
		{
			System.out.println("user verified");
			b=true;
		}
		else {
			System.out.println("wrong credentials");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	void verifyPassword(int p) {
		try {
		if(this.pin==p)
		{
			System.out.println("pin verified");
			c=true;
		}
		else {
			System.out.println("wrong pin");
		}
		
	}catch(Exception e) {
		System.out.println(e);
	}	
		}
	
}
