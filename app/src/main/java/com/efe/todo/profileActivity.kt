package com.efe.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profileActivity : AppCompatActivity() {

    private lateinit var nav: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nav = findViewById(R.id.button1a)

        nav.setOnClickListener {
            navProfile()
        }
    }

    private fun navProfile() {
        val intent: Intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}