package com.example.myintrofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class MyLife : AppCompatActivity() {

    lateinit var btn3: Button
    lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_life)

        btn3 = findViewById(R.id.toast_3)
        btn3.setOnClickListener {
            toast= Toast.makeText(this,"Family is not an important thing. It's everything !",Toast.LENGTH_LONG)
            toast.show()
            val duration = 700L
            val handler = Handler()
            handler.postDelayed({ toast.cancel() }, duration)
        }
    }
}