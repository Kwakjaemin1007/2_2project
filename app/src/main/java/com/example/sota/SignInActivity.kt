package com.example.sota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.sota.databinding.ActivitySignInBinding
import com.example.sota.databinding.ActivityStartBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    //code for firebase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_sign_in)

        //listener for signin button

        //listener for register button
        val register = findViewById<ImageButton>(R.id.registerBtn)
        register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}