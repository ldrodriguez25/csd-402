/*
Name: Luis Rodriguez
Date: August 30, 2026
Assignment: CSD-402 Module 4 - Overloaded Average Methods
*/

public class Rodriguez_mod_4_csd402 {

    public static short average(short[] array) {
        short sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30, 40, 50};
        int[] intArray = {100, 200, 300, 400, 500, 600};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L, 6000L, 7000L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5};

        System.out.println("CSD-402 Module 4 - Overloaded Average Methods");
        System.out.println();

        System.out.println("Short Array:");
        System.out.print("Elements: ");
        for (short value : shortArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array:");
        System.out.print("Elements: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array:");
        System.out.print("Elements: ");
        for (long value : longArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array:");
        System.out.print("Elements: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(doubleArray));
    }
}
