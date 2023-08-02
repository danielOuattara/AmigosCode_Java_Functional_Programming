package org.daniel._07_biconsumers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "777-555-333");

        // Normal Function 2 arguments
        greetCustomer2Args(maria, false);
        System.out.println("------------------------------------------ 1");

        // BiConsumer Functional Interface
        greetCustomerWithBiConsumer.accept(maria, true);

        System.out.println("------------------------------------------ 2");
        // BiConsumer Functional Interface
        greetCustomerWithBiConsumer.accept(maria, false);
        System.out.println("------------------------------------------ 3");
    }


    //------------------ imperative approach ------------------------
    static void greetCustomer2Args(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                " thanks for registering  phone number " + (
                showPhoneNumber ? customer.customerPhoneNumber : "###")
        );
    }

    // ----------------- functional approach -------------------------
    static BiConsumer<Customer, Boolean> greetCustomerWithBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    " thanks for registering  phone number " + (
                    showPhoneNumber ? customer.customerPhoneNumber : "###")
            );


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
