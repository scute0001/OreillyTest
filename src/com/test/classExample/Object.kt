package com.test.classExample

object Globle {
    val PI = 3.14
    val LONG_PI = 3.14159265359
}

fun main(args: Array<String>) {
    val localObjects = object {
        val PI = 3.14159
    }
    println(localObjects.PI)
    println(Globle.PI)
    println(Globle.LONG_PI)
}