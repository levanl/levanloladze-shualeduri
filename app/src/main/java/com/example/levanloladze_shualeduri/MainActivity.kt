package com.example.levanloladze_shualeduri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private lateinit var nextPageBtn: AppCompatButton
    private lateinit var emailEt: EditText
    private lateinit var button_send: AppCompatButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emailEt = findViewById(R.id.email_leo)
        nextPageBtn = findViewById(R.id.next_button)

        button_send = findViewById(R.id.okay_button)
        nextPageListeners()
        relayEmail()
    }




    private fun nextPageListeners() {
        nextPageBtn.setOnClickListener{
            startActivity(Intent(this, secondActivity::class.java))
        }
    }

    private fun relayEmail() {
        button_send.setOnClickListener {
            val email = emailEt.text.toString()
            val intent = Intent(this@MainActivity, secondActivity::class.java)
            intent.putExtra("Email", email)
            startActivity(intent)
        }
    }
}