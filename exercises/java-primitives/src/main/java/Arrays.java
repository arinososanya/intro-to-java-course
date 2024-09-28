import org.w3c.dom.ls.LSOutput;

public class Arrays {
    // Write a program that creates:
//    An array of 8 Integer elements
    public static void main(String[] args) {
        Integer [] eight = {1, 2, 3, 4, 5, 6, 7, 8};

//    An array of 12 Float elements
        Float [] twelve = {1.2F, 2.3F, 3.4F, 4.5F, 5.6F, 6.7F, 7.8F, 8.9F, 9.10F, 10.1F, 11.2F, 12.3F};

//    An array of 5 Double elements
        Double [] five = {1.2, 2.3, 3.4, 4.5, 5.6};

//    An array of 6 Boolean elements
        Boolean [] six = {true, false, true, false, false, true}; // This creates an array of 5 boolean elements, all initialized to false by default.

//    and print their 5th element to the screen
        System.out.println("5th element of Integer array " + eight[4]);
        System.out.println("5th element of Float array: " + twelve[4]);
        System.out.println("5th element of Double array: " + five[4]);
        System.out.println("5th element of Boolean array: " + six[4]);

        // Stretch exercise
        // Write code that initialises a matrix with the 4 arrays created above. (Use the Object type)
        // All objects, including arrays, implement the methods of the Object class.

        // Declare and initialise a multidimensional array.
        // Since I'm dealing with different types of arrays (Integer, Float, Double, Boolean),
        // I need to use the Object type to create a matrix that can hold all of these.
        Object [][] matrix = {eight, twelve, five, six};

        // Verifying that it works
        for(Object[] row: matrix){ // The outer loop for (Object[] row : matrix) iterates over each row in the matrix. Each row is an array of Objects.
            for(Object element : row){ // The inner loop iterates over each element in the current row.
                System.out.print(element + " "); // Prints each element followed by a space
            }
            System.out.println(); // After printing all elements in a row, sout moves to the next line, so each row of the matrix is printed on a new line.
        }

    }

}
