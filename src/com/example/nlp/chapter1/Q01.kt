package com.example.nlp.chapter1

/**
 * 「パタトクカシーー」という文字列の1,3,5,7文字目を取り出して連結した文字列を得よ.
 */
class Q01 {
    fun main() {
        val str = "パタトクカシーー"
        val result = "${str[1]}${str[3]}${str[5]}${str[7]}"
        println(result)
    }
}
