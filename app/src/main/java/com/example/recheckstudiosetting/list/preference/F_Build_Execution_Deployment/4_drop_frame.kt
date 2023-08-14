package com.example.recheckstudiosetting.list.preference.F_Build_Execution_Deployment

import android.util.Log

// On Debugging
// Set breakpoint
// Debug Menu > Drop Frame

fun dropFrame(value: Int) {
    doSomething()
    Log.d("TAG", value.toString())
}

private fun doSomething() {
    Log.d("TAG", "blalbabla")
}
