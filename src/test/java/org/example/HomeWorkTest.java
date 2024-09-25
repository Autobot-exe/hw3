package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWorkTest {

    private final HomeWork homework = new HomeWork();

    @Test
    void testUniqueCharacters() {
        assertEquals("abc", homework.findMaxSubstring("abc"));
    }

    @Test
    void testRepeatingCharacters() {
        assertEquals("abcd", homework.findMaxSubstring("abcddcba"));
    }

    @Test
    void testEndingWithUniqueCharacter() {
        assertEquals("dcbaX", homework.findMaxSubstring("abcddcbaX"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals("!@#$%^&*()", homework.findMaxSubstring("!@#$%^&*()!@#"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", homework.findMaxSubstring(""));
    }

    @Test
    void testSingleCharacterString() {
        assertEquals("a", homework.findMaxSubstring("a"));
        assertEquals("b", homework.findMaxSubstring("b"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals("a", homework.findMaxSubstring("aaaaaa"));
        assertEquals("b", homework.findMaxSubstring("bbbbbb"));
    }

    @Test
    void testLongStringWithMixedCharacters() {
        assertEquals("xyz", homework.findMaxSubstring("xyzxyzxyz"));
        assertEquals("abcdefg", homework.findMaxSubstring("abcdefgabcdefg"));
        assertEquals("1234567890", homework.findMaxSubstring("12345678901234567890"));
    }
}