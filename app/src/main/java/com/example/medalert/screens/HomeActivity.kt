package com.example.medalert.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medalert.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.content.Intent
import android.widget.Button


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val createProfileButton = findViewById<Button>(R.id.btnCreateProfile)
        createProfileButton.setOnClickListener {
            val intent = Intent(this, CreateProfileActivity::class.java)
            startActivity(intent)
        }
        val RemaindersButton = findViewById<Button>(R.id.btnRemainder)
        RemaindersButton.setOnClickListener {
            val intent = Intent(this, ViewRemaindersActivity::class.java)
            startActivity(intent)
        }
        val healthButton = findViewById<Button>(R.id.btnHealthReports)
        healthButton.setOnClickListener {
            val intent = Intent(this, ViewHealthReportsActivity::class.java)
            startActivity(intent)
        }
        val familyButton = findViewById<Button>(R.id.btnFamilyAlerts)
        familyButton.setOnClickListener {
            val intent = Intent(this, LoginV2Activity::class.java)
            startActivity(intent)
        }
        // BottomNavigationView setup
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_remainders -> {
                    val intent = Intent(this, ViewRemaindersActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_add -> {
                    val intent = Intent(this, AddMedicineActivity::class.java)
                    startActivity(intent)
                    // Handle Add click
                    true
                }
                R.id.nav_health -> {
                    val intent = Intent(this, HealthStatusActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_profile -> {
                    val intent = Intent(this, ViewHealthActivity::class.java)
                    startActivity(intent)
                    // Handle Profile click
                    true
                }
                else -> false
            }
        }
    }
}