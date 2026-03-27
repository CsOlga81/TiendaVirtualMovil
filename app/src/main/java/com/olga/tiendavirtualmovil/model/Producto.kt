package com.olga.tiendavirtualmovil.model

data class Producto (
    val id_producto: Int,
    val nombre: String,
    val descripcion: String,
    val id_categoria: Int,
    val cantidad: Int,
    val precio: Double,
    val genero: String
)
