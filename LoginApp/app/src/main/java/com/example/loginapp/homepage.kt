package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homepage : AppCompatActivity() {

    lateinit var seaBtn : ImageButton
    lateinit var airBtn : ImageButton
    lateinit var truckBtn : ImageButton
    lateinit var username : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        seaBtn = findViewById(R.id.sea_btn)
        airBtn = findViewById(R.id.air_btn)
        truckBtn = findViewById(R.id.truck_btn)
        username = findViewById(R.id.username_input)

        val inputnama = intent.getStringExtra("username")

        username.text = inputnama


        seaBtn.setOnClickListener {
            val intent = Intent(this, menusea::class.java)
            startActivity(intent)
            finish()
        }
        airBtn.setOnClickListener {
            val intent = Intent(this, menuair::class.java)
            startActivity(intent)
            finish()
        }
        truckBtn.setOnClickListener {
            val intent = Intent(this, menutruck::class.java)
            startActivity(intent)
            finish()
        }
    }
}