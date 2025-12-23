package com.java.cci.practice;



public class ArmstrongNumber {


    public static boolean isArmstrongNumber(String inputNumber) {

       // Integer.getInteger(inputNumber);

        int lengthOfNumber = inputNumber.length();
        int  multiplyingDigit = 0;

        // 153
        //

        for (int i = 0; i < lengthOfNumber; i++) {

            int digit = inputNumber.charAt(i) - '0';
            multiplyingDigit = multiplyingDigit + (int)Math.pow(digit, lengthOfNumber);
}

        if (multiplyingDigit == Integer.valueOf(inputNumber)) return true;

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrongNumber("1253"));
        System.out.println(isArmstrongNumber("1634"));



    }
}
