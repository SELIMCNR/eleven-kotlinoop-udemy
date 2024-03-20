package com.cinar.kotlinoop

//Prımary constructor () yazım şekli
// open class ile class açık olur ve inheritance kalıtım yapılır.
open class team(teamName: String, teamBirth: Int, teamColor: String) {


    // Encapsulation : Propertyleri sınıf içersinde gizleme kapsüleme saklama işlemi

    var teamName : String? = teamName
        private set // set edilemez gizli
        get

    var teamBirth: Int? = teamBirth
        private  set // değer verilemez propery gizli
        get

    var teamColor: String? = teamColor
        private set
        get() = field

   private var teamCountry :String = "Türkiye"

    fun  returnTeamCountry(password:String):String {

        if (password=="Selim")
        {
            return teamCountry
        }
        else{
            return "wrong password"
        }
    }

    //Getter setter encapsülation java benzeri
    private var name: String = ""

    fun setName(name: String) { this.name = name }

    fun getName(): String { return this.name }

}