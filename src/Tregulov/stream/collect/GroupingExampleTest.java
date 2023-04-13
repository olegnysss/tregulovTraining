package Tregulov.stream.collect;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExampleTest {

    @Test
    public void groupingByExample() {

        // create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("John", 35));
        people.add(new Person("Bob", 40));
        people.add(new Person("Alice", 45));

        // group people by name using groupingBy method
        Map<String, List<Person>> groupByName = people.stream()
            .collect(Collectors.groupingBy(Person::getName));

        System.out.println(groupByName);
    }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}