package com.dineshprabha.quoteapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface QuotesDao {

    @Insert
    suspend fun insertQuote(quote: Quote)

    @Update
    suspend fun updateQuote(quote: Quote)

    @Query("DELETE From quote")
    suspend fun delete()

    @Query("SELECT * From quote")
    fun getQuotes(): LiveData<List<Quote>>

    @Query("SELECT * From quote WHERE id = :quoteId")
    suspend fun getQuoteById(quoteId: Int): Quote
}