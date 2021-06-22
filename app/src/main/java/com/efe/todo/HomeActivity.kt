package com.efe.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = "Welcome, ${intent.getStringExtra("Welcome Sonia")}"
        // the above reminds me of getElementsById.textContent
        // Also the above line of code (RHS) fetches the username variable from MainActivity.kt
    }
}