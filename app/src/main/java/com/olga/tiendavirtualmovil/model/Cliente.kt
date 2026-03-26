package com.olga.tiendavirtualmovil.model

data class Cliente (
    val id_cliente: Int,
    val nombre_completo: String,
    val correo_electronico: String,
    val contrasena: String,
    val direccion: String,
    val ciudad: String,
    val telefono: String,
    val fecha_registro: String
)