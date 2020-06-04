package junit.parameterizeTests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.Calculator;

@RunWith(value = Parameterized.class)
public class ParameterizeTestMultiple {

	private int valueA;
	private int valueB;
	private int expected;

	public ParameterizeTestMultiple(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: MultipleOf ({0} * {1}) = {2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { 
			{ 33, 33, 1089 }, 
			{ 2, 6, 12 }, 
			{ 56, 1, 56 }, 
			{ 555, 563, 312465}, 
			{ 11, 9, 99 } });

	}
	
	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getMultiple(valueA, valueB));
	}
}
