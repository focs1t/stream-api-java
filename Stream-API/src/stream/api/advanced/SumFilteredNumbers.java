package stream.api.advanced;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class SumFilteredNumbers {
    public static void sumAndPrintFilteredNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8);
        int sum = numbers.stream()
                         .filter(n -> n > 5)
                         .mapToInt(Integer::intValue)
                         .sum();
        System.out.println(sum);
    }
}
