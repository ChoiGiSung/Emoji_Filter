package com.example.emoji

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.javaField

class EmojiRemoveFilter {
    fun doFilter(request: Any) {
        for (property in request::class.java.declaredFields) {
            if (property.type == String::class.java) {
                property.isAccessible = true
                val value = property.get(request) as String
                property.set(request, EmojiUtil.replaceAll(value))
                property.isAccessible = false
            }
        }
    }
}