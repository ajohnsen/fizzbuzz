import static org.junit.Assert.*;

import org.junit.Test;


public class StringHelperTest {
	
	@Test
	public void StringHelperReverseTest() {
		String testString = "Hei på deg";
		assertEquals("ged åp ieH", StringHelper.reverse(testString));
	}
	
	@Test
	public void StringHelperReverseRecursionTest() {
		String testString = "Hei på deg";
		assertEquals("ged åp ieH", StringHelper.reverseRecursion(testString));
	}

}
