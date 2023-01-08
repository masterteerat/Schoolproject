package com.example.schoolproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.io.File


class Thirdactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)

        Handler().postDelayed({

            val fileName = "data.txt"
            var file = File(fileName)
            var fileExists = file.exists()

            if (fileExists) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, Secondactivity::class.java)
                startActivity(intent)
            }
        }, 2000)
    }
}




