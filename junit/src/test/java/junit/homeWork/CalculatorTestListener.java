package junit.homeWork;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {

	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println("Completed execution method : " + description.getMethodName());
	}
	
}
