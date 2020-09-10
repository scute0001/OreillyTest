package com.test.inheritance

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main() {
    val customerRepo = CustomerGenericRepository<Customer>()
    val customer = customerRepo.getById(10)
    val customers = customerRepo.getAll()

}