package com.example.coffeeapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_page01)

        val getMyprofile = findViewById<ImageView>(R.id.imageView5)
        getMyprofile.setOnClickListener {
            val intent = Intent(this, Popularcourses::class.java)
            startActivity(intent)
        }

    }
}