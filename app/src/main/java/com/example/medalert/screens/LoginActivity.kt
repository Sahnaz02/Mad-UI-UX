package com.example.medalert.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ToggleButton
import com.example.medalert.R

class LoginActivity : AppCompatActivity() {
    private lateinit var toggleButton: ToggleButton
    private lateinit var loginButton: Button
    private lateinit var signUpButton: Button
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var forgotPasswordText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Initialize UI elements
        toggleButton = findViewById(R.id.toggleLoginSignUp)
        loginButton = findViewById(R.id.loginButton)
        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        passwordEditText = findViewById(R.id.editTextTextPassword)
        confirmPasswordEditText = findViewById(R.id.editTextTextPasswordConfirm)
        forgotPasswordText = findViewById(R.id.forgotPassword)

        // Initially, only the login button should be visible
        toggleButton.textOn = "SIGN UP"
        toggleButton.textOff = "LOGIN"

        // Handle toggle button state change
        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Show Sign Up form
                loginButton.text = "SIGN UP"
                confirmPasswordEditText.visibility = EditText.VISIBLE // Show confirm password field
            } else {
                // Show Login form
                loginButton.text = "LOGIN"
                confirmPasswordEditText.visibility = EditText.GONE // Hide confirm password field
            }
        }

        // Handle login or sign-up button click
        loginButton.setOnClickListener {
            if (toggleButton.isChecked) {
                // Handle Sign Up logic
                // Example: Collect email, password, and confirm password fields
                val email = emailEditText.text.toString()
                val password = passwordEditText.text.toString()
                val confirmPassword = confirmPasswordEditText.text.toString()

                if (password == confirmPassword) {
                    // Sign Up logic
                } else {
                    // Show error for mismatched passwords
                }
            } else {
                // Handle Login logic
                // Example: Collect email and password fields
                val email = emailEditText.text.toString()
                val password = passwordEditText.text.toString()

                // Login logic
            }
        }
    }
}