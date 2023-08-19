package com.example.recheckstudiosetting.list.preference.C_Editor

// additional information about your code, like the names of the parameters that a called method expects
// Preferences | Editor | Inlay Hints
// https://www.jetbrains.com/help/idea/inlay-hints.html

val a = listOf(1, 2, 3).sum()

private fun test(a: Int, b: String) {
    // TODO
}
private fun test2() {
    test(10, "20")
}

private fun test3() = (0..10)
    .map {
        it * 2
    }.joinToString(separator = ",") { it.toString() }