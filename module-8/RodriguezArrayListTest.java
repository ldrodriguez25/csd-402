/*
 * Name: Luis Rodriguez
 * Date: September 20, 2026
 * Assignment: Module 8 - ArrayList Test
 * Course: CSD-402
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RodriguezArrayListTest {

    public static Integer max(ArrayList list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer value = (Integer) list.get(i);

            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter integers one at a time.");
        System.out.println("Enter 0 to stop.");

        int number;

        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            numbers.add(number);
        } while (number != 0);

        Integer largest = max(numbers);

        System.out.println();
        System.out.println("The largest value in the ArrayList is: " + largest);

        // Additional test of the max method
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(10);
        testList.add(25);
        testList.add(5);
        testList.add(40);
        testList.add(15);

        System.out.println();
        System.out.println("Additional test:");
        System.out.println("Test ArrayList: " + testList);
        System.out.println("Largest test value: " + max(testList));

        input.close();
    }
}
