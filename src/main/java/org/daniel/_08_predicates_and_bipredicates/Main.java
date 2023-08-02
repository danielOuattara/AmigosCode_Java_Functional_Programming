package org.daniel._08_predicates_and_bipredicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Jade", Gender.FEMALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Bob", Gender.MALE),
                new Person("Aretha", Gender.FEMALE)
        );

        //-----------------------------------------------------------------------------
        // declarative solution : how to find the number of FEMALE ? // --> stream + collection

        System.out.println("--------------------- DECLARATIVE --------------------- ");

        // a predicate, from the Java Documentation
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        List<Person> femaleList = people.stream()
                .filter(personPredicate)
                .toList();

        femaleList.forEach(System.out::println);


        //-----------------------------------------------------------------------------

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
