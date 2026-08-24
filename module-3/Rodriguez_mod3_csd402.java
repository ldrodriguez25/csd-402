/*
Name: Luis Rodriguez
Date: August 23, 2026
Assignment: Module 3 - Nested For Loops
*/

public class Rodriguez_mod3_csd402 {
public static void main(String[] args) {

    for (int row = 0; row < 7; row++) {

        // Print spaces before the numbers
        for (int space = 0; space < 6 - row; space++) {
            System.out.print("  ");
        }

        // Print increasing powers of 2
        for (int column = 0; column <= row; column++) {
            System.out.print((int) Math.pow(2, column) + " ");
        }

        // Print decreasing powers of 2
        for (int column = row - 1; column >= 0; column--) {
            System.out.print((int) Math.pow(2, column) + " ");
        }

        // Print the @ symbol
        System.out.println("@");
    }
}
}
