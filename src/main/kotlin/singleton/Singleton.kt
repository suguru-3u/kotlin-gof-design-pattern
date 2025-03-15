package org.example.singleton

import java.time.LocalDateTime

object Singleton {
    val created = LocalDateTime.now()

    init {
        println("Singletonが生成されました")
    }

    fun hello() {
        println("created $created")
    }
}