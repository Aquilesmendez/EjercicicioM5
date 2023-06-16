package com.example.zeta

import java.util.*

fun main() {
    val heroes = ingresarHeroes()
    mostrarHeroes(heroes)
}

fun ingresarHeroes(): ArrayList<Superhero> {
    val listaHeroes = ArrayList<Superhero>()
    val scanner = Scanner(System.`in`)
    var continuar = true

    while (continuar) {
        println("Ingrese los datos del nuevo Superhéroe: ")
        print("Nombre del Superhéroe: ")
        val nombre = scanner.nextLine()
        print("Editorial del Superhéroe: ")
        val editorial = scanner.nextLine()
        print("Nombre real del Superhéroe: ")
        val nombreReal = scanner.nextLine()
        print("Foto del Superhéroe: ")
        val foto = scanner.nextLine()

        listaHeroes.add(Superhero(nombre, editorial, nombreReal, foto))

        println("¿Desea ingresar otro Superhéroe? (s/n): ")
        continuar = scanner.nextLine().trim().toLowerCase() == "s"
    }

    return listaHeroes
}

fun mostrarHeroes(heroes: ArrayList<Superhero>) {
    println("\nLista de Superhéroes:")
    for (hero in heroes) {
        println("Superhéroe: ${hero.superhero}")
        println("Editorial: ${hero.publisher}")
        println("Nombre real: ${hero.realName}")
        println("Foto: ${hero.photo}")
        println("--------")
    }
}
