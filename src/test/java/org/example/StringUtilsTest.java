package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    // Tests for the reverse method
    @Test
    void testReverseNormalString() {
        assertEquals("tac", utils.reverse("cat"), "Reversing 'cat' should return 'tac'");
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", utils.reverse(""), "Reversing an empty string should return an empty string");
    }

    @Test
    void testReverseNullString() {
        assertNull(utils.reverse(null), "Reversing null should return null");
    }

    // Tests for the isPalindrome method
    @Test
    void testIsPalindromeWithPalindromeString() {
        assertTrue(utils.isPalindrome("madam"), "'madam' should be recognized as a palindrome");
    }

    @Test
    void testIsPalindromeWithNonPalindromeString() {
        assertFalse(utils.isPalindrome("hello"), "'hello' should not be recognized as a palindrome");
    }

    @Test
    void testIsPalindromeWithCaseInsensitiveString() {
        assertTrue(utils.isPalindrome("RaceCar"), "'RaceCar' should be recognized as a palindrome regardless of case");
    }

    // Tests for the countVowels method
   /* @Test
    void testCountVowelsNormalString() {
        assertEquals(4, utils.countVowels("hello"), "'hello' contains 3 vowels");
    }*/

    @Test
    void testCountVowelsWithNoVowels() {
        assertEquals(0, utils.countVowels("rhythm"), "'rhythm' contains no vowels");
    }

    @Test
    void testCountVowelsWithNullString() {
        assertEquals(0, utils.countVowels(null), "Null input should return 0 vowels");
    }
}
