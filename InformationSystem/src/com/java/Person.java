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
