package org.daniel._04_functions_and_functions_chaining;

import java.util.function.Function;

/*______________________________________________________________________
Code this :
Function<T,R>
Represents a function that accepts one argument and produces a result.
_________________________________________________________________________ */
public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOneMethod(0);
        System.out.println("increment = " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("increment2 = " + increment2);

        int multiply = multiplyBy10Function.apply(3);
        System.out.println("multiply = " + multiply);

        int incrementAndMultiply = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println("incrementAndMultiply = " + incrementAndMultiply);
    }


    // functional
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    // chaining functions
    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
            incrementByOneFunction.andThen(multiplyBy10Function);


    // method  + imperative
    static int incrementByOneMethod(int number) {
        return number + 1;
    }
}
