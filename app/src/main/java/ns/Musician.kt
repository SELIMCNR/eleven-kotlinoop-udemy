package ns


open class Musician (name:String, instrument:String, age:Int){
    var name : String? = name
        private set
        get
    var instrument : String? = instrument
    get
    private set
    var age :Int? = age

    private  val bandName : String ="metal"

    fun returnBandName(password:String):String{
        if (password=="selim"){
            return bandName
        }
        else {
            return "wron password!"
        }
    }
}