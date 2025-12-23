package com.java.cci.practice;

public class Uniqueness {

    public static boolean isUniqueChars(String str) {

        if (str == null) {
            return false;
        }

        boolean [] booleanArray = new boolean[128];

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

           int c = chars[i];
            if (booleanArray[c]) {
                return true;
            } else {
                booleanArray[c] = true;
            }


        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }

    }
}
