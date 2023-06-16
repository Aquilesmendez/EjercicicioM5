package com.example.zeta


fun main() {
    println("Conversor de temperatura")

    // Obtener la temperatura a convertir y su escala actual
    print("Ingrese la temperatura a convertir: ")
    val temperatura = readLine()!!.toDouble()
    print("Ingrese la escala actual (C, F, o K): ")
    val escala_actual = readLine()

    // Convertir la temperatura a Celsius
    val temperatura_celsius = when (escala_actual) {
        "F" -> (temperatura - 32) * 5/9
        "K" -> temperatura - 273.15
        else -> temperatura
    }

    // Convertir la temperatura a las otras escalas
    val temperatura_fahrenheit = 9.0 / 5.0 * temperatura_celsius + 32
    val temperatura_kelvin = temperatura_celsius + 273.15

    // Imprimir los resultados
    println("La temperatura en Celsius es: %.2f°C".format(temperatura_celsius))
    println("La temperatura en Fahrenheit es: %.2f°F".format(temperatura_fahrenheit))
    println("La temperatura en Kelvin es: %.2fK".format(temperatura_kelvin))
}
