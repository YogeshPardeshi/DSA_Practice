public class ArrayPractice
{
    public int [] smallerNumberThanCurrent(int [] nums) {

        int [] buckets = new int[101];

        for (int num : nums)  {
            buckets[num]++;
        }
        for (int i = 1; i < buckets.length; i++) {
            buckets[i] += buckets[i-1];
        }
        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int position = nums[i];

            if (position == 0) result[i] =0;
            else
                result[i] = buckets[position -1];

        }

        return result;
    }

    /**
     *  max product [2,3,-2,-5,6,-1,4]
     * @param array
     * @return
     */
    public int maxProduct(int [] array) {
        int  maxProduct = 1;
        int  leftProduct = 1;
        int  rightProduct = 1;

        int i = 0;
        int j = array.length -1;

        while (i < array.length && j >= 0) {

           leftProduct = leftProduct * array[i] ;
           rightProduct = rightProduct * array[j];
            maxProduct = Math.max(Math.max(leftProduct, rightProduct), maxProduct);
            i++;
            j--;
        }
        return maxProduct;
    }
//int [] input = {8,0,2,0,3};
     public int [] shiftZero (int [] inputArray) {
        int insertPosition = 0;
         for (int i = 0; i < inputArray.length; i++) {

             if (inputArray[i] != 0) {
                 inputArray[insertPosition] = inputArray[i];
                 insertPosition++;
             }

         }

         while (insertPosition < inputArray.length) {
             inputArray[insertPosition] = 0;
             insertPosition++;
         }
        return inputArray;
     }

    public void partitionArray (int [] inputArray) {
        int j = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] >= 0) {

                if (i != j) {

                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }

                j++;
            }
        }


    }

    /**
     *  rotate an array k times
     * @param inputArray
     * @param k
     * reveral an array using reverse algorithm
     */
    public void rotateArray (int [] inputArray, int k) {

        int n = inputArray.length;
        if(k<0) {
            k = k+n;
        }
        if (k> n) {
            k = k%n;
        }

        reverse( inputArray , n -k, n-1);
        reverse( inputArray , 0, n-k -1);
        reverse( inputArray , 0, n-1);

    }

    public void  reverse(int[] inputArray, int start, int end) {

        for (int i = start; i < end; i++) {

            int temp  = inputArray[i];
            inputArray[i] = inputArray[end];
            inputArray[end] = temp;
            end --;
        }
    }

    // input ==> [1,2,3,4]
    // output ==> [2,3,4,1]
    // this is using temp variable or called one by one
    // time complexity is n*K -. k is number of time rotation
    public static void rotateArrayOnceClockWise(int [] arr ) {
        int temp  = arr[0];
        for (int i = 0; i < arr.length -1; i++) {

            arr[i] = arr[i+1];

        }
        arr[arr.length - 1] = temp;
    }

    // input ==> [1,2,3,4]
    // output ==> [4,1,2,3]
    // this is using temp variable or called one by one
    // time complexity is n*K -. k is number of time rotation
    public static void rotateArrayOnceCounterClockwise(int [] arr ) {
        int n = arr.length -1;
        int temp  = arr[n];
        for (int i = n; i > 0 ; i--) {

            arr[i] = arr[i-1];

        }
        arr[0] = temp;
    }
    // output [  5 , 6 , 1 , 2 , 3 , 4 ]
    // input  [  1,  2,  3,  4,  5,  6 ]
    // k ==2
    public static void rotateArrayClockWise(int [] arr, int r ) {
       r %= arr.length;
       int temp, prev;
       
        for (int i = 0; i < r; i++) {
            prev = arr[arr.length -1];
            for (int j = 0; j < arr.length; j++) {
                temp = arr[j];
                arr[j] = prev;
                prev = temp;
                
            }
            
        }
    }
    // output [  3 , 4 , 5 , 6 , 1 , 2 ]
    // input  [  1,  2,  3,  4,  5,  6 ]
    // k ==2
    public static void rotateArrayAntClockWise(int [] arr, int r ) {
        r %= arr.length;
        int temp, prev;

        for (int i = 0; i < r; i++) {
            prev = arr[0];
            for (int j = arr.length -1; j >=0; j--) {
                temp = arr[j];
                arr[j] = prev;
                prev = temp;

            }

        }
    }

    // output [  3 , 4 , 5 , 6 , 1 , 2 ]
    // input  [  1,  2,  3,  4,  5,  6 ]
    // k ==2
    public static void rotateRightArrayUsingAuxArray(int [] arr, int r ) {
        r %= arr.length;
        int n = arr.length;
         int temp [] = new int[arr.length];

        for (int i = 0; i < n; i++) {
            temp[(i+r)%n] = arr[i];
            }

        for (int i = 0; i < n ; i++) {
            arr[i] = temp[i];
        }
    }
    // output [  3 , 4 , 5 , 6 , 1 , 2 ]
    // input  [  1,  2,  3,  4,  5,  6 ]
    // k ==2
    public static void rotateLeftArrayUsingAuxArray(int [] arr, int r ) {

        int n = arr.length;
        r %= n;
        int temp [] = new int[arr.length];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i+r)%n];
        }

        for (int i = 0; i < n ; i++) {
            arr[i] = temp[i];
        }
    }
    public  void rightRotateJA(int [] arr, int r, int n) {

        r = r % n;
        r = n - r;
        int i,j, k, temp;

        int gcd = findGCD(r,n);

        for (i = 0; i < gcd; i++) {
            temp = arr[n -i -1];
            j = n -i -1;

            while (true) {
                k = (j+r) % n;
                if( k == n - i -1) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

    }

    public void leftRotateJA(int [] arr, int r, int n) {

        r = r % n;

        int i,j, k, temp;

        int gcd = findGCD(r,n);

        for (i = 0; i < gcd; i++) {
            temp = arr[i];
            j =i;

            while (true) {
                k = (j+r) % n;
                if( k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }

    }
    public  static int findGCD(int a, int b) {

        if(b == 0 ) {
            return a;
        }
        int i = a % b;
        return findGCD(a,i);
    }

    public int findEquilibriumIndex(int arr []) {

        int sumSF,maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSum = maxSum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {

        }

        return -1;
    }
        public void printArray(int [] input) {
        System.out.print("[ ");
         for (int i = 0; i < input.length; i++) {
             System.out.print(" ");
             System.out.print(input[i]);
             if (i != input.length -1)
             System.out.print(" ,");

         }
         System.out.print(" ]");
     }

     public String longestPalindrome (String inputString) {
         int start = 0;
         int end = 0;
         for (int i = 0; i < inputString.length(); i++) {
             int len1 = expandFromMiddle(inputString, i, i);
             int len2 = expandFromMiddle(inputString, i, i + 1);
             int len = Math.max(len1,len2);
             if (len1 > end - start) {
                 start = i - ((len -1)/2);
                 end = i+ (len/2);
             }
        }
        return inputString.substring(start, end+1);
     }


    private int expandFromMiddle(String inputString, int left, int right) {
        if (inputString == null || inputString.length() ==0) return 0;

        while (left >= 0 && right < inputString.length() && inputString.charAt(left) == inputString.charAt(right)) {
            left--;
            right++;
        }

        return right -left -1;
    }
}
