package com.olga.tiendavirtualmovil.network

import com.olga.tiendavirtualmovil.model.Producto
import okhttp3.Response
import retrofit2.http.GET

interface ApiService {@GET("Productos")
suspend fun obtenerProcuctos(): Response<Producto>
}