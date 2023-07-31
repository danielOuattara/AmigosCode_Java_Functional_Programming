package org.daniel._02_declarative_approach;

import java.util.ArrayList;
import java.util.List;
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
//         people.stream()
//                .filter(person -> Gender.FEMALE.equals(person.gender))
//                .forEach(System.out::println);

        // OR

        List<Person> females2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);


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
