package com.example.recheckstudiosetting.list.shortcuts

// Main Menu | Code | Surround With...
// Surround With .. (⌘ Cmd + ⌥ Option + T)

fun main() {
    surroundWith()
}

fun surroundWith() {
    val msg = "Android Studio"
    errorMethod()
}

@Throws(IllegalStateException::class)
fun errorMethod() {
    throw IllegalStateException("Not Call")
}