package com.example.zhazira_lesson_5_2_cw

import retrofit2.http.GET
import retrofit2.http.Header
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