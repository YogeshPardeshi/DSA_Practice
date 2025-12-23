package com.java.cci.practice;

import java.util.Arrays;

public class Challenge {
  private static final int[] VALUE_SET_1 = {5, 1, 20, 6, 4, 5};
  private static final int[] VALUE_SET_2 = {6, 8, 4, 2, 1};
  private static final int[] VALUE_SET_3 = {0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static final int[] VALUE_SET_4 = {4, 2, 1, 3, 1, 2};
  private static final int[] VALUE_SET_5 = {3, 1, 3, 5, 2, 4, 6};
  private static final int[] VALUE_SET_6 = {
    0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10
  };

  /*
  Inversion in a list of numbers indicates how far a list is from being sorted. Let us say we
  have a variable:

      arr = [1,2,4,3,5,6]

  in the variable arr we have one inversion of the numbers 4 and 3 because they are in an
  unsorted order. Thus, the formal definition will be:

  Given an array arr, an inversion would occur if arr[i] > arr[j] and i < j.

  Just to cement what an inversion is, I would re-define it using other words:

  If an element on the left is greater than an element on the right, then that is an
  inversion.
  */
  private static int countInversions(final int[] values) {
    if (values.length <= 1) return 0;


    // TODO Your task is to write code that determines how many inversions exist in the array
    // "values" and return that value to the caller.





    return 0;
  }

  private static void checkSolution(final int[] values) {


    final long started = System.currentTimeMillis();
    final int count = Challenge.countInversions(Arrays.copyOfRange(values, 1, values.length));
    final long runtime = System.currentTimeMillis() - started;
    System.out.println(
        "==============================================================================");
    System.out.println(
        String.format(
            "Data size: %d elements Runtime: %dms\nExpected: %d Counted: %d %s",
            values.length,
            runtime,
            values[0],
            count,
            values[0] == count ? "<CORRECT>" : "<!>INCORRECT<!>"));
    System.out.println(
        "==============================================================================");
  }

  public static void main(String[] args) {

//    System.out.println(
//            mergeSortAndCount(VALUE_SET_1, 1, VALUE_SET_1.length - 1));
    System.out.println(
            mergeSortAndCount(VALUE_SET_2, 1, VALUE_SET_2.length - 1));
//    System.out.println(
//            mergeSortAndCount(VALUE_SET_3, 1, VALUE_SET_3.length - 1));
//    System.out.println(
//            mergeSortAndCount(VALUE_SET_4, 1, VALUE_SET_4.length - 1));
//    System.out.println(
//            mergeSortAndCount(VALUE_SET_5, 1, VALUE_SET_5.length - 1));
//    System.out.println(
//            mergeSortAndCount(VALUE_SET_6, 0, VALUE_SET_6.length - 1));

    // generate large test data
//    int[] largeData = new int[1000001];
//    largeData[0] = 1783293664;
//    for (int index = 1; index < largeData.length; index++) {
//      largeData[index] = largeData.length - 1 - index;
//    }
//    checkSolution(largeData);
  }

  // Function to count the number of inversions
  // during the merge process
  private static int mergeAndCount(int[] arr, int l,
                                   int m, int r)
  {

    // Left subarray
    int[] left = Arrays.copyOfRange(arr, l, m + 1);

    // Right subarray
    int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

    int i = 0, j = 0, k = l, swaps = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        arr[k++] = left[i++];
      else {
        arr[k++] = right[j++];
        swaps += (m + 1) - (l + i);
      }
    }
    while (i < left.length)
      arr[k++] = left[i++];
    while (j < right.length)
      arr[k++] = right[j++];
    return swaps;
  }
  private static int mergeSortAndCount(int[] arr, int l,
                                       int r)
  {

    // Keeps track of the inversion count at a
    // particular node of the recursion tree
    int count = 0;

    if (l < r) {
      int m = (l + r) / 2;

      // Total inversion count = left subarray count
      // + right subarray count + merge count

      // Left subarray count
      count += mergeSortAndCount(arr, l, m);

      // Right subarray count
      count += mergeSortAndCount(arr, m + 1, r);

      // Merge count
      count += mergeAndCount(arr, l, m, r);
    }

    return count;
  }

}
