import com.test.classExample.Customer
import com.test.classExample.Member
import java.lang.IllegalArgumentException
import java.util.*

fun main(args: Array<String>) {
    val myLong = 10L
    val myFlout = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    println(myLong)
    println(myFlout)
    println(myHex)
    println(myBinary)

    val mutipleLine = """
        first
        second
    """
    println(mutipleLine)


//    This is when test
    val choiceTarger = "GoGo2"
    var choice = when (choiceTarger) {

        "GoGo" -> {
            println("this is second condition.")
            20
        }
//        is String -> {
//            println("This is String")
//            println("This is the first condition.")
//            "You choice gogo"
//        }
        else -> {
            println("other condition.")
        }
    }
    println(choice)
//    when testing end
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")

    printInts(100)
    printInts(100, 101)
    printInts(100, 101, 102)
    printInts(100, 101, 102, 103)


    val member = Member(10, "Nori", 1986)
    println(member.id)
    println(member.name)
    println(member.age)
    member.socialSecurityNumber = "SN1234"
    println(member.socialSecurityNumber)


    val customer1 = Customer(10, "neko", "neko@gmail.com")
    println(customer1)
    println(customer1.toString())
}

fun printStrings(vararg strings: String) {
    workingWithStrings(*strings)
}
private fun workingWithStrings(vararg strings: String) {
    for (item in strings) println(item)
}

fun printInts(vararg ints: Int) {
    workingWithInts(*ints)
}
private fun workingWithInts(vararg ints: Int) {
    for (item in ints) println(item)
}

