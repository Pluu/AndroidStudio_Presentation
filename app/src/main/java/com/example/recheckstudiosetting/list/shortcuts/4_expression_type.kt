package com.example.recheckstudiosetting.list.shortcuts

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.TextView
import androidx.core.view.doOnLayout
import androidx.core.view.doOnPreDraw
import androidx.core.widget.doAfterTextChanged
import kotlin.math.abs

// Menu - View - Expression Type (Cmd + Shift + P)

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