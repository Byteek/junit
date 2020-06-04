package junit.homeWork.parameterizeTests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.Calculator;

@RunWith(value = Parameterized.class)
public class ParameterizeTestSum {

	private int valueA;
	private int valueB;
	private int expected;

	public ParameterizeTestSum(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}: SumOf ({0} * {1}) = {2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { 
			{ 2, 2, 4 }, 
			{ 2, 6, 8 }, 
			{ 4, 56, 60 }, 
			{ 66, 44, 110 }, 
			{ 6, 0, 6 } });

	}
	
	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getSum(valueA, valueB));
	}
}
