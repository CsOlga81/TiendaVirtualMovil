package com.olga.tiendavirtualmovil.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.olga.tiendavirtualmovil.R
import com.olga.tiendavirtualmovil.data.repository.ProductoRepository
import android.util.Log
import android.widget.TextView

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
        val repository = ProductoRepository()
        val lista = repository.obtenerProductos()
        val txtProducto = findViewById<TextView>(R.id.txtProducto)
        txtProducto.text = lista[0].nombre

       Log.d("Los Productos son: ", lista.toString())
    }
}