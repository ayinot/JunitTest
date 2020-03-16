package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12,3,5,1};
		int[] expected = {1,3,5,12};
		
		Arrays.parallelSort(numbers);
		assertArrayEquals(expected,numbers);
		
 	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.parallelSort(numbers);
	}

}
