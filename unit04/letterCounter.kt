fun main() {
    println("Enter a string:")
    val str = readLine() ?: ""
    println("Enter a character:")
    val char = readLine()?.get(0) ?: ' '

    val count = str.count { it == char }
    println("The character '$char' appears $count times in the string '$str'.")
}
