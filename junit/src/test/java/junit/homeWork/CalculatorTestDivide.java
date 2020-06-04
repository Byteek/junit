package junit.homeWork;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.Calculator;

@RunWith(TestRunner.class)
public class CalculatorTestDivide extends Assert {
	private Calculator calculator;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@After
	public void destroy() {
		calculator = null;
	}

	@Test
	public void testDivide() {
		assertTrue(calculator.getDivide(20, 2) == 10);
	}

}