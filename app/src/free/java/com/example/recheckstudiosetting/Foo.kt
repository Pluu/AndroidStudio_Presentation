package com.example.recheckstudiosetting

object Foo : IFoo {
    override fun getFooTitle(): String  = "${BuildConfig.FLAVOR}-Foo-Foo"
}