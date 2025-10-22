package com.example.post3_406

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvUser = findViewById<TextView>(R.id.tvUser)
        val tvUmur = findViewById<TextView>(R.id.tvUmur)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvGender = findViewById<TextView>(R.id.tvGender)

        val name = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")
        val umur = intent.getStringExtra("umur")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")

        tvName.text = "Full Name: $name"
        tvUser.text = "User Name: $username"
        tvUmur.text = "Umur: $umur"
        tvEmail.text = "Email: $email"
        tvGender.text = "Gender: $gender"
    }
}
