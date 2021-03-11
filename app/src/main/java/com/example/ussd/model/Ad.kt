package com.example.ussd.model

class Ad {
    var min :Int =0
    var mb : Int =0
    var sms: Int =0
    var tarif:Int = 0
    var minTv :Int = 0
    var mbTv :Int = 0
    var smsTv :Int = 0
    var tarifSumma :Int = 0

    constructor()

    constructor(min: Int, mb: Int, sms: Int, tarif: Int, minTv: Int, mbTv: Int, smsTv: Int, tarifSumma: Int) {
        this.min = min
        this.mb = mb
        this.sms = sms
        this.tarif = tarif
        this.minTv = minTv
        this.mbTv = mbTv
        this.smsTv = smsTv
        this.tarifSumma = tarifSumma
    }


}