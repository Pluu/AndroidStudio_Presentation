package com.example.recheckstudiosetting.list.preference.F_Build_Execution_Deployment

// Confirm delete Breakpoints on Conditional or logging
// Preferences | Build, Execution, Deployment | Debugger
// https://www.jetbrains.com/help/idea/settings-debugger.html#b5dd1295

// Open...BreakPointSampleTest > Run

fun fooBreakpoints(value: Int) {
    if (value == 5) {
        println(value)
    }
    println("blabla")
}