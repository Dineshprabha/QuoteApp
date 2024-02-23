package com.dineshprabha.quoteapp.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CoroutineUtils(val dispatcher : CoroutineDispatcher) {

    suspend fun getUserName() : String{
        delay(10000)
        return "dinesh"
    }

    suspend fun getUser() : String{
        CoroutineScope(Dispatchers.Main).launch {
            delay(10000)
        }
        return "dinesh"
    }

    suspend fun getAddress() : String{
        withContext(Dispatchers.IO){
            delay(5000)
        }
        return "Address"
    }
}