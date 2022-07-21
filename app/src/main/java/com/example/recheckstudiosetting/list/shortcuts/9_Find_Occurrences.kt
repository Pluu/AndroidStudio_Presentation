package com.example.recheckstudiosetting.list.shortcuts

// Find and select multiple occurrences
// ⌃G (macOS), or Alt+J (Windows/Linux)
// https://twitter.com/intellijidea/status/1550027980411469825?s=20&t=nZTRcugzKU8kWHFglkGi0Q

private fun iterateList(list: List<String>) {
    executeAction(list)
}

private fun executeAction(list: List<String>) {
    list.forEach { instance ->
        println(instance)
    }
}