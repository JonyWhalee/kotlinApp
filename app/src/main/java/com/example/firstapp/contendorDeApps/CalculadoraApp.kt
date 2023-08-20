package com.example.firstapp.contendorDeApps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.firstapp.R


class CalculadoraApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_app)
        val edNumeroUno = findViewById<EditText>(R.id.edNumeroUno)
        val edNumeroDos = findViewById<EditText>(R.id.edNumeroDos)
        val edOperador = findViewById<EditText>(R.id.edOperador)
        val btnOperacion = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnOperacion)
        val mostrar = findViewById<TextView>(R.id.tvMostrar)

        btnOperacion.setOnClickListener {
            val numeroUnoText = edNumeroUno.text.toString()
            val numeroDosText = edNumeroDos.text.toString()
            val operador = edOperador.text.toString()

            if (numeroUnoText.isNotEmpty() && numeroDosText.isNotEmpty()){
                val numero1 = numeroUnoText.toDouble()
                val numero2 = numeroDosText.toDouble()

                val resultado = realizarOperacion(numero1, numero2, operador)
                mostrar.text = "La $operador entre $numero1 y $numero2 es $resultado"
            }else{
                mostrar.text = "Te falto ingresar los numero salchicha"
            }

        }
    }

    fun realizarOperacion(a: Double, b: Double, operador: String):Double = when(operador){
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> 0.0
        }


}