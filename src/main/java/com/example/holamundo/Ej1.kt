//Ejercicio 1
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 13 de abril de 2026
//Fecha última modificación: 13 de abril de 2026

package com.example.holamundo

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ej1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ej1)

        //Configuración de los bordes de pantalla
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val miImagen = findViewById<ImageView>(R.id.ivMiImagen)
        miImagen.setOnClickListener {
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
        }
    }
}