package com.java.cci.practice;

import java.util.Scanner;

public class StringPalindrome_Project2 {


    public static boolean isStringPalindrome(String input)  {

        String reverseStr = "";

        for (int i = input.length() -1 ; i >=0 ; i--) {

            reverseStr = reverseStr + input.charAt(i);
        }

        if (input.equals(reverseStr)) {
            return  true;
        }
        return  false;
    }
    public static void main(String[] args) {

        System.out.println(" Please enter the string : ");
        Scanner sc = new Scanner(System.in);

        String inputStr =  sc.nextLine();

      System.out.println(" is input string palindrome " + isStringPalindrome(inputStr));
    }
}
