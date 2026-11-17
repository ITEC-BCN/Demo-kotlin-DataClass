package org.example

import org.example.models.Personatge

fun main() {
    var personatge1:Personatge = Personatge("Luiggi")   //no assignem valor al segon atribut, per tant, assigna el valor per defecte: false
    var personatge2:Personatge = Personatge("Toad", true)   //no assignem valor al segon atribut, per tant, assigna el valor per defecte: false

    println(personatge1)
    println(personatge2)

}