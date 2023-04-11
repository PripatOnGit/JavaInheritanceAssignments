package com.java;

public class Manager {
	BankAccount[] ba = new BankAccount[10];
	int size;
	
	public void addAccount(SavingAccount sa) {
			ba[size] = sa;
			System.out.println("Account added!! ");
			size++;
	}
	public void addAccount(CurrentAccount ca) {
			ba[size] = ca;
			System.out.println("Account added!! ");
			size++;
	}
	
	public void calcInterestRate() {
		
	}
	
	public void showAccount() {
		for(int i=0;i<size;i++) {
			ba[i].showDetails();
		}
	}
	
	public static void main(String[] args) {
		Manager m1 = new Manager();
		
		SavingAccount s1 = new SavingAccount(1,1000,"Priyanka",7.0f);
		SavingAccount s2 = new SavingAccount(2,1500,"Abhijeet",8.0f);
		SavingAccount s3 = new SavingAccount(3,1000,"Arjun",9.0f); 
		
		CurrentAccount c1 = new CurrentAccount(1,1000,"Asha");
		CurrentAccount c2 = new CurrentAccount(2,5000,"Ratna");
		CurrentAccount c3 = new CurrentAccount(3,3000,"Manisha");
		
		m1.addAccount(s1);
		m1.addAccount(s2);
		m1.addAccount(s3);
		m1.addAccount(c1);
		m1.addAccount(c2);
		m1.addAccount(c3);
		System.out.println("----------------------------------------");
		m1.showAccount();
		System.out.println("----------------------------------------");
		System.out.println("Interst Paid by Saving Account s"+s1.accountNumber +" : "+ s1.yearlyInterest());
		
	}
}
