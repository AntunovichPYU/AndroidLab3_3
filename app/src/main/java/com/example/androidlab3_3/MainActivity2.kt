package com.example.androidlab3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlab3_3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener {
            finish()
        }

        binding.bnToThird.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        binding.navView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.about_text) {
                startActivity(Intent(this, ActivityAbout::class.java))
                return@setOnItemSelectedListener true
            }
            false
        }

        setContentView(binding.root)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}