package stream.api.convensions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
/**
 *
 * @author Maresev
 */
public class AverageAge {
    public static void printAverageAge() {
        List<Integer> ages = Arrays.asList(22, 25, 30, 45, 50);
        OptionalDouble average = ages.stream().mapToInt(Integer::intValue).average();
        average.ifPresent(System.out::println);
    }
}
