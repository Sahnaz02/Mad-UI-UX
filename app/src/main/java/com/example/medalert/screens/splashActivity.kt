package com.example.medalert.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.example.medalert.R

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Get reference to the "Get Started" button
        val btnGetStarted: Button = findViewById(R.id.btn_getStarted)

        // Set OnClickListener to navigate to LoginActivity when clicked
        btnGetStarted.setOnClickListener {
            // Navigate to LoginActivity when the "Get Started" button is clicked
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Finish SplashActivity so the user can't go back to it
        }
    }
}