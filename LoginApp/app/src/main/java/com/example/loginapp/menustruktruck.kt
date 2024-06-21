package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menustruktruck : AppCompatActivity() {

    lateinit var backBtn : Button
    lateinit var confirmBtn : Button
    lateinit var Tujuan : TextView
    lateinit var Asal : TextView
    lateinit var Harga : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_struk)

        backBtn = findViewById(R.id.back_btn)
        confirmBtn = findViewById(R.id.confirm_btn)
        Tujuan = findViewById(R.id.negaratujuan)
        Asal = findViewById(R.id.negaraasal)
        Harga = findViewById(R.id.angka)

        val inputAsal = intent.getStringExtra("negara asal")
        val inputTujuan = intent.getStringExtra("negara tujuan")

        val angka = intent.getIntExtra("angka hitung", 0)
        val hasil = angka * 100_000

        Harga.text = "Rp.$hasil"
        Asal.text = inputAsal
        Tujuan.text = inputTujuan

        backBtn.setOnClickListener {
            val intent = Intent(this, menutruck::class.java)
            startActivity(intent)
            finish()
        }
        confirmBtn.setOnClickListener {
            val intent = Intent(this, konfirmasi::class.java)
            startActivity(intent)
            finish()
        }
    }
}