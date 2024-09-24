package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                result.add("FizzBuzz");
            } else if (numbers.get(i) % 3 == 0) {
                result.add("Fizz");
            } else if (numbers.get(i) % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(numbers.get(i).toString()); // Double check what this means
            }
        }
        return result;
    }


    public String getName() {
        throw new RuntimeException("Not implemented");
    }



    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }
}

//    public String getName() {
//        return "Flow Control Exercises";
//    }
//}
