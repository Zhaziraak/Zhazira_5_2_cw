package com.example.zhazira_lesson_5_2_cw

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frame, FirstFragment()).commit()

        RetrofitService.api.getPercentage(
            firstName = "Aktan",
            secondName = "Akylai",
            apiKey = "fbf5a2febemshf04279602c8350ep1af90djsnf088a9165c3e",
            apiHost = "love-calculator.p.rapidapi.com"
        ).enqueue(object : Callback<LoveResponse>{
            override fun onResponse(p0: Call<LoveResponse>, p1: Response<LoveResponse>) {
                if (p1.isSuccessful && p1.body() != null) {

                }
            }

            override fun onFailure(p0: Call<LoveResponse>, p1: Throwable) {
                Toast.makeText(this@MainActivity, p1.message, Toast.LENGTH_SHORT).show()
            }

        })
        

    }
}