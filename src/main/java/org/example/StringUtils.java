package org.example;

public class StringUtils {
    // Method to reverse a string
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }

    // Method to count vowels in a string
    public int countVowels(String input) {
        if (input == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
