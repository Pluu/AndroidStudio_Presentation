package com.example.recheckstudiosetting.list.Tool_Refactor

import java.io.File

// Main Menu | Refactor | Extract/Introduce | Parameter…
// ⌘ Сmd + ⌥ Option + P
// https://www.jetbrains.com/help/idea/extract-parameter.html

private fun loadFile(): String {
    return File("a.txt").readText()
}