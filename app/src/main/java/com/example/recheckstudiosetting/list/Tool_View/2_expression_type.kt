package com.example.recheckstudiosetting.list.Tool_View

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.TextView
import androidx.core.view.doOnLayout
import androidx.core.view.doOnPreDraw
import androidx.core.widget.doAfterTextChanged
import kotlin.math.abs

// Main Menu | View | Code Editor View Actions | Code View Actions | Type Info
// - ⇧ Shift + ⌃ Ctrl + P (macOS)
// - Shift + Ctrl + P (Windows/Linux)
// https://twitter.com/intellijidea/status/1531183673835257856?s=20&t=nZTRcugzKU8kWHFglkGi0Q

fun expressionType() {
    abs(1 - 10)
    Log.d("DEBUG", "Debug Print")

    val context: Context = Application()
    val view = TextView(context)
    view.alpha
    view.textSize
    view.textScaleX
    view.visibility
    view.textColors
    view.compoundDrawables

    view.doAfterTextChanged {  }
    view.doOnLayout {  }
    view.doOnPreDraw {  }
}