package com.codingdojo.bankaccount;

public class Users extends BankAccount{
	
	private String name;
	
	public Users(String name){
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Account owner: " + this.name);
		super.getAccountDetails();
	}

}
