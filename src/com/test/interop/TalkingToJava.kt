package com.test.interop

import com.test.java.CustomerJava

fun main() {
    val customer = CustomerJava()

    customer.email = "mail@gg.com"
    customer.id = 10
    customer.name = "Nori"

    customer.prettyPrint()

    val runnable = Runnable { println("Invoking runnable") }
}

class PersonKotlin: PersonJava() {

}

//   this class can replace by
//   <val runnable = Runnable { println("Invoking runnable") }>
class RunnableKotlin: Runnable {
    override fun run() {
        TODO("Not yet implemented")
    }
}

class KotlinCustomerRepo: CustomerRepository {
    override fun getById(id: Int): CustomerJava {
        TODO("Not yet implemented")
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("Not yet implemented")
    }

}