package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class Thirdactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)
        Handler().postDelayed({
            val intent = Intent(this,Secondactivity::class.java)
            startActivity(intent)
        }, 2000)

    }
}




