package com.test.inheritance

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true
    fun store(obj: Customer) {
        //implement code to store
    }
    fun getById(id: Int): Customer
}

class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        println("store")
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA() {
        println("Fun A form Interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A form Interface 2")
    }
}

class Class1And2: Interface1, Interface2 {
    override fun funA() {
        println("GOGO")
        super<Interface1>.funA()
//        super<Interface2>.funA()
    }

}

fun main() {
    val c = Class1And2()
    c.funA()
}
