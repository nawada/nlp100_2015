package com.example.nlp.chapter1

/**
 * 与えられた文字列の各文字を,以下の仕様で変換する関数cipherを実装せよ.
 *
 * - 英小文字ならば(219 - 文字コード)の文字に置換
 * - その他の文字はそのまま出力
 *
 * この関数を用い,英語のメッセージを暗号化・復号化せよ.
 */
class Q08 {
    val smallCharsRange = 'a'.toLong()..'z'.toLong()

    fun cipher(str: String): String {
        var ret = ""
        str.forEach {
            val itl = it.toLong()
            if (smallCharsRange.contains(itl)) {
                ret += (219 - itl).toChar()
            } else {
                ret += it
            }
        }
        return ret
    }
}
