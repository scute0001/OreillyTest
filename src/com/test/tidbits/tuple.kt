package com.test.tidbits

import com.test.classExample.Customer

fun capitalAndPopulation(country: String): Pair<String, Int> {
    return Pair("Madrid", 2300000)
}

fun countryInfomation(country: String): Triple<String, String, Int> {
    return Triple("Madrid", "Europe", 2300000)
}


fun main(args: Array<String>) {
    val result = capitalAndPopulation("Madrid")
    println(result)
    println(result.first)
    println(result.second)

    val countryInfo = countryInfomation("Madrid")
    println(countryInfo)

//    test Pair
    val array = mutableListOf<String>()
    val int = 0
    var twoValue= Pair(array, listOf(10, 20, 30))
    println(twoValue)
    println(twoValue.second.indexOf(30))
    twoValue.first.add("A")
    twoValue.first.add("B")
    println(twoValue.first[1])

//    deconstructing
    val (capital, continent, population) = countryInfomation("Madrid")
    println("$capital - $continent - $population")

    val (id, name, email) = Customer(1, "BAGA", "BAGA@gmail.com")
    println(email)

    val customer1 = Customer(2, "GG", "GG@gmail.com")
    val (cId, cName, cEmail) = customer1
    println(customer1.email)
    println(cEmail)

}