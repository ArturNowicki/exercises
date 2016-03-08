package org.java.oop.exercises.circle;

public class Circle {

//	fields
	private double radius;
	private String color;
	
	
//	constructors
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	public Circle(double r) {
		this.radius = r;
		this.color = "red";
	}
	public Circle(double r, String inColor) {
		this.radius = r;
		this.color = inColor;
	}

//	getters and setters
	public String getColor() {
		return color;
	}
	public double getRadius() {
		return radius;
	}
	public Object getArea() {
		return 2*Math.PI*radius;
	}
	public void setRadius(double r) {
		this.radius = r;
		
	}
	public void setColor(String inColor) {
		this.color = inColor;
		
	}

	public String toString() {
		return "This is " + color + " circle of radius " + radius + " and area " + 2*Math.PI*radius +".";
	}
}
