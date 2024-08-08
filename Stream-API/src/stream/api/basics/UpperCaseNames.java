package stream.api.basics;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class UpperCaseNames {
    public static void UpperCaseAndPrintNames() {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        fruits.stream()
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}
