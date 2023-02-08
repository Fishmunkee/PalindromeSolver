package com.sparta;

import java.lang.String;

public class PalindromeSolver {
    public static boolean checkForPalindrome(String word) {

        if (word.length() < 3) {
            return false;
        } else {


            StringBuilder s = new StringBuilder(word);
            s.reverse();
            return word.equalsIgnoreCase(String.valueOf(s));
        }
    }
}