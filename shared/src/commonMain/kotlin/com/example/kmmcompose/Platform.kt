package com.example.kmmcompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform