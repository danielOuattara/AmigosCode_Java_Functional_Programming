package org.daniel._01_imperative;

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
        // imperative solution : how to find the number of FEMALE ?
        List<Person> females = new ArrayList<>();

        for (Person singPerson : people) {
            if (Gender.FEMALE.equals(singPerson.gender)) {
                females.add(singPerson);
            }
        }
        // System.out.println(females);

        System.out.println("--------------------- IMPERATIVE--------------------- ");
        for (Person singleFemale : females) {
            System.out.println(singleFemale);
        }

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
