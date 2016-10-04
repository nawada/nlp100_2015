package com.example.nlp.chapter1

import java.util.*

/**
 * "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
 * という文を単語に分解し,1, 5, 6, 7, 8, 9, 15, 16, 19番目の単語は先頭の1文字,それ以外の単語は先頭に2文字を取り出し,
 * 取り出した文字列から単語の位置(先頭から何番目の単語か)への連想配列(辞書型もしくはマップ型)を作成せよ.
 */
class Q04 {
    fun main() {
        val string = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
        val onlyFirst = arrayOf(0, 4, 5, 6, 7, 8, 14, 15, 18)
        val elements = HashMap<Int, String>()
        val strings = string.split(" ")
        var index = 0
        var onlyFirstIndex = 0;

        for (str in strings) {
            var element = str.substring(0, 2)
            if (onlyFirst.size > onlyFirstIndex && onlyFirst[onlyFirstIndex] == index) {
                element = element[0].toString()
                onlyFirstIndex++;
            }
            elements.put(index++, element.toString())
        }

        println(elements)
    }
}
