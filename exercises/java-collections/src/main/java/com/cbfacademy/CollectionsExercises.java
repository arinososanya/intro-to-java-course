package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> myList = new LinkedList<>(); // TODO: create an empty linked list i.e declaring a new list of the type LinkedList
        myList.addFirst(4); //  - add 4 as the first element of the list
        myList.addAll(Arrays.asList(5, 6, 8, 2, 9)); //   add 5, 6, 8, 2, 9 to the list
        myList.addLast(2); //  - add another 2 as the last element of the list
        myList.add(2, 4); //  - add 4 as the 3rd element of the list
        System.out.print(myList.element()); //  - invoke the method element() on the list and print the result on the screen
        return myList; //  - return the list
    }

    // Alternative (less efficient way to add these elements to the list)
//     myList.addLast(5); //  - then add 5, 6, 8, 2, 9 to the list
//        myList.addFirst(6);
//        myList.addFirst(8);
//        myList.addFirst(2);
//        myList.addFirst(9);


    public Stack<Integer> useStack() {
        Stack<Integer> myStack = new Stack<>(); // TODO: create an empty stack
        myStack.addAll(Arrays.asList(5, 6, 8, 9));//  - add 5, 6, 8, 9 to the stack
        System.out.print(myStack.firstElement());//  - print the first element of the stack on the screen (it is good practice to check if the stack is empty before peeking). Avoid using println with stack
        System.out.print(myStack.lastElement());  //  - print the last element of the stack on the screen --> If search is insert index no., print the value of that index.
        System.out.print(myStack.pop());  //  - invoke the method pop() on the stack and print the result on the screen
        myStack.push(4);   //  - invoke the push(4) method on the stack
        return myStack;//  - return the stack
    }

    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> myQueue = new ArrayDeque<>(); // TODO: create an empty arrayDeque
        myQueue.addAll(Arrays.asList(5, 6, 8, 9)); //  - add 5, 6, 8, 9 to the queue. Deque (1) = double ended queue and Dequeue (2) = to remove an element from the queue. You can re-write this so the first and second line are combined.
        System.out.print(myQueue.getFirst()); //  - print the first element of the queue on the screen
        System.out.print(myQueue.getLast()); //  - print the last element of the queue on the screen
        System.out.print(myQueue.poll()); //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(myQueue.element());  //  - invoke the element() method on the queue and print the result on the screen
        return myQueue;//  - return the queue
    }



    public HashMap<Integer, String> useHashMap() {
        Map<Integer, String> myMap = new HashMap<>();   // TODO: create an empty hash map (key value pairs)
        myMap.put(1, "TypeScript");//  - add {1, TypeScript} entry to the map
        myMap.put(2, "Kotlin"); //  - add {2, Kotlin} entry to the map
        myMap.put(3, "Python");//  - add {3, Python} entry to the map
        myMap.put(4, "Java");//  - add {4, Java} entry to the map
        myMap.put(5, "JavaScript");//  - add {5, JavaScript} entry to the map
        myMap.put(6, "Rust");//  - add {6, Rust} entry to the map
        System.out.print(myMap.keySet()); //  - determine the set of keys from the map and print it on the screen
        System.out.print(myMap.values());//  - determine the set of values from the map and print it on the screen
        System.out.print(myMap.containsValue("English"));//  - determine whether the map contains "English" as a language and print the result on the screen
        return (HashMap<Integer, String>) myMap.entrySet(); //  - return the map; initially I just put return myMap.entrySet()
    }

    public String getName() {
        return "Collections Exercises";
    }
}





