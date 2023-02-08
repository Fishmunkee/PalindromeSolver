package com.sparta;

import java.util.ArrayList;

public class SentenceSplitter {
    public static ArrayList<String> splitSentenceToWords(String sentence) {
        String longestPalindrome = " ";
        String[] splitToWordsArray = sentence.split(" ");
        ArrayList<String> listOfPalindromes = new ArrayList<>();

        // Check for empty string Array
        for (String s : splitToWordsArray) {
            if (PalindromeSolver.checkForPalindrome(s)) {
                if(s.length() >= longestPalindrome.length()) {
                    // Check for palindromes of the same length
                    longestPalindrome = s;
                    listOfPalindromes.add(longestPalindrome);
                }
            }
        }
        if (listOfPalindromes.isEmpty()) {
            listOfPalindromes.add("No Palindromes here!");
        }
        return listOfPalindromes;
    }
}
