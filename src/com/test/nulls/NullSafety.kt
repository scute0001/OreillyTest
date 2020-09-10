package com.test.nulls

class Service {
    fun evaluate(){}
}
class ServiceProvider {
    fun createServices(): Service? {
        return Service()
    }
}


fun main(args: Array<String>) {
    val massage: String = "Massage"

    val nullMassage: String? = null
    val inferredNull = null

//    safe call
    if (nullMassage != null){
        println(nullMassage.length)
    }
    println(nullMassage?.length)
//    if be null, send a NullPointerException by !!
//    println(nullMassage!!.length)

    val sp = createServiceProvider()
    sp?.createServices()?.evaluate()

}

fun createServiceProvider(): ServiceProvider? = ServiceProvider()
