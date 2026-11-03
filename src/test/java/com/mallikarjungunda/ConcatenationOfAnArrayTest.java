package com.mallikarjungunda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcatenationOfAnArrayTest {
    @Test
    void concatenatesArrayUsingArrayCopy() {
        assertArrayEquals(
                new int[]{1, 2, 1, 2},
                ConcatenationOfAnArray.concarArrayUsingArrayClass(new int[]{1, 2})
        );
    }

    @Test
    void concatenatesArrayUsingStreams() {
        assertArrayEquals(
                new int[]{1, 2, 1, 2},
                ConcatenationOfAnArray.concatArrayUsingSteams(new int[]{1, 2})
        );
    }

    @Test
    void handlesEmptyArray() {
        assertArrayEquals(
                new int[0],
                ConcatenationOfAnArray.concarArrayUsingArrayClass(new int[0])
        );
        assertArrayEquals(
                new int[0],
                ConcatenationOfAnArray.concatArrayUsingSteams(new int[0])
        );
    }

    @Test
    void preservesNegativeValuesAndOrder() {
        int[] input = {-1, 3, 0};
        int[] expected = {-1, 3, 0, -1, 3, 0};

        assertArrayEquals(expected, ConcatenationOfAnArray.concarArrayUsingArrayClass(input));
        assertArrayEquals(expected, ConcatenationOfAnArray.concatArrayUsingSteams(input));
    }

    @Test
    void concatenatesArraySpecifiedNumberOfTimes() {
        assertArrayEquals(
                new int[]{4, 5, 4, 5, 4, 5},
                ConcatenationOfAnArray.getConcatenation(new int[]{4, 5}, 3)
        );
    }

    @Test
    void returnsEmptyArrayWhenRepeatCountIsZero() {
        assertArrayEquals(new int[0], ConcatenationOfAnArray.getConcatenation(new int[]{4, 5}, 0));
    }
}
