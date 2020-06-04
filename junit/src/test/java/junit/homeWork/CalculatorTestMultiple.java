package junit.homeWork;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.Calculator;

public class CalculatorTestMultiple extends Assert {
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
	  public void testMultiple() {
	    assertEquals(10, calculator.getMultiple(2, 5));
	  }
	  
	}