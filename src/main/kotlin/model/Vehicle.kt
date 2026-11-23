package org.example.model

data class Vehicle(
    var marca: String = "",
    var model: String = "",
    var velMax: Float = 0f,
    var motor: Float = 0f,
    var cv: Int = 0,
    var antiguitat: Int = 0,
    var localitzador: Localitzador = Localitzador.NO,
    var color: Color = Color.BLANC
)
