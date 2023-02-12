import kotlin.math.*
fun main() {

    println("Enter amount of principal originally deposited into account: ")
    val P = readLine()!!
    println("Enter annual interest rate paid by the account: ")
    val r = readLine()!!
    println("Enter number of times per year the interest is compounded: ")
    val n = readLine()!!
    println("Enter the number of years the account will be left to earn interest: ")
    val t = readLine()!!

    val A = P.toDouble() * Math.pow((1 + r.toDouble()/100.00),t.toDouble()) - P

    println("Amount of money in the account after $t is $A.")
}
