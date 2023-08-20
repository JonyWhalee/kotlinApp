package com.example.firstapp.contendorDeApps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.example.firstapp.R

class saludarApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludar_app)
        val etName = findViewById<EditText>(R.id.etName)
        val btnName = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnName)
        btnName.setOnClickListener {
            var name = etName.text.toString()
            if (name.isNotEmpty()){
                val intent = Intent(this, saludoActivity::class.java)
                intent.putExtra("NAME_iNGRESADO", name)
                startActivity(intent)
            }else{
                Log.i("tag", "No ingresaste tu nombre")
            }

        }

    }
}