package com.java;

public class BankAccount {
	int accountNumber;
	float balance;
	String holderName;
	
	public BankAccount(int accountNumber, float balance, String holderName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.holderName = holderName;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public float showBalance() {
		return 0f;
	}
	public float addBal(float r) {
		balance += r;
		return balance;
	}
	public float withdrawBal(float r) {
		balance -= r;
		return balance;
	}
	
	public void showDetails() {
		System.out.println(this.accountNumber+" "+this.holderName+" "+this.balance);
	}

	
	
}
