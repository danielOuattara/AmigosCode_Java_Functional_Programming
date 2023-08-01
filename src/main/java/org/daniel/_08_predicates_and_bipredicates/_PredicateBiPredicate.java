package org.daniel._08_predicates_and_bipredicates;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _PredicateBiPredicate {
    public static void main(String[] args) {
        // imperative
        System.out.println(isPhoneNumberValid("0712345"));
        System.out.println(isPhoneNumberValid("0912345"));

        System.out.println("------------------------------------------ 1");

        // functional : use Of Predicate
        System.out.println(isPhoneNumberValidPredicate.test("0712345"));
        System.out.println(isPhoneNumberValidPredicate.test("0912345"));

        System.out.println("------------------------------------------ 2");

        // functional : use Of combined Predicates
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberContainsValue3Predicate).test("0712345"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberContainsValue3Predicate).test("0912345"));

        System.out.println(isPhoneNumberValidPredicate.or(isPhoneNumberContainsValue3Predicate).test("0912345"));

        System.out.println("------------------------------------------ 3");

        System.out.println(isPhoneNumberValidAndShowBiPredicate.test("0712345", true));
        System.out.println(isPhoneNumberValidAndShowBiPredicate.test("0712345", false));
        System.out.println("------------------------------------------ 4");
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 7;
    }

    // single predicate
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 7;

    // for combined predicates
    static Predicate<String> isPhoneNumberContainsValue3Predicate =
            phoneNumber -> phoneNumber.contains("3");
    static BiPredicate<String, Boolean> isPhoneNumberValidAndShowBiPredicate =
            (phoneNumber, showTelNumber) -> phoneNumber.startsWith("07") && showTelNumber;

}
