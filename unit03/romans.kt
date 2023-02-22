import java.util.Scanner
fun main() {

    val number1 = Scanner(System.`in`)
    println("Enter a number within the range of 1 through 10: ")
    var enteredNumber1:Int = number1.nextInt()

    when (enteredNumber1) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("Error!")
    }
}
