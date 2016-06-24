import static org.junit.Assert.*;

import org.junit.Test;

public class ValueTest {

	@Test
	public void checkNumberFizzTest() {
		assertEquals(true, FizzBuzzValue.FIZZ.isDevisibleBy(3));
		assertEquals(false, FizzBuzzValue.FIZZ.isDevisibleBy(4));
	}

	@Test
	public void checkNumberBuzzTest() {
		assertEquals(false, FizzBuzzValue.BUZZ.isDevisibleBy(6));
		assertEquals(true, FizzBuzzValue.BUZZ.isDevisibleBy(5));
	}

	@Test
	public void checkNumberFizzBuzzTest() {
		assertEquals(true, FizzBuzzValue.FIZZ_BUZZ.isDevisibleBy(15));
		assertEquals(false, FizzBuzzValue.FIZZ_BUZZ.isDevisibleBy(17));
	}

	@Test
	public void checkNumberOtherTest() {
		assertEquals(true, FizzBuzzValue.OTHER.isDevisibleBy(2));

	}

}
