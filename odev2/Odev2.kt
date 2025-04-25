package com.example.kotlin.odevler.odev2

class Odev2 {
    fun soru1(sayi : Int){
        val sonuc = (sayi*1.8) + 32
        println("F : ${sonuc}")
    }

    fun soru2(kenar1:Int,kenar2: Int){
        val sonuc = (2*kenar1)+(2*kenar2)
        println("Dikdortgenin Cevresi : ${sonuc}")
    }

    fun soru3(faktoriyel:Int) : Int {
        var carpim = 1
        for (i in 1..faktoriyel){
            carpim = i*carpim
        }
        return carpim

    }

    fun soru4(kelime:String) : Int {
        return kelime.count { it == 'A' || it == 'a' }
    }

    fun soru5(kenarSayisi:Int){
        println("Ic Acilari Toplami : ${(kenarSayisi-2)*180}")
    }

    fun soru6(gunSayisi : Int){
        if(gunSayisi>=20){ // Mesai sayılacak
            println("Maas : ${(160*10)+((gunSayisi-20)*20*8)}")
        }
        else{
            println("Maas : ${ (gunSayisi*8*10) }")
        }
    }

    fun soru7(kotaMiktari: Int): Int {
        val ucret = 100
        return if (kotaMiktari <= 50) {
            ucret
        } else {
            ucret + ((kotaMiktari - 50) * 4)
        }
    }

}