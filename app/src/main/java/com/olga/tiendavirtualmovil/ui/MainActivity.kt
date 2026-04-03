package com.olga.tiendavirtualmovil.ui

import android.content.Intent //para ir de una pantalla a otra
import android.os.Bundle //Guarda información cuando se crea la pantalla
import androidx.activity.enableEdgeToEdge //Hace que la app use toda la pantalla
import androidx.appcompat.app.AppCompatActivity //Es la base de todas las pantallas
import androidx.core.view.ViewCompat //Este ayuda a menejar el diseño en diferentes versiones de Android
import androidx.core.view.WindowInsetsCompat //Controla espacios de barra de estado , navegacipon
import com.olga.tiendavirtualmovil.R //Conecta el cógidgo con layouts, ids y strings
import android.widget.Button //Este import permite usar los botones

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnProductos = findViewById<Button>(R.id.btnProductos)

        btnProductos.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)

        }
    }
}