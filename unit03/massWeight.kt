import java.util.Scanner
fun main() {

    val mass = Scanner(System.`in`)
    println("Enter an objects mass: ")
    var enteredMass:Double = mass.nextDouble()


    val weight = (enteredMass * 9.8)

    if (weight < 10) {
        println("The object is too light")
    }
    else if (weight > 1000) {
        println("The object is too heavy")
    }
}
