package com.java.cci.practice;

//import java.util.Scanner;

import java.util.Scanner;

public class CombinationSum_Project3 {

    //arr - input array
    //sos - sum of subsets
    private static void printTargetSumSubSet(int[] arr, int idx, String set, int sos, int target) {
        if (idx == arr.length) {
            if(sos == target) {
                System.out.println(set + " . ");
            }
            return;
        }
        printTargetSumSubSet(arr, idx+1, set + arr[idx] + ", ", sos+arr[idx], target);
        printTargetSumSubSet(arr, idx+1, set, sos, target);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        int[] arr = {10,20,30,40,50};
        int target = sc.nextInt(); //70;

        printTargetSumSubSet(arr, 0, "", 0, target);
    }

}
