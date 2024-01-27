package com.example.myintrofolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize the buttons
        val btnOpenActivityAbout: Button = findViewById(R.id.btnabout)
        val btnOpenActivityProfessionalMe: Button = findViewById(R.id.btnprofessional)
        val btnOpenActivityMyLife: Button = findViewById(R.id.myFamily)
        // Set click listeners for the buttons
        btnOpenActivityAbout.setOnClickListener {
            Intent(this, About::class.java).also {
                startActivity(it)
            }
        }
        btnOpenActivityProfessionalMe.setOnClickListener {
            Intent(this, ProfessionalMe::class.java).also {
                startActivity(it)
            }
        }
        btnOpenActivityMyLife.setOnClickListener {
            Intent(this, MyLife::class.java).also {
                startActivity(it)
            }
        }
        // Accessing EditText and TextView assuming they are in the same layout
        val etUsername = findViewById<EditText>(R.id.etusername)
        val etUserHobbie = findViewById<TextView>(R.id.etuserhobbie)
        // Accessing Button for User Information
        val btnOpenActivityUser : Button = findViewById(R.id.btnfriends)
        // Set click listener for the User Information button
        btnOpenActivityUser.setOnClickListener {
            // Get the text from EditText and TextView
            val uname = etUsername.text.toString()
            val uhobbie = etUserHobbie.text.toString()
            // Start UserInformation activity
            Intent(this, UserInformation::class.java).also {
                // Passing data via Intent extras
                it.putExtra("EXTRA_NAME", uname)
                it.putExtra("EXTRA_HOBBIES", uhobbie)
                startActivity(it)
            }
        }
    }
}
