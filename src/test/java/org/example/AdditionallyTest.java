package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdditionallyTest {

    private final HomeWork homework = new HomeWork();

    @Test
    void testValidPangram() {
        assertTrue(homework.check("The quick brown fox jumps over the lazy dog"));
        assertTrue(homework.check("Pack my box with five dozen liquor jugs"));
        assertTrue(homework.check("Sphinx of black quartz, judge my vow"));
    }

    @Test
    void testInvalidPangram() {
        assertFalse(homework.check("Hello World"));
        assertFalse(homework.check("Java Programming"));
        assertFalse(homework.check("The quick brown fox"));
    }

    @Test
    void testEdgeCases() {
        assertTrue(homework.check("abcdefghijklmnopqrstuvwxyz"));
        assertFalse(homework.check(""));
        assertFalse(homework.check("1234567890"));
        assertFalse(homework.check("A quick movement of the enemy will jeopardize five gunboats."));
    }

    @Test
    void testMixedCase() {
        assertTrue(homework.check("The Quick Brown Fox Jumps Over The Lazy Dog"));
        assertTrue(homework.check("aBcDeFgHiJkLmNoPqRsTuVwXyZ"));
    }
}
