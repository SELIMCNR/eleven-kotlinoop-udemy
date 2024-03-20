package com.cinar.kotlinoop

class piano: HouseDecor,Instrument {

    // java -> no body
    //kotlin -> body

    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    var brand:String? = null
    var digital : Boolean? = null


}