//Ejercicio 2
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 13 de abril de 2026
//Fecha última modificación: 13 de abril de 2026

package com.example.holamundo

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ej2 : AppCompatActivity() {

    private var mp: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej2)

        //Inicialización del reproductor y configuración de eventos
        mp = MediaPlayer.create(this, R.raw.audio)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnPause = findViewById<Button>(R.id.btnPause)
        val btnStop = findViewById<Button>(R.id.btnStop)

        btnPlay.setOnClickListener { mp?.start() }
        btnPause.setOnClickListener { mp?.pause() }
        btnStop.setOnClickListener {
            mp?.stop()
            mp = MediaPlayer.create(this, R.raw.audio)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mp?.release()
        mp = null
    }
}