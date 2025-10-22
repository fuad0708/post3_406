package com.example.post3_406


import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFullName = findViewById<EditText>(R.id.etFullName)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val rbMale = findViewById<RadioButton>(R.id.rbMale)
        val rbFemale = findViewById<RadioButton>(R.id.rbFemale)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val pass = etPassword.text.toString()
            val confirm = etConfirmPassword.text.toString()

            if (pass != confirm) {
                Toast.makeText(this, "Password tidak sama!", Toast.LENGTH_SHORT).show()
            } else {
                val gender = if (rbMale.isChecked) "Laki-laki" else "Perempuan"

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("name", etFullName.text.toString())
                intent.putExtra("username", etUsername.text.toString())
                intent.putExtra("umur", etAge.text.toString())
                intent.putExtra("email", etEmail.text.toString())
                intent.putExtra("gender", gender)
                startActivity(intent)
            }
        }
    }
}
