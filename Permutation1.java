package com.java.cci.practice;

import java.util.Arrays;

public class Permutation1 {

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false; // Permutations must be same length

        int[] letter = new int[128];

        for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i)]++;

        }

        for (int j=0 ; j <t.length();j++){

            letter[t.charAt(j)] --;

            if (letter[t.charAt(j)] < 0) {
                return false;
            }

        }

        return true; // letters array has no negative values, and therefore no positive values either
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }

}
