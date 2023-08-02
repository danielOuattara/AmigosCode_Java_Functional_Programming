package org.daniel._12_java_optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable(null).orElseGet(() -> "Default value");
        System.out.println("value = " + value);

        Object value2 = Optional.ofNullable("Not Null, There is Something").orElseGet(() -> "Default value");
        System.out.println("value2 = " + value2);

        Object value3 = Optional.ofNullable("Not Null").orElseThrow(() -> new IllegalStateException("An Exception"));
        System.out.println("value3 = " + value3);

//        Object value4 = Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("An Null Value Found"));
//        System.out.println("value4 = " + value4);

        Optional.ofNullable(null).ifPresent(item -> {
            // logic here
            System.out.println(item);
        });

        //-----------------------------------------------------------

        Optional.ofNullable("John Doe").ifPresent(System.out::println);

        Optional.ofNullable("john_doe@email.com").ifPresent(email -> System.out.println("Sending email to " + email));

        //-------------------------------------------------------------
        Optional.ofNullable("john_doe@email.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending new email to " + email),
                        () -> {
                            System.out.println("Cannot send email");
                        }
                );

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending new email to " + email),
                        () -> {
                            System.out.println("Cannot send email");
                        }
                );

    }
}
