package stream.api.basics;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class StreamBasics {
    public static void streamAndPrintBasics() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().forEach(System.out::println);
    }
}
