package com.example.nlp.chapter1

/**
 * 引数x, y, zを受け取り「x時のyはz」という文字列を返す関数を実装せよ.さらに,x=12, y="気温", z=22.4として,実行結果を確認せよ.
 */
class Q07 {
    fun main(x: Any, y: Any, z: Any): String {
        return "$x 時の $y は $z"
    }
}