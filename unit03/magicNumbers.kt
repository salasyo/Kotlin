import java.util.Scanner
fun main() {

    val month = Scanner(System.`in`)
    val day = Scanner(System.`in`)
    val year = Scanner(System.`in`)
    println("Enter a month, day, and a two digit year in numeric form (press enter after each input) : ")
    var enteredMonth:Int = month.nextInt()
    var enteredDay:Int = day.nextInt()
    var enteredYear:Int = year.nextInt()

   if(enteredMonth * enteredDay == enteredYear) {

       println("$enteredMonth / $enteredDay / $enteredYear is MAGIC!")

   } else {
           println("$enteredMonth / $enteredDay / $enteredYear is not magic.")
       }
}
