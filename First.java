public class First {
    public static void main(String[] args) {

    
        int[] squareNumbers = new int[10];

        // Go through each of the Array indexes, from 0 to 9.
        // for (int i = 0; i < 10; i++) {
        //     int square = (i + 1) * (i + 1);
        //     squareNumbers[i] = square;

        // System.out.println(squareNumbers[i]);

        // }
        int length = 0;

        // rewriting this as a for each loop
        // Fill the array using a regular for loop first
        for (int i = 0; i < squareNumbers.length; i++) {
            squareNumbers[i] = (i + 1) * (i + 1);
            length++;
        }

        // Print each number using a for-each loop
        for (int square : squareNumbers) {
            System.out.println(square);
        }

        int capacity = squareNumbers.length;
        System.out.println("This Array has a capacity of " + capacity);
        System.out.println("This Array has a length of " + length);
    }
}