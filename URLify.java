package com.java.cci.practice;

public class URLify {

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);

        String.copyValueOf(arr);
        System.out.println("\"" + String.copyValueOf(arr) + "\"");
    }

    private static void replaceSpaces(char[] arr, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (arr[i] == ' ') {
                spaceCount++;
            }
        }
        int index = trueLength + spaceCount * 2;

        for (int i = trueLength - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index = index - 3;
            } else {
                arr[index-1] = arr[i];
                index--;
            }
        }

    }

    private static int findLastCharacter(char[] arr) {

        for (int i = arr.length -1; i >= 0; i--) {

            if (arr[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

}
