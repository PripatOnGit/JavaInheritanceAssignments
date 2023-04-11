package com.java;

import java.util.Date;
public class Main {
	
	public static void main(String[] args) {
		
		Date d1 = new Date(2000, 11, 21);
		Date d2 = new Date(2023, 1, 5);
		String[] courses = new String[]{"ABC","CDF","TRH"};
		String[] listOfAdvisee = new String[] {"APO","GFH","KLJ"};
		Professor p1 = new Professor(20, 60, 5.4f, d1, "Mumbai", 100,d2, 6, courses ,listOfAdvisee);
		System.out.println(p1.toString());
		p1.addCourses("Hindi");
		p1.addCourses("English");
		p1.addCourses("Biology");
		//    p1.removeCourses("Biology");
		p1.printCourses();
	}
}
