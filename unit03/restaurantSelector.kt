import java.util.Scanner

fun main() {
    // Define the restaurant options and their dietary information
    val restaurants = mapOf(
        "Joe's Gourmet Burgers" to listOf("No", "No", "No"),
        "Main Street Pizza Company" to listOf("Yes", "No", "Yes"),
        "Corner Cafe" to listOf("Yes", "Yes", "Yes"),
        "Mama's Fine Italian" to listOf("Yes", "No", "No"),
        "The Chef's Kitchen" to listOf("Yes", "Yes", "Yes")
    )

    // Ask about dietary restrictions
    val scanner = Scanner(System.`in`)
    print("Is anyone in your party a vegetarian? ")
    val vegetarian = scanner.nextLine().equals("yes", ignoreCase = true)
    print("Is anyone in your party a vegan? ")
    val vegan = scanner.nextLine().equals("yes", ignoreCase = true)
    print("Is anyone in your party gluten-free? ")
    val glutenFree = scanner.nextLine().equals("yes", ignoreCase = true)

    // Find restaurants that can accommodate the group's dietary needs
    val options = restaurants.filter { (name, dietary) ->
        (!vegetarian || dietary[0] == "Yes") &&
        (!vegan || dietary[1] == "Yes") &&
        (!glutenFree || dietary[2] == "Yes")
    }.keys

    // Display the restaurant options
    println("\nHere are your restaurant choices:")
    for (restaurant in options) {
        println(restaurant)
    }
}
