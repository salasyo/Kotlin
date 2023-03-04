fun main() {
    print("Enter a positive nonzero integer value: ")
    var num = readLine()?.toIntOrNull()
    var sum = 0

    while (num == null || num <= 0) {
        print("Invalid input. Please enter a positive nonzero integer value: ")
        num = readLine()?.toIntOrNull()
    }

    for (i in 1..num) {
        sum += i
    }

    println("The sum of all integers from 1 up to $num is $sum")
}
