package com.dineshprabha.quoteapp.utils

import org.junit.Assert
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        val sut = Utils()
        val result = sut.validatePassword(" ")
        Assert.assertEquals("Password is required field", result)
    }

    @Test
    fun validatePassword_twoCharInput_expectedValidationMsg(){
        val sut = Utils()
        val result = sut.validatePassword("ab")
        Assert.assertEquals("Length of the password should be grater than 6", result)
    }

    @Test
    fun validatePassword_moreCharInput_expectedValidationMsg(){
        val sut = Utils()
        val result = sut.validatePassword("abcdefghijkjhsdgf")
        Assert.assertEquals("Length of the password should be less than 15", result)
    }

    @Test
    fun validatePassword_validPassword_expectedValidationMsg(){
        val sut = Utils()
        val result = sut.validatePassword("Prabha#98")
        Assert.assertEquals("valid", result)
    }


}