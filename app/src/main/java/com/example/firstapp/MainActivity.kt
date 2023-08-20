package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstapp.contendorDeApps.CalculadoraApp
import com.example.firstapp.contendorDeApps.saludarApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        btnSaludar.setOnClickListener {
            nagivateToSaludarApp()
        }
        val btnCalculadora = findViewById<Button>(R.id.btnCalculadora)
        btnCalculadora.setOnClickListener {
            nagivateToCaculadoraApp()
        }
    }

    fun nagivateToCaculadoraApp() {
        val intent = Intent(this, CalculadoraApp::class.java)
        startActivity(intent)
    }

    fun nagivateToSaludarApp(){
        val intent = Intent(this, saludarApp::class.java)
        startActivity(intent)
    }


}