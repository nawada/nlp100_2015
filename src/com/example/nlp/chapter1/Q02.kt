package com.example.nlp.chapter1

/**
 * 「パトカー」+「タクシー」の文字を先頭から交互に連結して文字列「パタトクカシーー」を得よ.
 */
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
