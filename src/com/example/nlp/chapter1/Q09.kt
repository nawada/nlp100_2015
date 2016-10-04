package com.example.nlp.chapter1

/**
 * スペースで区切られた単語列に対して,各単語の先頭と末尾の文字は残し,それ以外の文字の順序をランダムに並び替えるプログラムを作成せよ.
 * ただし,長さが4以下の単語は並び替えないこととする.適当な英語の文
 * (例えば"I couldn't believe that I could actually understand what I was reading : the phenomenal power of the human mind .")を与え,
 * その実行結果を確認せよ.
 */
class Q09 {
    fun main(str: String) {
        val split = str.split(" ")
        split.forEach {
            if (it.length <= 4) {
                print("$it ")
                return@forEach
            }

            val first = it.first()
            val last = it.reversed().first()
            val range = 1 until it.length - 1
            val between = it.slice(range).toCharArray()
            for(i in 0 until between.size) {
                val j = Math.floor(Math.random() * between.size).toInt()
                val tmp = between[i]
                between[i] = between[j]
                between[j] = tmp
            }
            print(first + between.joinToString("") + last + " ")
        }
        println()
    }
}
