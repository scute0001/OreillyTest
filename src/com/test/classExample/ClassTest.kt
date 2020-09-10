package com.test.classExample

import java.lang.IllegalArgumentException
import java.util.*


class Member(val id: Int, var name: String, var yearOfBirth: Int) {
    init {
        name = name.toUpperCase()
    }
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            field = value
        }
    lateinit var mEmail: String
    constructor(email: String): this(10, "", 1988) {
        mEmail = email
    }
}
data class Customer(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}