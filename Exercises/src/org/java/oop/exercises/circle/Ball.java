package org.java.oop.exercises.circle;

public class Ball {
	
	double x = 0.0;
	double y = 0.0;

	public Ball(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ball() {
	}

	public void move(double dX, double dY) {
		x+=dX;
		y+=dY;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Ball @ ("+x+","+y+")";
	}

}
