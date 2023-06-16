package com.example.zeta


    fun main() {
        var num1 = 10
        val num2 = 33
        val num3 = 66
        var suma = num1 + num2 + num3
        println("La suma de los números es: $suma")
        num1 = 55
        suma = num1 + num2 + num3
        println("La suma de los números es: $suma")
        val promedio = (num1 + num2 + num3).toDouble() / 3
        println("El promedio de los números es: $promedio")
    }


