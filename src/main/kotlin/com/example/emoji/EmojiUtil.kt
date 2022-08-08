package com.example.emoji

object EmojiUtil {

    fun replaceAll(form: String, replaceWord: String = ""): String {
        val regex = Regex("[\\x{10000}-\\x{FFFFF}]")
        return regex.replace(form, replaceWord)
    }
}