package com.example.zeta

import java.text.NumberFormat


object Main {
    fun suma(a: Double, b: Float): Double {
        return a + b
    }

    fun redondeo(num: Double): Double {
        return Math.ceil(num)
    }

    fun muestraResultado(num: Double) {
        val formatoMoneda = NumberFormat.getCurrencyInstance()
        println("El número formateado es: " + formatoMoneda.format(num))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val a = 6.4
        val b = 3.2f
        val resultadoSuma = suma(a, b)
        println("El resultado de la suma es: $resultadoSuma")
        val resultadoRedondeo = redondeo(resultadoSuma)
        println("El resultado redondeado hacia arriba es: $resultadoRedondeo")
        muestraResultado(resultadoRedondeo)
    }
}
