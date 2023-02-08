package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.*;

class PalindromeSolverTest {

    @Test
    @DisplayName("Given a single String, returns true if String is a Palindrome over 3 characters")
    public void GivenAString_ReturnsTrueIfStringIsPalindrome(){
        String word = "hannah";
        boolean expectedResult = true;
        boolean result = PalindromeSolver.checkForPalindrome(word);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Given a String with multiple words, returns the longest Palindrome in the sentence over 3 characters")
    public void GivenAString_ReturnsLongestPalindrome(){
        String sentence = "Hello Hannah would you like to go to the abba concert tonight? Also I need to repaper my house tomorrow";
        String expectedResult = "repaper";
        String result = SentenceSplitter.splitSentenceToWords(sentence);
        Assertions.assertEquals(expectedResult, result);
    }

}