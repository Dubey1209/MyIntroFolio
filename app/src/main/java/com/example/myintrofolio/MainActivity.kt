package com.example.myintrofolio

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize the buttons
        val btnRequestPermission : Button = findViewById(R.id.permission)
        val btnOpenActivityAbout: Button = findViewById(R.id.btnabout)
        val btnOpenActivityProfessionalMe: Button = findViewById(R.id.btnprofessional)
        val btnOpenActivityMyLife: Button = findViewById(R.id.myFamily)
        // Set click listeners for the buttons


        btnRequestPermission.setOnClickListener {
            requestPermission()
        }

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
        val btnOpenActivityUser: Button = findViewById(R.id.btnfriends)
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

    private fun hasWriteExternalStoragePermission() =
        ActivityCompat.checkSelfPermission(
            this,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED


    private fun hasLocationForegroundPermission() =
        ActivityCompat.checkSelfPermission(
            this,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED


    private fun hasLocationBackgroundPermission() =
        ActivityCompat.checkSelfPermission(
            this,
            Manifest.permission.ACCESS_BACKGROUND_LOCATION
        ) == PackageManager.PERMISSION_GRANTED

    private fun requestPermission() {
        var permissionToRequest = mutableListOf<String>()
        if (hasWriteExternalStoragePermission()) {
            permissionToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }
        if (hasLocationForegroundPermission()) {
            permissionToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
        if (hasLocationBackgroundPermission()) {
            permissionToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }
        if(permissionToRequest.isNotEmpty()){
            ActivityCompat.requestPermissions(this,permissionToRequest.toTypedArray(),0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==0 && grantResults.isNotEmpty()){
            for(i in grantResults.indices ){
                if(grantResults[i]==PackageManager.PERMISSION_GRANTED){
                    Log.d("PermissionsRequest","${permissions[i]} granted.")
                }
            }
        }
    }
}
