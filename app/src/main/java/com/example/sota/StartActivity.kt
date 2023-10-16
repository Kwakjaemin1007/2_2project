package com.example.sota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sota.databinding.ActivityStartBinding
import android.widget.ImageButton

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    //code for firebase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}