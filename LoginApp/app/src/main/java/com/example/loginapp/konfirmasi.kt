package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class konfirmasi : AppCompatActivity() {

    lateinit var endBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konfirmasi)

        endBtn = findViewById(R.id.end_btn)

        endBtn.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }
    }
}