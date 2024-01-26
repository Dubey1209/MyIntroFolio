package com.example.myintrofolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the button
        val btnOpenActivity: Button = findViewById(R.id.btnabout)

        // Set click listener for the button
        btnOpenActivity.setOnClickListener {
            // Add code to handle button click event
            Intent(this,About::class.java).also {
                startActivity(it)
            }
        }
    }
}
