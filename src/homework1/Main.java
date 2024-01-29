package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static homework1.Person.personsAge;


public class Main {
    public static void main(String[] args) {
        List<Person> people1 = Arrays.asList(
                new Person("Martin", 17),
                new Person("Monika", 35),
                new Person("Samanta", 24),
                new Person("Tom", 35)

        );
        Map<Integer, List<Person>> result = personsAge(people1);

        result.forEach((age, persons) -> System.out.println("Age: " + age + " People " + persons));






    }
}