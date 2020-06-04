package junit.homeWork;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.Calculator;

public class CalculatorTestSum extends Assert{
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
	  public void testSum() {
	    assertEquals(88, calculator.getSum(44, 44));
	  }
	  
	}