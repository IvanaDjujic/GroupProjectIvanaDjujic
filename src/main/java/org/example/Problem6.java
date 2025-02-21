package org.example;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is prime or not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;  // Not a prime number
            }
        }
        return true;
    }
}

