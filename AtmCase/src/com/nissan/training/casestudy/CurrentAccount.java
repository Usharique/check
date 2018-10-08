package com.nissan.training.casestudy;

import java.util.Scanner;

public class CurrentAccount extends Account {

	CurrentAccount(){
		   this.balance=1500;
	   }
	
	int input2;
	int w;
	@Override
	void withdraw() {
		System.out.println("Enter the amount:");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		input2=sc.nextInt();
		//System.out.println(input2);
		balance=this.balance-input2;
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
		input2=sc.nextInt();
		System.out.println(input2);
		balance=this.balance+input2;
		AtmTransactions at=new AtmTransactions();
		w=at.newTransaction();
		System.out.println("Balance in your account: "+balance);
		System.out.println("Transaction id:"+w);
		
	}

	
	
}
