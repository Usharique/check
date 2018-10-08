package com.nissan.training.casestudy;

import java.util.Scanner;
 
public class Working {

	public static void main(String[] args) {
		int acc;
		int pin;
		int choice;
		
		System.out.println("Welcome \n 1.Admin 2. Customer");
		@SuppressWarnings("resource")
		Scanner rc=new Scanner(System.in);
		choice=rc.nextInt();
		if(choice==1) {
			Bank b=new Bank();
			b.work();
		}
		else if(choice==2) {
			
		try {
		System.out.println("Welcome \nEnter the Card number");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		acc=sc.nextInt();
		Customer c = new Customer();
		c.verifyUser(acc);
		if(c.b==true)	
		{
		System.out.println("enter pin to verify");
		pin=sc.nextInt();
		c.verifyPassword(pin);
		
		}

		if(c.c==true) {
			
		System.out.println("1. Withdraw 2. Deposit");	
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println("1.Current 2. Savings");
			pin=sc.nextInt();
			if(pin==1) {
				CurrentAccount ca=new CurrentAccount();
				ca.withdraw();
			}
			else if(pin==2) {
				SavingAccount sa=new SavingAccount();
				sa.withdraw();
			}
		}
		else if(choice==2) {
			System.out.println("1.Current 2. Savings");
			pin=sc.nextInt();
			if(pin==1) {
				CurrentAccount ca=new CurrentAccount();
				ca.deposit();
			}
			else if(pin==2) {
				SavingAccount sa=new SavingAccount();
				sa.deposit();
			}
		}
		
		else {
			System.out.println("invalid choice");
		}
		}
		
	}catch(Exception e) {
		System.out.println(e);
	}
		}
	}
}
