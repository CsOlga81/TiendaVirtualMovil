package com.olga.tiendavirtualmovil.model

data class DetallePedido (
    val id_detalle: Int,
    val id_pedido: Int,
    val id_producto: Int,
    val cantidad: Int,
    val precio_unidad: Double,
    val subtotal: Double
)