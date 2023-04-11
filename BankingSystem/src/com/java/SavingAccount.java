package com.java;

public class SavingAccount extends BankAccount{
	float interestRate;
	
	public SavingAccount(int accountNumber, float balance, String holderName, float rate) {
		super(accountNumber, balance, holderName);
		interestRate = rate;
	}
	public void showDetails() {
		
		System.out.println(this.accountNumber+" "+this.holderName+" "+this.balance+" "+this.interestRate);
	}
	
	public float yearlyInterest() {
		float interestPaid = this.balance * this.interestRate  * 1;
		return interestPaid;
	}
	
}
 