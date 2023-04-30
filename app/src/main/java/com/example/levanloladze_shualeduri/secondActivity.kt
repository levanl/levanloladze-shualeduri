package com.example.levanloladze_shualeduri

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class secondActivity : AppCompatActivity() {
    private lateinit var increaseButton: AppCompatButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val email = intent.getStringExtra("Email")

        val resultEmail = findViewById<TextView>(R.id.thisIsEmail)
        resultEmail.text = "Email: "+email
        var numberinio = findViewById<TextView>(R.id.numberinio)


        increaseButton = findViewById(R.id.increase_button)
        increaseButton.setOnClickListener {
            numberinio = (numberinio) * 2;
            numberinio.text = numberinio.toString()
        }
    }


}