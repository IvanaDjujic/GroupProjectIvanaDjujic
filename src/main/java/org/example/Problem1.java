package org.example;

public class Problem1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to find the highest and lowest temperature for the week.
        // Array storing temperatures for a week
        int[] temperatures = {72, 75, 78, 79, 68, 71, 74};

        // Initialize variables to store highest and lowest temperatures
        int highest = temperatures[0];
        int lowest = temperatures[0];

        // Loop through the array to find highest and lowest temperature
        for (int temp : temperatures) {
            if (temp > highest) {
                highest = temp;
            }
            if (temp < lowest) {
                lowest = temp;
            }
        }

        // Print the results
        System.out.println("Highest Temperature of the Week: " + highest + "°F");
        System.out.println("Lowest Temperature of the Week: " + lowest + "°F");
    }
}
