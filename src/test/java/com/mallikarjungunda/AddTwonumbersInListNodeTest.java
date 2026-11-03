package com.mallikarjungunda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddTwonumbersInListNodeTest {
    @Test
    void addsNumbersWithDifferentLengths() {
        assertSum(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8});
    }

    @Test
    void carriesAcrossAllDigitsAndAddsFinalCarry() {
        assertSum(new int[]{9, 9, 9}, new int[]{1}, new int[]{0, 0, 0, 1});
    }

    @Test
    void addsSingleDigitNumbersWithoutCarry() {
        assertSum(new int[]{2}, new int[]{3}, new int[]{5});
    }

    private void assertSum(int[] left, int[] right, int[] expected) {
        assertArrayEquals(expected, toArray(AddTwonumbersInListNode.addTwoNumbers(
                AddTwonumbersInListNode.createList(left),
                AddTwonumbersInListNode.createList(right)
        )));
        assertArrayEquals(expected, toArray(AddTwonumbersInListNode.addTwoNumbers2(
                AddTwonumbersInListNode.createList(left),
                AddTwonumbersInListNode.createList(right)
        )));
    }

    private int[] toArray(AddTwonumbersInListNode.ListNode node) {
        int length = 0;
        for (var current = node; current != null; current = current.next) {
            length++;
        }

        int[] values = new int[length];
        int index = 0;
        for (var current = node; current != null; current = current.next) {
            values[index++] = current.val;
        }
        return values;
    }
}
