package com.olga.tiendavirtualmovil.data.repository

class UsuarioRepository {

    fun login( correo: String, contrasena: String): Boolean {
        return correo == "admin@test.com" && contrasena == "1234"
    }
}