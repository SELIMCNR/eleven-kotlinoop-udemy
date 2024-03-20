package com.cinar.kotlinoop

class User : People {
    var name : String ? = null
    var age:Int? = null


    //Constructor ve İnit
    constructor(name:String , age :Int){
        //Constructor inşa etmek parametrede değer ile clastaki özelliği eşitledik
        //Classdan her obje oluşmasında bu çalışır
        this.name = name
        this.age = age
        println("constructor created")
    }
    init {
        //Classdan her obje oluşmasında bu çalışır
        println("init created ")
    }



}