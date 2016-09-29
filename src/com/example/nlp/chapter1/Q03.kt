package com.example.nlp.chapter1

import java.util.*

class Q03 {
    fun main() {
        val string = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
        val words = string.split(" ")
        val numbers = ArrayList<Int>()
        for (word in words) {
            var number = word.length
            if (word.endsWith(',') || word.endsWith('.')) {
                number--;
            }
            numbers.add(number)
        }

        for (number in numbers) {
            print(number)
        }
        println()
    }
}
