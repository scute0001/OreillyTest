package com.test.classExample
import java.lang.UnsupportedOperationException
import kotlin.TODO as TODO1

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "[Minor Priority]"
        }

        override fun toString(): String {
            return "Minor Priority!"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            return "[Normal Priority]"
        }
    },
    MAJOR(1) {
        override fun text(): String {
            return "[Major Priority]"
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            return "[Critical Priority]"
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority)
    println(priority.value)
    println(priority.ordinal)

    println(Priority.CRITICAL.name)
    println(Priority.CRITICAL.value)
    println(Priority.CRITICAL)
    println("\n")

    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }
    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)

    val priorityMinor = Priority.MINOR
    println(priorityMinor)
    println(priorityMinor.name)

    println(priorityMinor.text())
    println(priority.text())

}