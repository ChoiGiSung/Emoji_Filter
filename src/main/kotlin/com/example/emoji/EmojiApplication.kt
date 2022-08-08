package com.example.emoji

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmojiApplication

fun main(args: Array<String>) {
	runApplication<EmojiApplication>(*args)
}
