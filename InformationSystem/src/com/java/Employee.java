package com.java;

import java.util.Date;

public class Employee extends Person {
	int salary;
	Date doj;
	int exp;
	
	public Employee(int age, int weight, float height, Date dob, String address, int salary, Date doj, int exp) {
		super(age, weight, height, dob, address);
		this.salary = salary;
		this.doj = doj;
		this.exp = exp;
	}
	 
	
	
}
