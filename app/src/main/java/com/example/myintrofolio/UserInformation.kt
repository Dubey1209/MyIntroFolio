package com.example.myintrofolio

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserInformation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information)

        val uname = intent.getStringExtra("EXTRA_NAME")
        val uhobbie = intent.getStringExtra("EXTRA_HOBBIES")
        val userinformation = "Oh Hello My beloved friend $uname !.\nIt's really nice to do friendship with \nyou happy soul $uname.\nHappy to know that your hobbies are $uhobbie\nBUT you know what ?\nMy hobbies are just\nSLEEPING and EATING like a Panda !!!!!  "

        // Initialize friendInformation with the TextView from the layout
        val friendInformation = findViewById<TextView>(R.id.friendInformation)

        // Check if friendInformation is not null before accessing its properties
        friendInformation?.text = userinformation
    }
}
