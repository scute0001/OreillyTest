package com.test.fuctional

import com.test.functional.unaryOperation

//number is the closure of lambda
fun outsideFunction() {
    for (number in 1..30) {
        unaryOperation(20) { x ->
            println(number)
            x * number
        }
    }
}


fun main() {
    outsideFunction()
}