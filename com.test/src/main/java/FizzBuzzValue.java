import java.util.Arrays;
import java.util.List;

public enum FizzBuzzValue {
	/**
	 * Order is important. FIZZ_BUZZ has to be checked first.
	 */
	
	FIZZ_BUZZ(3, 5), FIZZ(3), BUZZ(5), OTHER;

	private List<Integer> values;

	FizzBuzzValue(Integer... values) {
		this.values = Arrays.asList(values);
	}

	public boolean isDevisibleBy(int number) {
		for (Integer i : values) {
			if (number % i.intValue() != 0)
				return false;
		}

		return true;
	}
}
