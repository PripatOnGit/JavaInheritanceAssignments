package com.java;
import java.util.Date;

public class Professor extends Employee {
	String[] courses = new String[30];
	String[] listOfAdvisee;
	int temp;
	
	public Professor(int age, int weight, float height, Date dob, String address, int salary, Date doj, int exp,
			String[] courses, String[] listOfAdvisee) {
		super(age, weight, height, dob, address, salary, doj, exp);
		for(int i=0;i<courses.length;i++) {
			this.courses[i] = courses[i];
			temp++;
		}
		this.listOfAdvisee = listOfAdvisee;
		System.out.println("Professor created!");
	}
	
	public void addCourses(String course) {
		courses[temp] = course;
		System.out.println("Course "+course+ " is added!!");
		temp++;
	}
	
	public void removeCourses(String course) {
		for(int i=0;i<temp;i++) {
			if(courses[i] != course) {
				continue;
			}else {
				for(int j=i+1;j<temp;j++) {
					courses[j-1]=courses[j];
				}
			}break;
		}
		System.out.println("Course deleted");
		temp--;
	}
	
	public void printCourses() {
		for(int i=0;i<temp;i++) {
			System.out.println(""+courses[i]);
		}
	}
	
	public String toString() {
		return "p1 added "+this.age+" "+this.address+" "+String.join(" ",this.courses);
	}

	public void addAdvisee() {}
	public void removeAdvisee() {}
	
	
}
