package com.example.firstapp.contendorDeApps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.firstapp.R

class saludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        val tvNombreIngresado = findViewById<TextView>(R.id.tvNombreIngresado)
        val name:String = intent.extras?.getString("NAME_iNGRESADO").orEmpty()
        tvNombreIngresado.text = "Bienvenido ${name}"
    }
}