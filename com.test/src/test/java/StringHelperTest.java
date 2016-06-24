import static org.junit.Assert.*;

import org.junit.Test;


public class StringHelperTest {
	
	@Test
	public void StringHelperReverseTest() {
		String testString = "Hei p� deg";
		assertEquals("ged �p ieH", StringHelper.reverse(testString));
	}
	
	@Test
	public void StringHelperReverseRecursionTest() {
		String testString = "Hei p� deg";
		assertEquals("ged �p ieH", StringHelper.reverseRecursion(testString));
	}

}
