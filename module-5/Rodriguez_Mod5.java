/**
 * Luis Rodriguez
 * CSD-402
 * Module 5
 *
 * This program contains methods that locate the largest and smallest
 * elements in two-dimensional int and double arrays. Each method
 * returns the row and column location of the element.
 */
public class Rodriguez_Mod5 {

    /**
     * Locates the largest element in a two-dimensional double array.
     *
     * @param arrayParam the double array being searched
     * @return an array containing the row and column of the largest element
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    /**
     * Locates the largest element in a two-dimensional int array.
     *
     * @param arrayParam the int array being searched
     * @return an array containing the row and column of the largest element
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    /**
     * Locates the smallest element in a two-dimensional double array.
     *
     * @param arrayParam the double array being searched
     * @return an array containing the row and column of the smallest element
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    /**
     * Locates the smallest element in a two-dimensional int array.
     *
     * @param arrayParam the int array being searched
     * @return an array containing the row and column of the smallest element
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < arrayParam[location[0]][location[1]]) {
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    /**
     * Tests the four locate methods.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        double[][] doubleArray = {
            {1.5, 2.5, 8.5},
            {4.5, 9.5, 3.5},
            {6.5, 7.5, 5.5}
        };

        int[][] intArray = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest double is at: ["
                + largestDouble[0] + "][" + largestDouble[1] + "]");

        System.out.println("Smallest double is at: ["
                + smallestDouble[0] + "][" + smallestDouble[1] + "]");

        System.out.println("Largest int is at: ["
                + largestInt[0] + "][" + largestInt[1] + "]");

        System.out.println("Smallest int is at: ["
                + smallestInt[0] + "][" + smallestInt[1] + "]");
    }
}