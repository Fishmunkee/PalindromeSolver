package com.sparta;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String sentence = "Hello Hannah did you want to go see Abba tonight?";
        String sentenceNoPalindrome = "Hello there";
        String word = "Hannah";
        boolean checkWord = PalindromeSolver.checkForPalindrome(word);
        String longestPalindrome = SentenceSplitter.splitSentenceToWords(sentence);
        String noPalindromeCheck = SentenceSplitter.splitSentenceToWords(sentenceNoPalindrome);

        System.out.println("Is your chosen word a Palindrome?" + " " + checkWord + "!");
        System.out.println(longestPalindrome + " is the longest Palindrome in your sentence, nice!");
        System.out.println(noPalindromeCheck);
    }
}