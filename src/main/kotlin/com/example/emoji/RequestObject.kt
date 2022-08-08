package com.example.emoji

import java.time.Instant

data class RequestObject(
    val title: String,
    val contents: String,
    val to: String,
    val createdTime: Instant = Instant.now()
)