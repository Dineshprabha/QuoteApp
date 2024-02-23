package com.dineshprabha.quoteapp.utils

import org.junit.Assert
import org.junit.Test

class PalindromeStringTest {

    private val utils = Utils()

    @Test
    fun isPalindrome() {
        //Arrange
        val sut = utils

        //Act
        val result = sut.isPalindrome("hello")

        //Assert
        Assert.assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_level_ExpectedTrue() {
        //Arrange
        val sut = Utils()

        //Act
        val result = sut.isPalindrome("level")

        //Assert
        Assert.assertEquals(true, result)
    }

    @Test
    fun testIsPalindromeForPalindromeString() {
        val input = "madam"
        Assert.assertTrue(utils.isPalindrome(input))
    }

    @Test
    fun testIsPalindromeForNonPalindromeString() {
        val input = "hello"
        Assert.assertFalse(utils.isPalindrome(input))
    }

    @Test
    fun testIsPalindromeForEmptyString() {
        val input = ""
        Assert.assertTrue(utils.isPalindrome(input))
    }

    @Test
    fun testIsPalindromeForSingleCharacterString() {
        val input = "a"
        Assert.assertTrue(utils.isPalindrome(input))
    }
}