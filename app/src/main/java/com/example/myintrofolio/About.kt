package com.example.myintrofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class About : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var toast: Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btn1 = findViewById(R.id.toast_1)
        btn1.setOnClickListener {
            toast = Toast.makeText(this, "\"Love yourself first and everything else falls into line.\"", Toast.LENGTH_LONG)
            toast.show()
            val duration = 700L
            // Use a Handler to delay the hiding of the Toast
            val handler = Handler()
            handler.postDelayed({ toast.cancel() }, duration)
        }
    }
}