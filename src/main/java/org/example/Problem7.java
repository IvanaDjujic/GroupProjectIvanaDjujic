package org.example;

public class Problem7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of the Fibonacci series.
        int n = 10, firstTerm = 0, secondTerm = 1;

        System.out.println("First " + n + " numbers of the Fibonacci series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
