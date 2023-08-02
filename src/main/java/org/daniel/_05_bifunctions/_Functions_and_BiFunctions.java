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

        int incrementByOneAndMultiplyBy10 = incrementByOneAndMultiplyBy10(2, 4);
        System.out.println("incrementByOneAndMultiplyBy10 = " + incrementByOneAndMultiplyBy10);

        int incrementAndMultiplyBiFunction = incrementBy1AndThenMultiplyBy10BiFunction.apply(2, 4);
        System.out.println("incrementAndMultiplyBiFunction = " + incrementAndMultiplyBiFunction);
    }


    // method + imperative

    static int incrementByOneAndMultiplyBy10(int numberToIncrement, int numberToMultiply) {
        return (numberToIncrement + 1) * numberToMultiply;
    }

    // Functional BiFunctions
    static BiFunction<Integer, Integer, Integer> incrementBy1AndThenMultiplyBy10BiFunction =
            (numberToIncrementByOne, numberToMultiplyBy10) -> (numberToIncrementByOne + 1) * numberToMultiplyBy10;

}
