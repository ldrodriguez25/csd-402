/*
 * Name: Luis Rodriguez
 * Date: August 23, 2026
 * Assignment: Rock-Paper-Scissors
 * Course: CSD-402
 * Module: 2
 */

import java.util.Random;
import java.util.Scanner;

public class Rodriguez_mod2_csd402 {

    public static void main(String[] args) {

        // Create objects for random number generation and user input
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number from 1 to 3 for the computer
        int computerChoice = random.nextInt(3) + 1;

        // Prompt the user to enter 1, 2, or 3
        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int userChoice = scanner.nextInt();

        // Display the computer's selection
        System.out.println();

        if (computerChoice == 1) {
            System.out.println("Computer's selection: Rock");
        } else if (computerChoice == 2) {
            System.out.println("Computer's selection: Paper");
        } else {
            System.out.println("Computer's selection: Scissors");
        }

        // Display the user's selection
        if (userChoice == 1) {
            System.out.println("Your selection: Rock");
        } else if (userChoice == 2) {
            System.out.println("Your selection: Paper");
        } else if (userChoice == 3) {
            System.out.println("Your selection: Scissors");
        } else {
            System.out.println("Your selection: Invalid choice");
        }

        // Determine and display the result
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Result: Invalid choice. Please enter 1, 2, or 3.");
        } else if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        scanner.close();
    }
}