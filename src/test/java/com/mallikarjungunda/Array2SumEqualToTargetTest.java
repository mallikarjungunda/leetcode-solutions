package com.mallikarjungunda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Array2SumEqualToTargetTest {
    @Test
    void findsPairInFirstExample() {
        assertArrayEquals(
                new int[]{0, 1},
                Array2SumEqualToTarget.twoSumArray(new int[]{2, 7, 11, 15}, 9)
        );
    }

    @Test
    void findsPairNotAtBeginning() {
        assertArrayEquals(
                new int[]{1, 2},
                Array2SumEqualToTarget.twoSumArray(new int[]{3, 2, 4}, 6)
        );
    }

    @Test
    void findsPairWithDuplicateValuesAtDifferentIndices() {
        assertArrayEquals(
                new int[]{0, 1},
                Array2SumEqualToTarget.twoSumArray(new int[]{3, 3}, 6)
        );
    }
}
