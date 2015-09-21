package com.algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void test() {
		Factorial fact = new Factorial();
		assertEquals(120, fact.factorial(5));
		
		
	}

}
