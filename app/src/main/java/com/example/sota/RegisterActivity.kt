package com.example.sota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.sota.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_register)

        //listener for create account button
        val signin = findViewById<ImageButton>(R.id.createAccountBtn)
        signin.setOnClickListener { //button should be clickable once the user has succeeded in creating an account
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}