package com.java.cci.practice;

public class StringAddition {

    public static String addString( String str1, String str2)  {
        // logic to add numbers
        int i = str1.length() -1;
        int j = str2.length() -1;
        String result = "";
        int cary  = 0;

        while (i >=0 || j>=0 || cary !=0) {
            int iVal  = i >=0? str1.charAt(i) - '0': 0;
            int jVal  = j >=0? str1.charAt(j) - '0': 0;

            i--;
            j--;
            int sum =   iVal + jVal + cary;
            result = (sum %10) + result;
            cary = sum/10;

        }

        return  result;
    }
    public static void main (String [] args) {

        System.out.println(addString("11", "99"));
    }
}
