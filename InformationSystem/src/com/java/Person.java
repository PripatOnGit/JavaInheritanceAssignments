
/*Implement a class for a “Person”. Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’, ‘address’ with proper reader/write methods etc. 
 * Now create two subclasses “Employee” and “Student”. Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ etc. 
 * Student has data members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’. Again create two subclasses “Technician” and “Professor” from Employee. 
 * Professor has data members ‘courses’, ‘listOfAdvisee’ and their add/remove methods. 
 * Write a main() function to demonstrate the creation of objects of different classes and their method calls. */

package com.java;
import java.util.Date;

public class Person {
	int age;
	int weight;
	float height;
	Date dob;
	String address;
	
	public Person(int age, int weight, float height, Date dob, String address) {
	
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dob = dob;
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}
