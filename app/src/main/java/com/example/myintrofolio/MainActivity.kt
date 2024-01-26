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
        val btnOpenActivityAbout: Button = findViewById(R.id.btnabout)
        val btnOpenActivityProfessionalMe: Button = findViewById(R.id.btnprofessional)

        // Set click listener for the button
        btnOpenActivityAbout.setOnClickListener {
            // Add code to handle button click event
            Intent(this,About::class.java).also {
                startActivity(it)
            }
        }
        btnOpenActivityProfessionalMe.setOnClickListener{
            Intent(this,ProfessionalMe::class.java).also {
                startActivity(it)
            }
        }
        }

    }
j
