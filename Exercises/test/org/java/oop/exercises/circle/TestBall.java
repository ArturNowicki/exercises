package org.java.oop.exercises.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBall {

	private static final double DELTA = 1e-15;

	@Test
	public void testBall1() {
		Ball testBall1 = new Ball(5.,8.);
		assertEquals(5, testBall1.getX(),DELTA);
		assertEquals(8, testBall1.getY(),DELTA);
	}

	@Test
	public void testBall2() {
		Ball testBall2 = new Ball();
		assertEquals(0, testBall2.getX(),DELTA);
		assertEquals(0, testBall2.getY(),DELTA);
	}
	@Test
	public void testSetXSetY() {
		Ball testBall3 = new Ball();
		testBall3.setX(4.);
		testBall3.setY(6.);
		assertEquals(4, testBall3.getX(),DELTA);
		assertEquals(6, testBall3.getY(),DELTA);
	}
	@Test
	public void testSetXY() {
		Ball testBall4 = new Ball();
		testBall4.setXY(1,8);
		assertEquals(1, testBall4.getX(),DELTA);
		assertEquals(8, testBall4.getY(),DELTA);
	}

	@Test
	public void testMove() {
		Ball testBall5 = new Ball(3,7);
		testBall5.move(3.,0.5);
		assertEquals(6, testBall5.getX(),DELTA);
		assertEquals(7.5, testBall5.getY(),DELTA);
	}
	
	@Test
	public void testToString() {
		Ball testBall6 = new Ball(4.2,6);
		assertEquals("Ball @ (4.2,6.0)", testBall6.toString());
	}
}
