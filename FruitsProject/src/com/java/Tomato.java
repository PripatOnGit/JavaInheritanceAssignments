package com.java;

public class Tomato implements Fruit,Vegetable {

	@Override
	public void hasAPeel() {
		System.out.println("has a Peel");
	}

	@Override
	public void hasARoot() {
		System.out.println("has a Root");
	}
	
	public static void main(String [] args) {
		Tomato t1 = new Tomato();
		t1.hasAPeel();
		t1.hasARoot();
	}
}
