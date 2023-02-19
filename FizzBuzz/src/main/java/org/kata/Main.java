package org.kata;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println(calculate(i));
        }
    }

    public static  String calculate(int input) {
        if(isMultipleOf(3, input) && isMultipleOf(5, input))
            return "fizzbuzz";
        if(isMultipleOf(3, input))
            return "fizz";
        if(isMultipleOf(5, input))
            return "buzz";

        return String.valueOf(input);
    }
    private static boolean isMultipleOf(int multiple, int value) {
        return value % multiple == 0;
    }
}

