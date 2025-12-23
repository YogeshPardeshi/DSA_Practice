package com.java.cci.practice;

public class PrintNthPolygonNumber_project4 {

    public static void printNthHexagon(int s, int n ) {

        int nthNumber = ((s -2) *((n*(n-1)/2) )) + n;

        System.out.println("nth Polygon Number : " + nthNumber);
    }

    public static void main(String[] args) {

        printNthHexagon(6,10);

    }
}
