package com.example.ladm_u1_practica1_3activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHorario = findViewById<Button>(R.id.btnHorario)
        val btnTareas = findViewById<Button>(R.id.btnTareas)
        val btnDp = findViewById<Button>(R.id.btnDatosPersonales)

        btnHorario.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        }

        btnTareas.setOnClickListener {
            val intent = Intent(this, BasicActivity::class.java)
            startActivity(intent)
        }

        btnDp.setOnClickListener {
            val intent = Intent(this, DatosPersonales::class.java)
            startActivity(intent)
        }
    }
}