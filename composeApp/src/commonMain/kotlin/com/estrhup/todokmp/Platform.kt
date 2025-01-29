package com.estrhup.todokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform