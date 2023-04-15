/*Implement the classes for the following inheritance hierarchies. Create an interface “Shape” that contains methods ‘area’, ‘draw’, ‘rotate’, ‘move’ etc. 
 * Now create two classes “Circle” and “Rectangle” that implement this ‘Shape’ interface and implement the methods ‘area’, ‘move’, etc. Write a main() function to create two “Circle” and three “Rectangle”,then move them. 
 * Print the details of circles and rectangles before moving them */

package com.java;

public interface Shape {
	public double area();
	public void draw() ;
	public void rotate();
	public void move();
	
}
