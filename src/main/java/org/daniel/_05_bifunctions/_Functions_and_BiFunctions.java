package org.daniel._05_bifunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

/*______________________________________________________________________
Code this :
Function<T,R>
Represents a function that accepts one argument and produces a result.
_________________________________________________________________________ */
public class _Functions_and_BiFunctions {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");

        int increment = incrementByOneMethod(0);
        System.out.println("increment = " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("increment2 = " + increment2);

        System.out.println("------------------------------------------------");

        int multiply = multiplyBy10Function.apply(3);
        System.out.println("multiply = " + multiply);

        int incrementAndMultiplyFunction = incrementBy1AndThenMultiplyBy10Function.apply(4);
        System.out.println("incrementAndMultiplyFunction = " + incrementAndMultiplyFunction);

        System.out.println("------------------------------------------------");

        int incrementByOneAndMultiplyBy10 = incrementByOneAndMultiplyBy10(2, 4);
        System.out.println("incrementByOneAndMultiplyBy10 = " + incrementByOneAndMultiplyBy10);

        int incrementAndMultiplyBiFunction = incrementBy1AndThenMultiplyBy10BiFunction.apply(2, 4);
        System.out.println("incrementAndMultiplyBiFunction = " + incrementAndMultiplyBiFunction);
    }

    // method + imperative
    static int incrementByOneMethod(int number) {
        return number + 1;
    }

    /* Functional: Function
     *--------------------------------*/
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    /* Chaining Functions
    ----------------------------------*/
    static Function<Integer, Integer> incrementBy1AndThenMultiplyBy10Function =
            incrementByOneFunction.andThen(multiplyBy10Function);

    /* Functional BiFunctions
    ----------------------------------*/
    static int incrementByOneAndMultiplyBy10(int numberToIncrement, int numberToMultiply) {
        return (numberToIncrement + 1) * numberToMultiply;
    }

    static BiFunction<Integer, Integer, Integer> incrementBy1AndThenMultiplyBy10BiFunction =
            (numberToIncrementByOne, numberToMultiplyBy10) -> (numberToIncrementByOne + 1) * numberToMultiplyBy10;

}
