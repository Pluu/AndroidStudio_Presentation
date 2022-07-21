//package com.example.recheckstudiosetting.list.shortcuts
//
//// You can quickly step through your source file in #IntelliJIDEA to find errors by pressing F2.
//// https://twitter.com/intellijidea/status/1460548216588410882?s=20&t=nZTRcugzKU8kWHFglkGi0Q
//
//import android.view.View
//import androidx.core.view.OneShotPreDrawListener
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
///**
// * Performs the given action when the view tree is about to be drawn.
// *
// * The action will only be invoked once prior to the next draw and then removed.
// */
//inline fun View.doOnPreDraw(
//    crossinline action: (view: View) -> Unit
//): OneShotPreDrawListener = OneShotPreDrawListener.add(this) {
//    action()
//}