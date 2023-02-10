package com.sparta;

public class SentenceSplitter {
    public static String splitSentenceToWords(String sentence) {
        String longestPalindrome = " ";
        String[] splitToWordsArray = sentence.split(" ");

        // Check for empty string Array
        for (String s : splitToWordsArray) {
            if (PalindromeSolver.checkForPalindrome(s)) {
                if(s.length() > longestPalindrome.length()) {
                    // Check for palindromes of the same length
                    longestPalindrome = s;
                }
            }
        }
        if(!longestPalindrome.equals(" ")){
            return longestPalindrome;
        } else {
            return "No Palindromes here!!";
        }
    }
}
