package com;

public class Account {
	
private static Account a;	
	
	
	
	private Account() {
		System.out.println("create account");
	}
public static void  createobj() {
	if(a==null)
	a=new Account();
	else {
		System.out.println("already account is created");
	}
}
}