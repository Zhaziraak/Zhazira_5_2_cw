package com.example.zhazira_lesson_5_2_cw

import android.content.Context
import android.telecom.Call
import retrofit2.Retrofit
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface LoveApiService {

    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-Rapidapi-Key") apiKey: String,
        @Header("X-Rapidapi-Host") apiHost: String
    ): retrofit2.Call<LoveResponse>


}