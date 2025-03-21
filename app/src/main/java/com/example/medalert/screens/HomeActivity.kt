package com.example.medalert.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medalert.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        // BottomNavigationView setup
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Handle Home click
                    true
                }
                R.id.nav_remainders -> {
                    // Handle Remainders click
                    true
                }
                R.id.nav_add -> {
                    // Handle Add click
                    true
                }
                R.id.nav_health -> {
                    // Handle Health click
                    true
                }
                R.id.nav_profile -> {
                    // Handle Profile click
                    true
                }
                else -> false
            }
        }
    }
}