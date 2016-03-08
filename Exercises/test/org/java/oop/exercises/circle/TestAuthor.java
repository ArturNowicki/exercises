package org.java.oop.exercises.circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAuthor {

	@Test
	public void testAuthor() {
		Author testAuthor1 = new Author("Artur Nowicki", "anowicki@iopan.gda.pl", 'm');
		assertEquals("Artur Nowicki (m) at anowicki@iopan.gda.pl", testAuthor1.toString());
		testAuthor1.setEmail("arturnowicki@gmail.com");
		assertEquals("arturnowicki@gmail.com", testAuthor1.getEmail());
	}
	
	@Test
	public void testGetters() {
		Author testAuthor2 = new Author("Przemek Makuch", "pmakuch@iopan.gda.pl", 'm');
		assertEquals("Przemek Makuch", testAuthor2.getName());
		assertEquals('m', testAuthor2.getGender());
	}
}
