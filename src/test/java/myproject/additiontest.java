package myproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class additiontest {
	@Test
	public void testAdd() {
	assertEquals(3, addition.add(1, 2));
	}
	public void testDiv() {
	assertEquals(1, addition.div(3, 2));
		 }

}
