package com.example.firstapp.contendorDeApps

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.R


class Par_Impar_Checker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_par_impar_checker)
        val etnNumeroIngresado = findViewById<EditText>(R.id.etnNumeroIngresado)
        val btnPar_Impar_Checker = findViewById<Button>(R.id.btnPar_Impar_Checker)
        val tvMostar = findViewById<TextView>(R.id.tvMostar)


        btnPar_Impar_Checker.setOnClickListener {
            var numero = etnNumeroIngresado.text.toString()

            if (numero.isNotEmpty()){
                val numero2:Int = numero.toInt()
                if((numero2 % 2) === 0){
                    tvMostar.text = "El numero ingresado $numero2 es PAR"
                }else{
                    tvMostar.text = "El numero ingresado $numero2 es IMPAR"
                }
            }

        }


    }
}
