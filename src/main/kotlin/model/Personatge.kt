package org.example.models

data class Personatge(
    var nom: String,
    var allotjat: Boolean = false
){
    override fun toString():String {
        var text = "Nom: $nom\n" + "Allotjat: "
        if(allotjat) text += "Sí"
        else text += "No"
        return text
    }
}
