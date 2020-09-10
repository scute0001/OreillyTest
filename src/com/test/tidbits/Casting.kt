package com.test.tidbits

open class Person {

}
class Employee: Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}
class Contractor: Person() {

}
fun hasVacations(obj: Person) {
//    type casting
    if (obj is Employee){
        obj.vacationDays(20)
    } else {
//        obj. (nothing..........)
    }
}

var input: Any = 10
fun main() {
//    error use <as>: because input is a Int
//    val str = input as String
//    println(str.length)

    val str = input as? String
    println(str?.length)

}