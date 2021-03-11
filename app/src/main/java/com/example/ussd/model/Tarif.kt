package com.example.ussd.model

class Tarif {
    var tarifIcon :Int= 0
    var tarifHeader:String =""
    var tarif_description:String = ""

    constructor(tarifIcon: Int, tarifHeader: String, tarif_description: String) {
        this.tarifIcon = tarifIcon
        this.tarifHeader = tarifHeader
        this.tarif_description = tarif_description
    }
    constructor()
}