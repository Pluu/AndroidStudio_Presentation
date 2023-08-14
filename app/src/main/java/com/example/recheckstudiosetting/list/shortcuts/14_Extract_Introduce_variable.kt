package com.example.recheckstudiosetting.list.shortcuts

import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

// Extract/Introduce variable
// ⌘ Сmd + ⌥ Option + V
// https://www.jetbrains.com/help/idea/extract-variable.html

fun introduceVariable(): String {
    val result = ArrayList<String>()
    BufferedReader(
        InputStreamReader(
            FileInputStream(File("a.txt")),
            Charsets.UTF_8
        )
    ).useLines { lines ->
        lines.forEach { line ->
            result.add(line)
        }
    }
    return result.joinToString(separator = System.lineSeparator())
}