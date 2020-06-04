package junit.homeWork.parameterizeTests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.Calculator;

@RunWith(value = Parameterized.class)
public class ParameterizeTestDivide {

	private int valueA;
	private int valueB;
	private int expected;

	public ParameterizeTestDivide(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: DivideOf ({0} / {1}) = {2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { 
			{ 1, 1, 1 }, 
			{ 6, 2, 3 }, 
			{ 1000, 100, 10 }, 
			{ 250*15, 15, 250 }, 
			{ 33, 11, 3 } });

	}
	
	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getDivide(valueA, valueB));
	}
}
