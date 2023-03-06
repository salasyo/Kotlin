import kotlin.random.Random

fun main() {
    val maxNumber = 100
    val randomNumber = Random.nextInt(maxNumber) + 1
    var guess: Int? = null

    println("Guess a number between 1 and $maxNumber")

    while (guess != randomNumber) {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()

        if (guess != null) {
            when {
                guess > randomNumber -> println("Too high, try again.")
                guess < randomNumber -> println("Too low, try again.")
                else -> println("Congratulations, you guessed the number!")
            }
        }
    }
}
