package com.cinar.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cinar.kotlinoop.databinding.ActivityMainBinding
import ns.Musician
import ns.User1
import ns.supermusician

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //Constructor değer verme
        val user1 = User("Selim",25)
        binding.textResult.text= user1.name
        binding.textResult.text = user1.age.toString()
        println(user1.name)
        println(user1.information())
        println(user1.age.toString())

        // Encapsulation : Propertyleri sınıf içersinde gizleme kapsüleme saklama işlemi
        val player = team("Fenerbahçe",1907,"Sarı Lacivert")
        println(player.teamName)
        binding.textResult.text = player.teamName
        // player.teamColor="" set edilmiyor private
        println(player.teamColor )
        println(player.teamBirth.toString())
        println(player.returnTeamCountry("Selim"))
        println(player.returnTeamCountry("Çınar"))

        println(player.getName())
        println(player.setName("Yusuf can Çınar"))


        //inheritance
        var lars = superTeam("Türkiye",1923,"Kırmızı beyaz")
        println(lars.teamName)
        binding.textResult.text =  lars.teamName
        println(lars.teamColor)
        binding.textResult.text = lars.teamBirth.toString()
        lars.sing() // bu classa ait özellik
        println(lars.returnTeamCountry("Selim"))

        //Polymorphism çok biçimlilik
        //aynı isimle farklı sonuçlar

        //static polymorphism : Aynı sınıf aynı fonksiyon ad farklı parametre
        var mathematics = Mathematics()
        println(mathematics.sum())
        binding.textResult.text = ""+mathematics.sum(15,20)
        println(mathematics.sum(25,35,75))


        //dynamic polymorphism : Farklı sınıf

        var canlı = Canlı()
        canlı.sing()

        var canlıBitks = canlıBitk()
        canlıBitks.test()
        canlıBitks.sing() // override olan fonksiyon yazılır

        //Abstract (soyut sınıf : instance obje oluşmaz kalıtım için oluşturulur)
     //   var myPeople = People() hata verir instance oluşmaz abstract classta
    //Inheritance tek sınıf alır iki sınıf almaz

        var myPiano = piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expression kolay yazım teknikleri
        fun printString(myString: String){
            println(myString)
        }
        printString("My test String")
        val testString = {myString:String -> printString(myString)}
        testString("My lambda String")

        val multiplyLambda = {a:Int,b:Int -> a*b}
        println(multiplyLambda(5,4))

        val multiplyLambda2 : (Int,Int) ->Int = {a,b -> a*b}
        println(multiplyLambda2(5,5))

        //async
        //callback funtionc ,listener function , completion function

        fun downloadMusicians (url:String,completion:(Musician)-> Unit){
            val kirkHammet = Musician("kirk", instrument = "Guitar",60)
            completion(kirkHammet)
        }

        downloadMusicians("metallica.com",{
            musician -> println(musician.name)
        })


    }


}