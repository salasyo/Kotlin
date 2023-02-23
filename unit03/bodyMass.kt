import java.util.Scanner
fun main() {

    val weight = Scanner(System.`in`)
    println("Enter weight in pounds: ")
    var enteredWeight:Int = weight.nextInt()

    val height = Scanner(System.`in`)
    println("Enter height in inches: ")
    var enteredHeight:Int = height.nextInt()

    val BMI = (enteredWeight * 703) / (enteredHeight * enteredHeight)

    if (BMI < 18.5) {
        println("underweight")
    }
    else if (BMI > 18.5 && BMI < 25) {
            println("optimal weight")
        }
        else {
            println("overweight")
    }
}
