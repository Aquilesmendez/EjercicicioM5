package com.example.zeta

class FoldablePhone(isScreenLightOn: Boolean = false) {
    private var isScreenLightOn: Boolean = isScreenLightOn
    private var isFolded: Boolean = true

    fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        } else {
            println("Cannot switch on the screen. The phone is folded.")
        }
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }

    fun fold() {
        isFolded = true
        switchOff() // Se apaga automáticamente al plegar
    }

    fun unfold() {
        isFolded = false
    }

    fun isFolded(): Boolean {
        return isFolded
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    foldablePhone.checkPhoneScreenLight() // El estado inicial es "apagado"

    foldablePhone.switchOn() // No se enciende la pantalla porque el teléfono está plegado

    foldablePhone.fold() // Plegar el teléfono

    foldablePhone.switchOn() // No se enciende la pantalla porque el teléfono está plegado

    foldablePhone.unfold() // Desplegar el teléfono

    foldablePhone.switchOn() // Se enciende la pantalla porque el teléfono está desplegado

    foldablePhone.checkPhoneScreenLight() // El estado actual es "encendido"
}
