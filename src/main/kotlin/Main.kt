package org.example

import org.example.model.Color
import org.example.models.Personatge
import org.example.utils.textPrincipal

fun main() {
    println(textPrincipal())

    var jason: Personatge = Personatge("Jason")
    println(jason)

    jason.numMorts++
    println(jason)

    var lucia: Personatge
    lucia = Personatge(nom = "Lucia", forca = 6, cardio = 6, diners = 100.0f)
    println(lucia.nom)

    lucia.vehicles[0].color = Color.NEGRE

    println(lucia.vehicles.contentToString())

    var personatges: Array<Personatge>
    personatges = Array<Personatge>(10){Personatge(nom = "")}
}