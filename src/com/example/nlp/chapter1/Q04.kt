package com.example.nlp.chapter1

import java.util.*

class Q04 {
    fun main() {
        val string = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
        val onlyFirst = arrayOf(0, 4, 5, 6, 7, 8, 14, 15, 18)
        val elements = HashMap<Int, String>()
        val strings = string.splitBy(" ")
        var index = 0
        var onlyFirstIndex = 0;

        for (str in strings) {
            var element = str.get(0, 2)
            if (onlyFirst.size() > onlyFirstIndex && onlyFirst[onlyFirstIndex] == index) {
                element = element.get(0).toString()
                onlyFirstIndex++;
            }
            elements.put(index++, element.toString())
        }

        println(elements)
    }
}
