package com.example.coffeeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class applogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_applogin)

        val getmain = findViewById<Button>(R.id.btnlogin)
        getmain.setOnClickListener {
            val intent = Intent(this, Page01::class.java)
            startActivity(intent)
        }

        val getsign = findViewById<Button>(R.id.signupbtn)
        getsign.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}