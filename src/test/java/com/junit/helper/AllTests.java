package com.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArraysCompareTest.class, QuickBeforeAfterTest.class, StringHelperParameterizedBoolTest.class,
		StringHelperParameterizedTest.class, StringHelperTest.class })
public class AllTests {

}
