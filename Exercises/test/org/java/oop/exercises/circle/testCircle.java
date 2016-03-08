package org.java.oop.exercises.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCircle {

	private static final double DELTA = 1e-15;
	@Test // first constructor 
	public void testDefCircle1() {
		Circle testCircle1 = new Circle();
//		test getColor, getRadius and getArea
		assertEquals("red",testCircle1.getColor());
		assertEquals(1,testCircle1.getRadius(),DELTA);
		assertEquals(2*Math.PI*1, testCircle1.getArea());
//		test setRadius and setColor
		testCircle1.setRadius(4);
		testCircle1.setColor("yellow");
		assertEquals(4, testCircle1.getRadius(),DELTA);
		assertEquals("yellow", testCircle1.getColor());
//		test toString method
		assertEquals("This is yellow circle of radius 4.0 and area " + 2*Math.PI*4 + ".",testCircle1.toString());
	}

	@Test // second constructor
	public void testDefCircle2() {
		Circle testCircle2 = new Circle(3.2);
		assertEquals(3.2,testCircle2.getRadius(),DELTA);
		assertEquals("red",testCircle2.getColor());
	}

	@Test // third constructor
	public void testDefCircle3() {
		Circle testCircle3 = new Circle(5, "blue");
		assertEquals(5,testCircle3.getRadius(),DELTA);
		assertEquals("blue",testCircle3.getColor());
	}
}
