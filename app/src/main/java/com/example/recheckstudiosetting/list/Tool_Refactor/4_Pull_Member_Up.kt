package com.example.recheckstudiosetting.list.Tool_Refactor

// Refactor | Pull Members Up...
// 1. ⌃ Ctrl + T
// 2. Select, Pull Members Up
private open class Parent

private class Child : Parent() {
    val name = "Name"

    val fullName: String
        get() = "My name is $name"
}