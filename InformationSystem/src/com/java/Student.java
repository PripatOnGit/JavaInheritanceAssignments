package com.java;

import java.util.Date;

public class Student extends Person {
	int rollNo;
	String[] listOfSubject;
	int[] marks;
	
	public Student(int age, int weight, float height, Date dob, String address, int rollNo, String[] listOfSubject,
			int[] marks) {
		super(age, weight, height, dob, address);
		this.rollNo = rollNo;
		this.listOfSubject = listOfSubject;
		this.marks = marks;
	}

	public void calcGrade() {
		
	}
}
