package ua.zp.brainacad;

import java.util.Arrays;

/**
 * This is prototype for Lab 4.
 */
public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4]; // TODO init it's array by new with size 4.

        // TODO insert some value to start of array and to end of array.
        firstArray[0] = 1.1f;
        firstArray[1] = 2.2f;
        firstArray[2] = 3.3f;
        firstArray[3] = 4.4f;
        System.out.println("firstArray = " + Arrays.toString(firstArray));

        int[] intArray = {3, 2, 1, 0}; // TODO init and fill it's array with any values. Use {} syntax.
        System.out.println("intArray = " + Arrays.toString(intArray));

        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length); // TODO copy "intArray". Use copyOf...
        System.out.println("intArrayCopy = " + Arrays.toString(intArrayCopy));

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);
        System.out.println("intArrayCopy after sorting = " + Arrays.toString(intArrayCopy));

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println("intArrayCopy after using toString method = " + Arrays.toString(intArrayCopy));

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        System.out.println(Arrays.equals(intArray, intArrayCopy) ? "Arrays equals" : "Arrays not equals");


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int sumElements = 0;
        for (int valueElement : testArray) {
            sumElements += valueElement;
        }
        System.out.println("\nSum of elements in testArray = " + sumElements);

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int sumOddElements = 0;
        for (int i = 0; i < testArray.length; i++) {
            if ((i + 1) % 2 != 0) {
                sumOddElements += testArray[i];
            }
        }
        System.out.println("Sum of odd elements in testArray = " + sumOddElements);

        // 2.3)
        // TODO find max value in array.
        int maxValue = testArray[0];
        for (int element : testArray) {
            maxValue = element > maxValue ? element : maxValue;
        }

        System.out.println("max value in array = " + maxValue);

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][] twoDimArray = new int[3][4];

        //3.2
        // TODO fill array with any numbers in cycles.
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("two-dimensional array:");
        for (int[] ints : twoDimArray) {
            System.out.println(Arrays.toString(ints));
        }


        //3.3
        // TODO calc sum of all array elements and print result.
        int sumTwoDimArrayElements = 0;
        for (int[] ints : twoDimArray) {
            for (int anInt : ints) {
                sumTwoDimArrayElements += anInt;
            }
        }
        System.out.println("sum of all two-dimensional array elements = " + sumTwoDimArrayElements);


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (2 < i && i <= 5 && (j + 1) % 3 == 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum some elements of matrix = " + sum);
    }
}
