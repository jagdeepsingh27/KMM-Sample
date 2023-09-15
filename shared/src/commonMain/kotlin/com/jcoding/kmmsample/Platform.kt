package com.jcoding.kmmsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform