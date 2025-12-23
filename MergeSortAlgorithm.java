package com.java.cci.practice;

public class MergeSortAlgorithm {



    public static void main (String[] args) {

        int [] array =  {43,12,4,89,78,100};
        
        int[] auxArray = new int[array.length];

        sort(array, auxArray, 0, array.length -1);
        printArray(array);
    }

    private static void sort(int[] array, int[] auxArray, int low, int hi) {

            if(hi <= low)  return;
            int mid = low + (hi-low)/2;
            sort(array,auxArray,low, mid);
            sort(array,auxArray,mid+1, hi);
            mergeArray(array, auxArray,low,mid, hi);

    }

    public static void printArray(int [] input) {
        System.out.print("[ ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(" ");
            System.out.print(input[i]);
            if (i != input.length -1)
                System.out.print(" ,");

        }
        System.out.print(" ]");
    }
    private static int mergeArray(int[] array, int[] auxArray, int low, int mid, int hi) {

        int count = 0;
        int i=low;
        int j=mid+1;
        int k=0;
        // while loop is missing
        if(low < mid)  auxArray[k++] = array[i++];
        else if(low> mid) auxArray[k++] = array[j++];


        return count;
    }


}
