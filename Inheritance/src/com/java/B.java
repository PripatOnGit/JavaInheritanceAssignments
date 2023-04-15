package com.java;

public class B extends A {
	B(){
		super();
	}
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		B b1 = new A();
	}
}
