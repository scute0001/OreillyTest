import kotlin.math.pow

fun main() {
    var message = "Hello and welcome to AppWorks School :)"

    when (message.length) {
        0 -> println("Aye!")
        in 1..39 -> println("Your grace.")
        in 40..56 -> println("My lord.")
        else -> println("You know nothing.")
    }
    println(message.length)

//    Q3
    val array = Array(6) {1000.0.pow(it)}
    val units = arrayOf("byte", "KB", "MB", "GB", "TB", "PB")
    for ((i, value ) in array.withIndex()) {
        println("1 ${units[i]} = ${value.toLong()} bytes")
    }
    for (item in array.withIndex())
        println(item)
    val a = Array(6,{1000.0.pow(it)})

    

}