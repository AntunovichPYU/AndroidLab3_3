package com.example.androidlab3_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlab3_3.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val binding = ActivityMain3Binding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            )
        }

        binding.bnToSecond.setOnClickListener {
            finish()
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