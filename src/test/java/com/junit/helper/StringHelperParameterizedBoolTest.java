package com.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedBoolTest {

	StringHelper helper = new StringHelper();

	private String input;
	private boolean expectedOutput;


	public StringHelperParameterizedBoolTest(String input, boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection testConditions(){
		Object expectedOutputs[][] = {
				{"ABAB",true},
				{"A",false},
				{"-",false}};

		return Arrays.asList(expectedOutputs);
	}



	@Test
	public void testLastAndFirstCharacterNotSame() {
		assertEquals(expectedOutput,helper.areFirstAndLastTwoCharactersTheSame(input));
	}

}
