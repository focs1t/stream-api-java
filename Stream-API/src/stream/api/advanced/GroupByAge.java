package stream.api.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author Maresev
 */
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class GroupByAge {
    public static void groupAndPrintByAge() {
        List<Person> people = Arrays.asList(
            new Person("Alice", 18),
            new Person("Bob", 25),
            new Person("Charlie", 30),
            new Person("David", 22),
            new Person("Eva", 29)
        );

        Map<String, Long> groupedByAge = people.stream()
                .collect(Collectors.groupingBy(person -> {
                    if (person.getAge() < 20) return "Under 20";
                    else if (person.getAge() <= 30) return "21-30";
                    else return "31 and over";
                }, Collectors.counting()));

        groupedByAge.forEach((ageGroup, count) -> System.out.println(ageGroup + ": " + count));
    }
}
