package org.example;

public class Problem2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
        // Array storing integer values
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store sum of all elements
        int sum = 0;

        // Loop through the array to calculate sum
        for (int num : numbers) {
            sum += num;
        }

        // Print the result
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
