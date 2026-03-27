package com.olga.tiendavirtualmovil.model

data class Pago (
    val id_pago: Int,
    val id_pedido: Int,
    val metodo_pago: String,
    val fecha_pago: String,
    val valor_pago: Double,
    val estado_pago: String
)