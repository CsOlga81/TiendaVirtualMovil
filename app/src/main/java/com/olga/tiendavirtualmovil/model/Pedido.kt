package com.olga.tiendavirtualmovil.model

data class Pedido (
    val id_pedido: Int,
    val direccion: String,
    val fecha_registro: String,
    val id_cliente: Int
)