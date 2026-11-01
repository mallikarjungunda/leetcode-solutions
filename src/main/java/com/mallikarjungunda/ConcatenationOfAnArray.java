package com.mallikarjungunda;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * Specifically, ans is the concatenation of two nums arrays.
 *
 * Return the array ans.
 */
public class ConcatenationOfAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
       concatArrayUsingSteams(arr);
        concarArrayUsingArrayClass(arr);
    }

    private static int[] concarArrayUsingArrayClass(int[] arr){
        int[] ans = new int[arr.length + arr.length];
        System.arraycopy(arr, 0, ans, 0, arr.length);
        System.arraycopy(arr, 0, ans, arr.length, arr.length);
        System.out.println("Using Array Class "+Arrays.toString(ans));

        return ans;
    }
    private static int[] concatArrayUsingSteams(int[] arr){
        int[] ans = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr)).toArray();

        System.out.println("Streams Array " + Arrays.toString(ans));
        return ans;
    }
}
