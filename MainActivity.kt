
package com.cineai.javier

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val styles = listOf(
            "Cinemático Hollywood",
            "Videojuego",
            "Animación Artística",
            "Vertical Reels",
            "Fantasía / Sci‑Fi"
        )

        val spinner = findViewById<Spinner>(R.id.styleSpinner)
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, styles)

        val button = findViewById<Button>(R.id.generateBtn)

        button.setOnClickListener {
            Toast.makeText(this,
                "Aquí se conectará tu motor de IA (online/offline).",
                Toast.LENGTH_LONG).show()
        }
    }
}
