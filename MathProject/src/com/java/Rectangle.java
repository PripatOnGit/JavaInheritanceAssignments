package com.java;

public class Rectangle implements Shape {
	float height;
	float lenght;
	double r_area;
	
	Rectangle(float height, float lenght){
		this.height = height;
		this.lenght = lenght;
	}
	
	public double area() {
		r_area = this.height * this.lenght;
		return r_area;
	}
	public void move() {
		
	}
	public void rotate() {}
	public void draw() {}

	
}
