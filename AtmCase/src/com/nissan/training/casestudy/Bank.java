package com.nissan.training.casestudy;

import java.util.Scanner;

public class Bank {

	int code=684;
	String address;
	int r;
	String fetch1;
	String fetch2;
	void work(){
		System.out.println("Welcome Admin");
		System.out.println("1. Atm details 2.tranactions");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		if(r==1)
		{
			ATM atm=new ATM();
			fetch1=atm.getLocation();
			fetch2=atm.getManagedBy();
			System.out.println("Atm details:\n Location: "+fetch1+" Managed by: "+fetch2);
		}
		else if(r==2){
			System.out.println("Transactions not available");
		}
		
	}
	
}
