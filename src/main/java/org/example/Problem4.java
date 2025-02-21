package org.example;

public class Problem4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program that will calculate the sum of even and odd numbers separately for that array.
        // 2D array storing both odd and even numbers
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Variables to store sum of even and odd numbers
        int evenSum = 0;
        int oddSum = 0;

        // Loop through the 2D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];
                }
            }
        }

        // Print the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
