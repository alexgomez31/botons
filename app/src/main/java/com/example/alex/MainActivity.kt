package com.example.alex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtén una referencia al botón
        val customButton = findViewById<com.google.android.material.button.MaterialButton>(R.id.customButton)

        // Define un Selector para cambiar el color del botón al presionarlo
        val buttonSelector = resources.getDrawable(R.drawable.ic_launcher_foreground, null)
        customButton.background = buttonSelector

        // Configura el clic del botón para iniciar la actividad
        customButton.setOnClickListener {
            startActivity(Intent(this,Bienvenida ::class.java))
        }
    }
}
