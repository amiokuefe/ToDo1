package com.efe.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView

    private lateinit var nav: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = "Welcome, ${intent.getStringExtra("Welcome Sonia")}"
        // the above reminds me of getElementsById.textContent
        // Also the above line of code (RHS) fetches the username variable from MainActivity.kt

        nav = findViewById(R.id.button1)

        nav.setOnClickListener {
            navProfile()
        }
    }


    private fun navProfile() {
        val intent: Intent = Intent(this, profileActivity::class.java)
        startActivity(intent)
    }





}