fun main() {
    val baseFee = 10.0
    val lessThan20Fee = 0.10
    val from20To39Fee = 0.08
    val from40To59Fee = 0.06
    val moreThan60Fee = 0.04

    print("Enter the number of checks written this month: ")
    val numOfChecks = readLine()?.toIntOrNull()

    if (numOfChecks != null) {
        var checkFee = when (numOfChecks) {
            in 0..19 -> numOfChecks * lessThan20Fee
            in 20..39 -> numOfChecks * from20To39Fee
            in 40..59 -> numOfChecks * from40To59Fee
            else -> numOfChecks * moreThan60Fee
        }

        val totalFee = baseFee + checkFee
        println("Your total service fee for this month is $$totalFee")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}
