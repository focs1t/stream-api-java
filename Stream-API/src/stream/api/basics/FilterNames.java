package stream.api.basics;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class FilterNames {
    public static void filterAndPrintNames() {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
