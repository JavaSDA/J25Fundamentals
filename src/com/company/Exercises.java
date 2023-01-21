package com.company;

public class Exercises {
    public static void main(String[] args) {
//        printVowels();

        wordCounter();
    }

    public static void printVowels() {
        // Declare variable
        String value = "hEllO wOrld";

        // Loop through each character in the input string
        for (int i = 0; i < value.length(); i++) {
            char c = value.toLowerCase().charAt(i);

            //  Check if the character is a vowel and return it
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c);
            }
        }
    }

    public static void wordCounter() {
        String input = "This is, a sample";
        int count = 0;
        boolean isWord = false;

        // Loop through the string to count the words
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i); // Current char in the loop
            if (Character.isLetter(currentChar) && !isWord) {
                isWord = true;
                count++;
            } else if (!Character.isLetter(currentChar)) {
                isWord = false;
            }
        }

        System.out.println("The number of words is: " + count);
    }
}
