package com.example.nlp.chapter1

import java.util.*

/**
 * 与えられたシーケンス(文字列やリストなど)からn-gramを作る関数を作成せよ.この関数を用い,"I am an NLPer"という文から
 * 単語bi-gram,文字bi-gramを得よ.
 */
class Q05 {
    fun main() {
        val str = "I am an NLPer"
        ngram(str.splitToSequence(" "), 2).forEach(::println)
        ngram(str.asSequence(), 2).forEach(::println)
    }

    fun ngram(seq: Sequence<Any>, n: Int): List<Any> {
        val loopCount = seq.count() - n
        val list = ArrayList<Any>()
        for (i in 0..loopCount) {
            var c = ""
            for (j in i..(i + n - 1)) {
                c += seq.elementAt(j)
            }
            list.add(c)
        }
        return list
    }
}
