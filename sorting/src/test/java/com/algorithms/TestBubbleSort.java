package com.algorithms;

import static junit.framework.Assert.*;
import org.junit.Test;

public class TestBubbleSort {
	@Test
	public void test() {
		int[] arr = { 3, 2, 1, 5, 4};
		int[] exp = {1, 2, 3, 4, 5};
		BubbleSort bs = new BubbleSort();
		int[] actual = bs.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			assertEquals(exp[i], actual[i]);
		}
	}
}