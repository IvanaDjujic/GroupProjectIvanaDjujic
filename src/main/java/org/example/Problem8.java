package org.example;

public class Problem8 {
    public static void main(String[] args) {
        //Write a Java program to find the second largest number in the array.
        int[] numbers = {10, 20, 35, 50, 40, 25};

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
