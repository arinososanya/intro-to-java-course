// ACTIVITY COMPLETE
package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result (DONE)
        return word1.concat(word2).concat(word3);

    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings (DONE)
        return word1.equals(word2);

    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023 (DONE)
        return "Item: " + item + ". Price: £" + String.format("%.2f", price) + ". Quantity: " + quantity;
    }

}

// For the formatted String activity above, we did the following:
// 1. We declare a variable formattedString to hold the final output.
// 2. We use string concatenation to build the string with placeholders for item, formatted price, and quantity.
// 3. For the price, we use String.format("%.2f", price) within the string to format the double value price as a String with two decimal places and a leading £ symbol. NOTE: The %.2f format specifier ensures two decimal places.
// We don't use the '%.2d' format because then it won't show decimal places, it shows as an integer but we want 2 decimal places.
