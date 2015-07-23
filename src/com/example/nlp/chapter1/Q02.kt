package com.example.nlp.chapter1

class Q02 {
    fun main() {
        val patrolCar = "パトカー"
        val taxi = "タクシー"
        var result = ""
        for (i in 0..3) {
            result += patrolCar.get(i)
            result += taxi.get(i)
        }
        println(result)
    }
}
