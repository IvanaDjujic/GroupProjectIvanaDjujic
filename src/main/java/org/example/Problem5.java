package org.example;

public class Problem5 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable.
                int a = 5, b = 10;

                // Swapping without a temporary variable
                a = a + b;
                b = a - b;
                a = a - b;

                // Print swapped values
                System.out.println("After swapping: ");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
            }
        }
