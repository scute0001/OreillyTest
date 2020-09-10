package com.test.fuctional

fun String.hello() {
    println("It is me!")
}
fun String.toTitleCase() : String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun String.toTitleCase1(prefix: String) : String {
    return this.split(" ").joinToString(" ") { "$prefix ${it.capitalize()}" }
}


fun main() {
    "Hello world".hello()
    println("this is a sample string to Title Case it".toTitleCase())
    println("this is a sample string to Title Case it".toTitleCase1("again"))

}