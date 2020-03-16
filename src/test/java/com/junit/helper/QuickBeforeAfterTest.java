package com.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	StringHelper helper;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	
	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test1 executed");
	}
	
	@After
	public void teardown() {
		System.out.println("After test");
	}

}
