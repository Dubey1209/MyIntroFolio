package com.example.myintrofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class ProfessionalMe : AppCompatActivity() {
    lateinit var btn2: Button
    lateinit var toast: Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professional_me)

        btn2 = findViewById(R.id.toast_2)
        btn2.setOnClickListener {
            toast= Toast.makeText(this,"You don’t learn to walk by following rules. You learn by doing and falling over.",Toast.LENGTH_LONG)
            toast.show()
            val duration=700L
            val handler = Handler()
            handler.postDelayed({toast.cancel()},duration)
        }
    }
}