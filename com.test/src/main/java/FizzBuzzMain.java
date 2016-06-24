import java.util.List;

public class FizzBuzzMain {

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		
		FizzBuzzRenderer renderer = new FizzBuzzRenderer();
		List<String> list = renderer.render(fb.calculaterNumbers());
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
