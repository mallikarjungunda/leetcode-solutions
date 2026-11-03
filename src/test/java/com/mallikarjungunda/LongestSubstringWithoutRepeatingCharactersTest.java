package com.mallikarjungunda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void findsLongestSubstringWithNoRepeatedCharacters() {
        assertLength(3, "abcabcbb");
    }

    @Test
    void handlesAllRepeatedCharacters() {
        assertLength(1, "bbbbb");
    }

    @Test
    void handlesEmptyString() {
        assertLength(0, "");
    }

    private void assertLength(int expected, String input) {
        assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.maxLengthOfSubString(input));
        assertEquals(expected, LongestSubstringWithoutRepeatingCharacters.maxLengthOfSubString2(input));
    }
}
