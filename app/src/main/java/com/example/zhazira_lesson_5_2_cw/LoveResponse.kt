package com.example.zhazira_lesson_5_2_cw

import com.google.gson.annotations.SerializedName

class LoveResponse(
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String
) {
}