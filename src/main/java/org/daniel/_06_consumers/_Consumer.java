package org.daniel._06_consumers;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "777-555-333");

        // Normal Function
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerWithConsumer.accept(maria);
    }

    //------------------ imperative approach ------------------------
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                " thanks for registering  phone number " +
                customer.customerPhoneNumber);
    }

    // ----------------- functional approach -------------------------
    static Consumer<Customer> greetCustomerWithConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
            " thanks for registering  phone number " +
            customer.customerPhoneNumber);


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
