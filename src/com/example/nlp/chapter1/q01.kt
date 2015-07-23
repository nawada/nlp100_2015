package com.example.nlp.chapter1

class Q01 {
    fun main() {
        val str = "パタトクカシーー"
        var result = "${str.get(1)}${str.get(3)}${str.get(5)}${str.get(7)}"
        println(result)
    }
}
