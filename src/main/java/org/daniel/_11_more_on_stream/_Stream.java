package org.daniel._11_more_on_stream;


import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Jade", Gender.FEMALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Bob", Gender.MALE),
                new Person("Aretha", Gender.FEMALE)
        );

        Set<Gender> genders = people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());
        System.out.println("genders = " + genders);

        System.out.println("------------------------ OR ");

        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("------------------------ OR ");

        // More on stream , NEW


        boolean isContainsOnlyFemales = people.stream().allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println("isContainsOnlyFemales = " + isContainsOnlyFemales); // false

        boolean anyMatchForFemales = people.stream().anyMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println("anyMatchForFemales = " + anyMatchForFemales); // true

        boolean noneMatchForFemales = people.stream().noneMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println("noneMatchForFemales = " + noneMatchForFemales); // true
    }

    static class Person {
        private final String name;
        private final Gender gender;


        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
