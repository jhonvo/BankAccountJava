package com.codingdojo.bankaccount;
import java.util.Random;

public class BankAccount {
	
	
	
	private double checkingBalance;
	private double savingsBalance;
	private int accountNumber;
	public static int accounts = 0;
	public static int accountsBalance = 0;
	
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.acctNum();
		accounts += 1;
	}

	private static int acctNum() {
		Random acctNum = new Random();
		int acct = acctNum.nextInt(1999999999);
		return acct;
	}
	
	// Getters
	
	public double getCheckingBalance() {
		System.out.println("The current checking balance is " + this.checkingBalance);
		return this.checkingBalance;
	}


	public double getSavingsBalance() {
		System.out.println("The current savings balance is " + this.checkingBalance);
		return this.savingsBalance;
	}
	
	public void getAccountDetails() {
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("The current checking balance is " + this.checkingBalance);
		System.out.println("The current savings balance is " + this.savingsBalance);
	}
	
	// Methods
	
	public void depositSavings(double amount) {
		this.savingsBalance += amount;
		accountsBalance += amount;
	}
	
	public void depositChecking(double amount) {
		this.checkingBalance += amount;
		accountsBalance += amount;
	}
	
	public void withdrawSavings(double amount) {
		if (this.savingsBalance > amount) {
			this.savingsBalance -= amount;
			accountsBalance -= amount;
			System.out.println("You have sucesfully withdrawn " + amount + " from your savings account.");
		}
		else {
			System.out.println("Your current balance is not sufficient.");
		}
	}
	
	public void withdrawChecking(double amount) {
		if (this.checkingBalance > amount) {
			this.checkingBalance -= amount;
			accountsBalance -= amount;
			System.out.println("You have sucesfully withdrawn " + amount + "from your checking account.");
		}
		else {
			System.out.println("Your current balance is not sufficient.");
		}
	}
	
	public static void bankBalance() {
		System.out.println("The current balance of all accounts is " + accountsBalance);
	}
	
	public static void accountsCount() {
		System.out.println("The total number of accounts is " + accounts);
	}
	

}
