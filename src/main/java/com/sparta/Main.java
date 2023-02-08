package com.sparta;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String sentence = "abba Hannah did you want to go see Bannab tonight?";
        String sentenceNoPalindrome = "Hello there";
        String word = "Hannah";
        boolean checkWord = PalindromeSolver.checkForPalindrome(word);
        ArrayList<String> longestPalindrome = SentenceSplitter.splitSentenceToWords(sentence);
        ArrayList<String> noPalindromeCheck = SentenceSplitter.splitSentenceToWords(sentenceNoPalindrome);

        System.out.println("Is your chosen word a Palindrome?" + " " + checkWord + "!");
        System.out.println(longestPalindrome + " is/are the longest Palindrome/s in your sentence, nice!");
        System.out.println(noPalindromeCheck);
    }
}