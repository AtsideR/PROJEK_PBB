package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menutruck : AppCompatActivity() {

    lateinit var backBtn : Button
    lateinit var nextBtn : Button
    lateinit var Asal : EditText
    lateinit var Tujuan : EditText
    lateinit var Berat : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menutruck)

        backBtn = findViewById(R.id.backTruck)
        nextBtn = findViewById(R.id.nexttruck)
        Asal = findViewById(R.id.inputasal)
        Tujuan = findViewById(R.id.inputtujuan)
        Berat = findViewById(R.id.inputberat)

        backBtn.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
            finish()
        }
        nextBtn.setOnClickListener {
            val inputAsal = Asal.text.toString()
            val inputTujuan = Tujuan.text.toString()
            val hitung = Berat.text.toString()
            if (hitung.isNotEmpty() && hitung.all { it.isDigit() }) {
                val angkabayar = hitung.toInt()
                val intent = Intent(this, menustruktruck::class.java).apply {
                    putExtra("angka hitung", angkabayar)
                    putExtra("negara asal", inputAsal)
                    putExtra("negara tujuan", inputTujuan)
                }
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "masukkan data", Toast.LENGTH_SHORT).show()
            }
        }
    }
}