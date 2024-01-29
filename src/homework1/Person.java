package homework1;

import java.util.*;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static Map<Integer, List<Person>>
    personsAge(List<Person> people) {
       return people.stream()
               .collect(Collectors.groupingBy(Person :: getAge ));
    }

    private Integer getAge() {
        return age;
    }
    public static int getAge18(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() > 18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String getName18(List<Person> people) {
        List<String> getName18 = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());


        String namesString = String.join(" and " + getName18);
        return " At the moment " + namesString + "are of legal age.";


    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



















