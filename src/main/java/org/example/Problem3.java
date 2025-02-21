package org.example;

public class Problem3 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers. Develop a program that will identify/print the even numbers only.
        // 2D array storing both odd and even numbers
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Print even numbers only
        System.out.println("Even numbers in the 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
