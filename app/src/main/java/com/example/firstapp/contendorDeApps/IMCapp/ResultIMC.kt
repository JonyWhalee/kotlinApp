package com.example.firstapp.contendorDeApps.IMCapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firstapp.R
import com.example.firstapp.contendorDeApps.IMCapp.IMCApp.Companion.IMC_KEY

class ResultIMC : AppCompatActivity() {

    private lateinit var tvResult:TextView
    private lateinit var tvIMC:TextView
    private lateinit var tvDescription:TextView
    private lateinit var btnRecalculate:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_imc)
        val result:Double =  intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListener()
    }

    private fun initListener() {
        btnRecalculate.setOnClickListener {   finish() }
    }

    private fun initUI(result:Double) {
        tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 ->{
             tvResult.text = getString(R.string.title_bajo)
             tvDescription.text = getString(R.string.description_bajo)
            }
            in 18.51..24.99 ->{
             tvResult.text = getString(R.string.title_normal)
             tvDescription.text = getString(R.string.description_normal)
            }
            in 25.00..29.00 ->{
             tvResult.text = getString(R.string.title_sobrepeso)
             tvDescription.text = getString(R.string.description_sobrepeso)
            }
            in 30.00..99.00 ->{
             tvResult.text = getString(R.string.title_obesidad)
             tvDescription.text = getString(R.string.description_obesidad)
            }
            else ->{
                tvIMC.text = getString(R.string.error)
                tvResult.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponents(){
        tvIMC = findViewById(R.id.tvIMC)
        tvResult = findViewById(R.id.tvResult)
        tvDescription = findViewById(R.id.tvDescription)
        btnRecalculate = findViewById<Button>(R.id.btnRecalculate)
    }
}