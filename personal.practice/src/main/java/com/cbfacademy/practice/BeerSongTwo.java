package personal.practice.src.main.java.com.cbfacademy.practice;

public class BeerSongTwo {
    public static void main (String [] args){
        int beerNum = 99;
        String word = "bottles";
        if (beerNum == 1) {
            word = "bottle"; // 1  (singular), 2 bottles etc.
        } // end of if loop 1

        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + "of beer on the wall");
            System.out.println(beerNum + " " + word + "of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + "of beer on the wall");
            } // end of if loop 2
            else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while loop
    } // end main method
} // end class

