package stream.api.convensions;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class SortCities {
    public static void sortAndPrintCities() {
        List<String> cities = Arrays.asList("Paris", "London", "New York", "Tokyo");
        cities.stream()
              .sorted()
              .forEach(System.out::println);
    }
}
