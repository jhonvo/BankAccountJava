package com.codingdojo.banktest;
import com.codingdojo.bankaccount.Users;

public class BankAccountTest {
	
	public static void main (String args[]) {
		
		Users jhon = new Users("Jhon");
		Users alex = new Users("Alex");
		
		alex.depositSavings(100);
		
		alex.depositChecking(50);
		
		alex.withdrawChecking(60);
		
		alex.withdrawSavings(60);
		
		alex.printDetails();
		
		jhon.depositChecking(110);
		
		Users.bankBalance();
		
		Users.accountsCount();
		
	}

}
