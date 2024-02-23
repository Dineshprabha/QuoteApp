package com.dineshprabha.quoteapp.utils

import com.dineshprabha.quoteapp.MainCoroutineRule

import kotlinx.coroutines.test.runTest

import org.junit.Rule
import org.junit.Test

class CoroutineUtilsTest {

    //create MainCoroutineRule class and override the start and stop methods
    @get:Rule
    val mainCoroutineRule = MainCoroutineRule()

    @Test
    fun testGetUserName(){
        val sut = CoroutineUtils(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getUserName()
        }
    }

    @Test
    fun testGetUser(){
        val sut = CoroutineUtils(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getUser()
        }
    }

    @Test
    fun testGetAddress(){
        val sut = CoroutineUtils(mainCoroutineRule.testDispatcher)
        runTest {
            sut.getAddress()
        }
    }



}