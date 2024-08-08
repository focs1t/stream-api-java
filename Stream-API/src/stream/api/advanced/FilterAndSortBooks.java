package stream.api.advanced;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Maresev
 */
public class FilterAndSortBooks {
    public static void printFilterAndSortBooks() {
        List<String> books = Arrays.asList("Java", "Python", "C", "JavaScript", "Go");
        books.stream()
             .filter(book -> book.length() >= 5)
             .sorted((b1, b2) -> b2.compareTo(b1)) // Reverse order
             .forEach(System.out::println);
    }
}
