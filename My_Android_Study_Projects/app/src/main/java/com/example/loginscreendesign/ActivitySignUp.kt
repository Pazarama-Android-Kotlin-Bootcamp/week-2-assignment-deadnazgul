package com.example.loginscreendesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginscreendesign.databinding.ActivitySignUp1Binding

class ActivitySignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUp1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUp1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.arrowBackButton.setOnClickListener {
            val intent = Intent(this,ActivityLogin::class.java)
            startActivity(intent)
        }
        val image = binding.ivShowPassward
        binding.ivShowPassward.setOnClickListener {
            image.setImageResource(R.drawable.ic_baseline_visibility_24)
        }
    }
}