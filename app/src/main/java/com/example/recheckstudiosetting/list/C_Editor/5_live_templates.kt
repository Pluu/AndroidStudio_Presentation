package com.example.recheckstudiosetting.list.C_Editor

import android.content.Context
import android.util.AttributeSet
import android.view.View

// 자주 사용되는 구성을 코드에 삽입 가능
// Preferences | Editor | Live Templates

// Preferences | Editor | Live Templates
// 1. obtainStyledAttributes
//    - ↓↓↓↓↓ Template ↓↓↓↓↓
// 2. content_main.xml > Constraint center of Parent

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    init {

    }
}





























// Live Template
// val attr = context.theme.obtainStyledAttributes(attrs, R.styleable.$CLASS$, 0, 0)
// try {
// } catch (e: Exception) {
//     e.printStackTrace()
// } finally {
//     attr.recycle()
// }

// $CLASS$ => Expression:kotlinClassName()