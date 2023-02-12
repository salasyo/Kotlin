import java.util.Scanner
fun main() {

    print("Enter number of cookies eaten: \n")
    var cookiesEaten = readLine()!!
    var integerValue: Int = cookiesEaten.toInt()

    val calorieIntake = integerValue * 75
    print("Your calorie intake was: $calorieIntake calories.")
}
