package com.example.nlp.chapter1

fun main(args: Array<String>) {
    Q00().main()
    Q01().main()
    Q02().main()
    Q03().main()
    Q04().main()
    Q05().main()
    println(Q07().main(12, "気温", 22.4))
    val ret = Q08().cipher("The Quick Brown Fox Jumps Over The Lazy Dog")
    println(ret)
    val ret2 = Q08().cipher(ret)
    println(ret2)
    Q09().main("I couldn't believe that I could actually understand what I was reading : the phenomenal power of the human mind .")
}
