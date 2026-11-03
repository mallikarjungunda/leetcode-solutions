package com.mallikarjungunda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianofTwoSortedArraysTest {
    @Test
    void findsMedianWhenCombinedLengthIsOdd() {
        assertEquals(2.0, MedianofTwoSortedArrays.calculateMedian(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    void findsMedianWhenCombinedLengthIsEven() {
        assertEquals(2.5, MedianofTwoSortedArrays.calculateMedian(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void handlesOneEmptyArray() {
        assertEquals(3.0, MedianofTwoSortedArrays.calculateMedian(new int[0], new int[]{1, 3, 5}));
    }
}
