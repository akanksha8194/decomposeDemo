package org.decompose.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform