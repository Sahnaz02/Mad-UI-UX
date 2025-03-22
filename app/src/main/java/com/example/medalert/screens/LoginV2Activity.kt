package com.example.medalert.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.medalert.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class LoginV2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_v2)

        val btnTakeNow = findViewById<Button>(R.id.btnTakeNow)
        btnTakeNow.setOnClickListener {
            val intent = Intent(this, ViewMedTaken::class.java)
            startActivity(intent)
        }

        val btnSnooze = findViewById<Button>(R.id.btnSnooze)
        btnSnooze.setOnClickListener {
            val intent = Intent(this, ViewSnoozeActivity::class.java)
            startActivity(intent)
        }


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