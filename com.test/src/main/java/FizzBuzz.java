import java.util.LinkedHashMap;


public class FizzBuzz {
	
	private static final int START_NUMBER = 1;
	private static final int END_NUMBER = 100;

	public LinkedHashMap<Integer, FizzBuzzValue> calculaterNumbers() {
		final int SIZE = END_NUMBER-START_NUMBER+1;
		LinkedHashMap<Integer, FizzBuzzValue> result = new LinkedHashMap<Integer, FizzBuzzValue>(SIZE);
		
		for(int i = START_NUMBER; i <= END_NUMBER; i++) {
			result.put(i, findValue(i));
		}	
		return result;
	}
	
	FizzBuzzValue findValue(int number) {
		for(FizzBuzzValue value : FizzBuzzValue.values()) {
			if(value.isDevisibleBy(number)) return value;
		}
		return FizzBuzzValue.OTHER;
		
	}
}
