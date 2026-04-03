package com.olga.tiendavirtualmovil.network

import com.olga.tiendavirtualmovil.model.Producto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("Productos")
    suspend fun obtenerProductos(): Response<List<Producto>>
}