package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;


public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testNewline() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegativeNumbers() {
		assertEquals(3, Calculator.add("-3,-2,-1,9"));
	}
	@Test
	public void testIgnoreBigNumbers() {
		assertEquals(15, Calculator.add("1004,1677,5,10"));
	}

	@Test
	public void testDelimeteredNumbers() {
		assertEquals(10, Calculator.add("//xxxx\n3xxxx7"));
	}
}