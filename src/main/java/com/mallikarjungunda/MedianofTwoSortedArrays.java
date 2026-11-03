package com.mallikarjungunda;

import java.util.Arrays;
import java.util.List;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = new int[] {1,3};
        int[] arr2 = new int[] {2};

        double result = calculateMedian(arr1, arr2);
        System.out.println(result);
    }

    static double calculateMedian(int[] nums1, int[] nums2) {
        double median = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        mergedArray = Arrays.stream(mergedArray).sorted().toArray();
        System.out.println(Arrays.toString(mergedArray));
        int div = mergedArray.length/2;

        if(mergedArray.length %2 ==0) {
            median = (double) (mergedArray[div - 1] + mergedArray[div]) /2 ;
        } else{
            median = mergedArray[div];
        }

        return median;
    }
}
