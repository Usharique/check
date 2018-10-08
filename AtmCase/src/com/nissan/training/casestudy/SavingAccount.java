package com.nissan.training.casestudy;

import java.util.Scanner;


public class SavingAccount extends Account {
  
	SavingAccount(){
		   this.balance=1500;
	   }
	
	
	int input;
	int w;
	@Override
	void withdraw() {
		System.out.println("Enter the amount:");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		input=sc.nextInt();
		//System.out.println(input);
		balance=this.balance-input;
		AtmTransactions at=new AtmTransactions();
		w=at.newTransaction();
		System.out.println("Balance in your account: "+balance);
		System.out.println("Transaction id:"+w);
	}

	@Override
	void deposit() {
		System.out.println("Enter the amount:");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		System.out.println(input);
		balance=this.balance+input;
		AtmTransactions at=new AtmTransactions();
		w=at.newTransaction();
		System.out.println("Balance in your account: "+balance);
		System.out.println("Transaction id:"+w);
		
	}

	
}
