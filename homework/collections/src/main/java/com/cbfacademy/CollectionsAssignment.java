package com.cbfacademy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsAssignment {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        /*
         Your solution must traverse the list from last to first element
         removing any values less than minValue.
         Note to self: In this task, it is unnecessary to create a new list. the list parameter is already a reference to an existing List<Integer> object. This means that any modifications made to the list object within the method will directly affect the original list that was passed as an argument.The goal is to modify the existing list (see Test class) by removing elements that are < minValue

        */

        /*
            My solution:
            1. Since I know exactly how many times I want to loop through the block of code
         */
        for (int i = list.size()-1; i>=0; i--) { // We are starting with the last element in the list, so we want to get the index of this element. To do this, we get the list size - 1.
            int value = list.get(i); // To access the actual value of the element at index i, we use the .get() method.
                if (value < minValue){ // 3. Use if statement: as long as values from the list are smaller than minValue, remove the values.
                    list.remove(i);
            }
        }

        /*
        FOR LOOP BREAKDOWN:
        1. Set the Initial Value
        2. Set the Condition
        3. Increment / Decrement by X after each iteration. That means that in the next iteration, i will be X more or less than its previous value.

        1. Set the Initial Value:
        int i = list.size() - 1;
        This line creates a variable named i and sets its initial value to the last index of the list. i is the index value, NOT the actual value of the element.

        2. Set the Condition
        The condition i >= 0 checks if the current index is still within the bounds of the list (valid indices range from 0 to list.size() - 1).

  */

    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        // My approach: Using java streams --> Create a stream, make a distinct stream to have only unique elements. Then count the no. of elements in the new distinct stream and then compare with the original size of the integers collection.

        // 1. Convert to stream
        Stream<Integer> integerStream = integers.stream(); // creating a new stream from the Collections and storing it

        // 2. Apply distinct()
        Stream<Integer> distinctStream = integerStream.distinct(); // Creating a distinctStream using distinct() to get a stream containing only unique elements.

        // 3. Count elements: The count method takes a stream and returns the number of elements in that stream as a long value.
        long distinctCount = distinctStream.count();

        // Compare sizes and return result
        if(integers.size() != distinctCount){
            return true;
        }
        else return false;
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        // Store both collections in streams
        Stream<Integer> intsStream1 = ints1.stream();
        Stream<Integer> intsStream2 = ints2.stream();

        // Merge them
       Stream<Integer> mergeStream = Stream.concat(intsStream1, intsStream2);

        // Remove duplicates
        Stream<Integer> distinctArray = mergeStream.distinct();

        // Use the sorted() stream method to sort the stream
        Stream<Integer> sortedArray = distinctArray.sorted();


        // Create a new ArrayList and initialize it with the elements from the sortedArray stream
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(sortedArray.toList());

        return result;
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        // Note: Since we don't want to modify the original collections, we can use streams.

        // Converting both collections to sets to remove duplicates
        Set<Integer> set1 = new HashSet<>(ints1);
        Set<Integer> set2 = new HashSet<>(ints2);

        // Use streams to find common elements, sort them, and collect into an ArrayList
        return set1.stream()
                .filter(set2::contains) // This step keeps only the elements from set1 that are also present in set2.
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

    }


    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.

        // If the input list is empty
        if (list.isEmpty()){
            return "";
            }

        // HashMap will allow me to store a mapping from Strings to counts. String = keys, counts = values
        HashMap<String, Integer> counts = new HashMap<>();

        // 1. First iterate through the list to count occurrences of each String. Enhanced for loop is used to iterate through elements of arrays and collections.
        for(String word : list){
            // Update the count for this word
            int currentCount = counts.getOrDefault(word, 0);

            // Increment the count and put the word back in the map with the new count
            counts.put(word, currentCount +1);

            }


        // 2. To find the word with the highest count
        String mostFrequentWord = "";
        int maxCount = 0;

        // Then iterate through the counts to find the largest. I use Map.Entry to get both the key and values
        for (Map.Entry<String, Integer> listEntry: counts.entrySet()){
            if(listEntry.getValue() > maxCount) {
                maxCount = listEntry.getValue();
                mostFrequentWord = listEntry.getKey();
            }
        }

        return mostFrequentWord;

    }

    public static String getName() {
        return "Collections Assignment";
    }
}
