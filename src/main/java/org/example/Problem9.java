package org.example;

public class Problem9 {
    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry", "apple", "date", "banana", "fig"};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
    }
}