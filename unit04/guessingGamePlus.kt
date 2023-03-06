fun main() {
    val maxNumber = 100
    val randomNumber = (Math.random() * maxNumber + 1).toInt()
    var guess: Int? = null
    var numberOfGuesses = 0

    println("Guess a number between 1 and $maxNumber")

    while (guess != randomNumber) {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()

        if (guess != null) {
            numberOfGuesses++

            when {
                guess > randomNumber -> println("Too high, try again.")
                guess < randomNumber -> println("Too low, try again.")
                else -> println("Congratulations, you guessed the number in $numberOfGuesses guesses!")
            }
        }
    }
}
