package com.dineshprabha.quoteapp.utils

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    private val utils = Utils()
    @Test
    fun testStringReversal_EmptySting_expectedEmptyString(){
        val sut = Utils()
        val result = sut.reverseString("")
        Assert.assertEquals("", result)
    }

    @Test
    fun testStringReversal_SingleChar_expectedSingleChar(){
        val sut = Utils()
        val result = sut.reverseString("a")
        Assert.assertEquals("a", result)
    }

    @Test
    fun testStringReversal_ValidInput_expectedValidInput(){
        val sut = Utils()
        val result = sut.reverseString("Prabha")
        Assert.assertEquals("ahbarP", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testStringReversal_NullValue_expectedException(){
        val sut = Utils()
        val result = sut.reverseString(null)
        Assert.assertEquals("", result)
    }

    @Test
    fun testIsPalindromeForSingleCharacterString() {
        val input = "a"
        Assert.assertTrue(utils.isPalindrome(input))
    }

    @Test
    fun testReverseString() {
        val input = "hello"
        val expected = "olleh"
        Assert.assertEquals(expected, utils.reverseString(input))
    }

    @Test(expected = IllegalArgumentException::class)
    fun testReverseStringForNullInput() {
        utils.reverseString(null)
    }

    @Test
    fun testReverseStringForEmptyString() {
        val input = ""
        Assert.assertEquals("", utils.reverseString(input))
    }
}