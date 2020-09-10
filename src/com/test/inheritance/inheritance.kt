package com.test.inheritance
open class Person() {
    open fun validate() {
        println("It is validated.")
    }
}
open class Customer: Person() {
    override fun validate() {
        println("This customer is validated.")
    }
}

class SpecialCustomer: Customer() {

}

data class CustomerEntity(val name: String): Person()

fun main() {
    val customer = Customer()
    val person = Person()
    customer.validate()
    person.validate()

    var customer1 = CustomerEntity("Nori")
    customer1.validate()
    println(customer1.name)

}