package com.example.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstapp.contendorDeApps.CalculadoraApp
import com.example.firstapp.contendorDeApps.habitsApp.HabitsApp
import com.example.firstapp.contendorDeApps.IMCapp.IMCApp
import com.example.firstapp.contendorDeApps.Par_Impar_Checker
import com.example.firstapp.contendorDeApps.saludarApp

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
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
        val btnPar_impar_checker = findViewById<Button>(R.id.par_impar_checker)
        btnPar_impar_checker.setOnClickListener {
            navigaToPar_Impar_Checker()
        }
        val btnIMC = findViewById<Button>(R.id.btnIMC)
        btnIMC.setOnClickListener {
            navigaToIMCApp()
        }
        val btnHabits = findViewById<Button>(R.id.btnHabits)
        btnHabits.setOnClickListener {
            navigaToHabits()
        }
        
    }

    private fun navigaToHabits() {
        val intent = Intent(this, HabitsApp::class.java)
        startActivity(intent)
    }

    fun nagivateToCaculadoraApp() {
        val intent = Intent(this, CalculadoraApp::class.java)
        startActivity(intent)
    }

    fun nagivateToSaludarApp(){
        val intent = Intent(this, saludarApp::class.java)
        startActivity(intent)
    }
    fun navigaToPar_Impar_Checker(){
        val intent = Intent(this, Par_Impar_Checker::class.java)
        startActivity(intent)
    }
    fun navigaToIMCApp(){
        val intent = Intent(this, IMCApp::class.java )
        startActivity(intent)
    }


}