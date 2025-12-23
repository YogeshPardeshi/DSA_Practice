package com.java.cci.practice;

public class Multiplication {

    public static String multiply (String str1, String str2) {
        String result = "";

        int i = str1.length() -1;
        int j = str2.length() -1;
        int k = str1.length() + str2.length();
        int carry = 0;
        int [] auxArray = new int[str1.length() + str2.length()];
        while (i >=0 || j >=0 || carry !=0) {
            int iVal = i>= 0 ? str1.charAt(i) - '0' : 0;
            int jVal = j>= 0 ? str1.charAt(j) - '0' : 0;
            int prod = (iVal* jVal)/10 + carry + auxArray[k -1];
            auxArray[k -1] = prod;
            i --;
            j --;
            k--;
            carry = prod % 10;

        }

        return "";
    }

    public static void main(String [] args) {

    }
}
