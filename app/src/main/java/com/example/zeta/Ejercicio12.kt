package com.example.zeta

import java.util.Scanner

data class Usuario(val nombre: String, val apellido: String, val edad: Int, val correo: String, val sistemaSalud: String)

fun main() {
    val scanner = Scanner(System.`in`)

    println("¿Cuántos usuarios deseas registrar?")
    val cantidadUsuarios = scanner.nextInt()
    val usuarios = mutableListOf<Usuario>()

    for (i in 1..cantidadUsuarios) {
        var nombre = ""
        var apellido = ""
        var edad = 0
        var correo = ""
        var sistemaSalud = ""

        // Pedir y validar el nombre
        while (nombre.isBlank() || nombre.length > 20 || !nombre.matches("[a-zA-Z]+".toRegex()) || nombre.length < 3) {
            print("Ingresa el nombre del usuario #$i: ")
            nombre = readLine()?.trim() ?: ""

            if (nombre.isBlank()) {
                println("El campo nombre no puede estar vacío")
            } else if (nombre.length > 20) {
                println("El nombre no puede tener más de 20 caracteres")
            } else if (!nombre.matches("[a-zA-Z]+".toRegex())) {
                println("El nombre solo puede contener letras")
            } else if (nombre.length < 3) {
                println("El nombre debe tener al menos 3 letras")
            }
        }

        // Pedir y validar el apellido

        while (apellido.isBlank() || apellido.length > 20 || !apellido.matches("[a-zA-Z]+".toRegex()) || apellido.length < 3) {
            print("Ingresa el apellido del usuario #$i: ")
            apellido = readLine()?.trim() ?: ""

            if (nombre.isBlank()) {
                println("El campo apellido no puede estar vacío")
            } else if (apellido.length > 20) {
                println("El apellido no puede tener más de 20 caracteres")
            } else if (!apellido.matches("[a-zA-Z]+".toRegex())) {
                println("El apellido solo puede contener letras")
            } else if (apellido.length < 3) {
                println("El apellido debe tener al menos 3 letras")
            }
        }

        // Pedir y validar la edad
        while (edad == 0 || edad > 150 || edad < 0) {
            print("Ingresa la edad del usuario #$i: ")
            try {
                edad = scanner.nextInt()
                if (edad < 0) {
                    println("La edad no puede ser negativa")
                    edad = 0
                } else if (edad > 150) {
                    println("La edad no puede ser mayor a 150")
                    edad = 0
                }
            } catch (e: Exception) {
                println("Por favor ingresa una edad válida")
                scanner.next()
                edad = 0
            }
        }

        // Pedir y validar el correo
        while (correo.isBlank() || !correo.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}".toRegex())) {
            print("Ingresa el correo del usuario #$i: ")
            correo = scanner.next()
            if (correo.isBlank()) {
                println("El campo correo no puede estar vacío")
            } else if (!correo.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}".toRegex())) {
                println("Por favor ingresa un correo válido")
            }
        }

        usuarios.add(Usuario(nombre, apellido, edad, correo, sistemaSalud))
    }

    // Ordenar usuarios por edad de menor a mayor
    usuarios.sortBy { it.edad }

    // Imprimir los datos ordenados por edad
    println("Usuarios registrados (ordenados por edad de menor a mayor):")
    usuarios.forEachIndexed { index, usuario ->
        println("Usuario #${index + 1}")
        println("Nombre: ${usuario.nombre}")
        println("Apellido: ${usuario.apellido}")
        println("Edad: ${usuario.edad}")
        println("Correo: ${usuario.correo}")
        println()
    }
}
