import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzzRenderer {

    public List<String> render(LinkedHashMap<Integer, FizzBuzzValue> result) {
        List<String> list = new ArrayList<String>(result.size());
        for (Map.Entry<Integer, FizzBuzzValue> pair : result.entrySet()) {
            list.add(format(pair));
        }
        return list;

    }

    String format(Map.Entry<Integer, FizzBuzzValue> entry) {
        switch (entry.getValue()) {
            case FIZZ_BUZZ:
                return "FizzBuzz";
            case FIZZ:
                return "Fizz";
            case BUZZ:
                return "Buzz";
            case OTHER:
                return entry.getKey().toString();
            default:
                throw new IllegalStateException();
        }
    }
}
