package com.example.basarorder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform