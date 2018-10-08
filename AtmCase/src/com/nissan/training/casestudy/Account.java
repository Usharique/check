package com.nissan.training.casestudy;



public abstract class Account {
   protected int acc_num;
   protected int balance;
   
   
   
	public int getAcc_num() {
	return acc_num;
}
	
public void setAcc_num(int acc_num) {
	this.acc_num = acc_num;
}

public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

	abstract void withdraw();
	abstract void deposit();
	
	void createTransaction() {
		System.out.println("transaction successfull...");
	}
}
