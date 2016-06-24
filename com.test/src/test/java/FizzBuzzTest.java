import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {
	
	private FizzBuzz fb;
	
	@Before
	public void setUp() {
		fb = new FizzBuzz();
	}

	@Test
	public void findValueFizzTest() {
		assertEquals(FizzBuzzValue.FIZZ, fb.findValue(3));
		assertEquals(FizzBuzzValue.FIZZ, fb.findValue(6));	
	}
	
	@Test
	public void findValueBuzzTest() {
		assertEquals(FizzBuzzValue.BUZZ, fb.findValue(5));
		assertEquals(FizzBuzzValue.BUZZ, fb.findValue(10));			
	}
	
	@Test
	public void findValueFizzBuzzTest() {
		assertEquals(FizzBuzzValue.FIZZ_BUZZ, fb.findValue(15));
		assertEquals(FizzBuzzValue.FIZZ_BUZZ, fb.findValue(30));	
	}
	
	@Test
	public void findValueOtherTest() {
		assertEquals(FizzBuzzValue.OTHER, fb.findValue(2));
		assertEquals(FizzBuzzValue.OTHER, fb.findValue(7));
	}
	
	@Test
	public void calculateNumberTest() {
		Map<Integer, FizzBuzzValue> result = fb.calculaterNumbers();
		assertEquals(FizzBuzzValue.OTHER, result.get(1));
		assertEquals(FizzBuzzValue.FIZZ, result.get(9));
		assertEquals(FizzBuzzValue.BUZZ, result.get(100));
		assertEquals(FizzBuzzValue.FIZZ_BUZZ, result.get(60));		
	}
	

}
