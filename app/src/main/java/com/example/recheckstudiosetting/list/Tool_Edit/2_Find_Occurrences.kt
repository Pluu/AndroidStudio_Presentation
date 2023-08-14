package com.example.recheckstudiosetting.list.Tool_Edit

// Edit - Find - Add Selection for Occurrences
// Find and select multiple occurrences
// ⌃ Ctrl + G (macOS), or Alt+J (Windows/Linux)
// https://www.jetbrains.com/help/idea/multicursor.html?#multiple_words

private fun iterateList(list: List<String>) {
    executeAction(list)
}

private fun executeAction(list: List<String>) {
    list.forEach { instance ->
        println(instance)
    }
}