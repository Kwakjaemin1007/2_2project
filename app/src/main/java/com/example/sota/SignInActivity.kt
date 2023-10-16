package com.example.sota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sota.databinding.ActivitySignInBinding
import com.example.sota.databinding.ActivityStartBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    //code for firebase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_sign_in)
    }
}