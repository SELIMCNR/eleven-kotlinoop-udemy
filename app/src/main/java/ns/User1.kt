package ns

import com.cinar.kotlinoop.People

class User1:People {

    //property
    var name: String? = null
    var age : Int? =null

    constructor(nameInput:String,ageInput:Int){
        this.name = nameInput
        this.age = ageInput
        println("user created")

    }
    init {
        //init ilk obje çağrımında çalışır.
        println("init")
    }
}