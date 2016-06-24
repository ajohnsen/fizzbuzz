
public class StringHelper {
	
	public static String reverse(String input) {
		String newString = "";
		for(int i = 1; i <= input.length(); i++) {
			newString = newString + input.charAt(input.length() - i);
		}
		
		return newString;
	}
	
	public static String reverseRecursion(String input) {
		if(input.length() == 1) return input;
		return reverseRecursion(input.substring(1)) + input.charAt(0);
	}

}
