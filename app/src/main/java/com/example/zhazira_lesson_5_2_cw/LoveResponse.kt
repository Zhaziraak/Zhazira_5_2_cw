package com.example.zhazira_lesson_5_2_cw

import com.google.gson.annotations.SerializedName
import retrofit2.Call

class LoveResponse(
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    @SerializedName("percentage")
    val percentage: String,
    @SerializedName("result")
    val result: String
)