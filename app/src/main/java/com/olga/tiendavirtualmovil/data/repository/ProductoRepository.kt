package com.olga.tiendavirtualmovil.data.repository

import com.olga.tiendavirtualmovil.model.Producto

class ProductoRepository {
    fun obtenerProductos(): List<Producto> {
        return listOf(
            Producto(
                id_producto = 1,
                nombre = "Perfume Osadia",
                descripcion = "Fragancia floral 50 ml",
                id_categoria = 1,
                cantidad = 5,
                precio = 100.000,
                genero = "Mujer"
            ),
            Producto(
                id_producto = 2,
                nombre = "Crema Avon Care",
                descripcion = "Crema para el cuerpo 1 litro",
                id_categoria = 3,
                cantidad = 3,
                precio = 25.000,
                genero = "Unisex"
            )
        )
    }
}