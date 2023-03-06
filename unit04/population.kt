fun main() {
    
    var start = 0
    while (start < 2) {
        print("Enter starting number of organisms (must be at least 2): ")
        start = readLine()?.toIntOrNull() ?: 0
    }

    var increase = 0.0
    while (increase <= 0) {
        print("Enter average daily population increase (as a percentage): ")
        increase = readLine()?.toDoubleOrNull()?.div(100) ?: 0.0
    }

    var days = 0
    while (days < 1) {
        print("Enter number of days they will multiply (must be at least 1): ")
        days = readLine()?.toIntOrNull() ?: 0
    }

    var population = start.toDouble()
    for (day in 1..days) {
        println("Day $day: Population size is ${population.toInt()}")
        population *= (1 + increase)
    }
}
