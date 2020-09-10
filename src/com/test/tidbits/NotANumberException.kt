package com.test.tidbits

import java.io.BufferedReader
import java.io.FileReader
import java.lang.IllegalArgumentException

class NotANumberException(massage: String) : Throwable(massage) {
}
fun checkIsNumber(obj: Any) {
    when(obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This isn't a number!")
    }
}


fun main(args: Array<String>) {
    try {
        checkIsNumber("A")
    } catch (e: IllegalArgumentException) {
        println("Do nothing!")
    } catch (e: NotANumberException) {
        println("It was not a number!")
        println("${e.message}")
    }

    val buffer = BufferedReader(FileReader("src/input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
        println(chars)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled.")
        -1
    } finally {
        println("Closing")
        buffer.close()
        -2
    }
    println(result)
    println(result.toString())

}