package com.example.kotlin.odevler.odev2

fun main() {
    val o2 = Odev2()

    o2.soru1(10)

    o2.soru2(10,20)

    var faktoriyel = o2.soru3(5)
    println("Faktoriyel : ${faktoriyel}")

    var harfBulma = o2.soru4("Beyza")
    println("Harf ${harfBulma} kere tekrar etti. ")

    o2.soru5(5)

    o2.soru6(30)

    var price = o2.soru7(100)
    println("Ucret : ${price}")
}