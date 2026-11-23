package org.example.models
import org.example.model.Vehicle

data class Personatge(
    var nom: String,
    var forca: Int = 5,
    var cardio: Int = 5,
    var concentracio: Int = 5,
    var numMorts: Int = 0,
    var diners: Float = 0.0f,
    var vehicles: Array<Vehicle> = Array<Vehicle>(10){Vehicle()}
)
/*{
    override fun toString(): String {
        var text = "Nom: $nom, diners: $diners"
        return text
    }
}*/