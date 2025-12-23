public class ArrayListMain {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        int [] input = {8,1,2,2,3};
//        int[] outputArray = arrayPractice.smallerNumberThanCurrent(input);
//        System.out.println("output array ==> " + outputArray);
        input = new int[]{2, 3, -2, -5, 6, -1, 4};
        input = new int[]{1,2,3,4, 5,6};
//        int [] intArray =  {5, 3, -3, -4, 0, 2, -1, 4, -7, 2} ;
//        System.out.println("output max product ==> " + arrayPractice.maxProduct(input));
//        arrayPractice.printArray(arrayPractice.shiftZero(input));
        System.out.println();
//        arrayPractice.rotateArray(input,1);
//        arrayPractice.rotateArrayClockWise(input,2);
        arrayPractice.rotateRightArrayUsingAuxArray(input, 2);

        arrayPractice.printArray(input);
//        System.out.println(arrayPractice.longestPalindrome("racecar"));
//        arrayPractice.partitionArray(intArray);
//        System.out.println();
//        arrayPractice.printArray(intArray);
    }







}
