package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateInFirstPositions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));	
	}

	@Test
	public void testTruncateInFirstPositions2() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testLastAndFirstCharacterSame() {
		assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testLastAndFirstCharacterNotSame() {
		assertNotEquals(true,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testLastAndFirstCharacterNotSameNegtiveCaseSingleChar() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testNonCharater() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("-"));
	}

}
