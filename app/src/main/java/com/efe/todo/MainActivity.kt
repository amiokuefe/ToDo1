package com.efe.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val validUsername = "admin"
    val validPassword = "admin"
    // the above simulates stored record from a DB

    private lateinit var usernameInput: EditText

    private lateinit var passwordInput: EditText

    private lateinit var submitButton: Button

    // the above Declared Variables will accommodate the values from the xml elements

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.usernameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitButton = findViewById(R.id.submitButton)
        // the above lines of code targets the xml elements bearing the corresponding id names just like in JavaScript getElementByID

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            // retrieves the user input and converts them to strings

            login(username, password)
            // stores the user string input
        } // this is event handler in action
    }

    private fun login(username: String, password:String) {
        if(isValidCredentials(username, password)){
            val intent: Intent = Intent(this, HomeActivity::class.java)
            // here we redirect the user to new page via "HomeActivity.kt" using the Intent Class
            intent.putExtra("Welcome Sonia", username)
            startActivity(intent)
            // let's see if the above line of code shoots the redirect

        } else {
            Toast.makeText(applicationContext, "Please provide valid Log in Details", Toast.LENGTH_SHORT).show()
        }
    } // This function determines what will happen if log in is successful or not. i.e. it's like a controller in MVC

    private fun isValidCredentials(username: String, password: String): Boolean {
        if(username == validUsername && password == validPassword) return true
        // 'return' keyword exits a function
        return false
        //the above is the else statement
    } // This function just validates the user input

}