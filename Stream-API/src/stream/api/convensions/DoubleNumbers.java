package stream.api.convensions;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class DoubleNumbers {
    public static void printDoubleNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .map(n -> n * 2)
               .forEach(System.out::println);
    }
}
