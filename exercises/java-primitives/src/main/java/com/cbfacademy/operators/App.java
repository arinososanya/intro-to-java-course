package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {

        return operand1 * operand2;
    }

    public static Boolean areEqual(double operand1, double operand2) {

        // We don't use equals(operand2) because because the equals method of primitive data types like double doesn't directly compare floating-point numbers for equality.
        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1<operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1>operand2;
    }
}
// Unary Operations
// If we have this input:
//int number1 = 12;
//int number2 = 12;
//System.out.println(number1++);
//System.out.println(++number2);
// We get out:
//12 and
//13
//
//This is because (number1++) number1 has the value 12 initially.
//Since it's a postfix increment, the expression first evaluates to the current value of number1 (which is 12).
//Then, number1 is incremented by 1 (so it becomes 13).
//However, the increment happens after the value is used in the expression, so the System.out.println statement prints the original value (12).
// Meanwhile, (++number2) is a prefix increment.
//The value of number2 (which is 12) is incremented by 1 before it's used in the expression.
//So, number2 becomes 13.
//Now, the expression evaluates to the incremented value of number2 (which is 13).
//Therefore, the System.out.println statement prints 13.

// All activities complete? (Y)