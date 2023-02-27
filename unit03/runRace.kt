import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the name of runner 1: ")
    val runner1_name = scanner.nextLine()
    print("Enter the race time for runner 1 (in minutes): ")
    val runner1_time = scanner.nextDouble()

    print("Enter the name of runner 2: ")
    val runner2_name = scanner.next()
    print("Enter the race time for runner 2 (in minutes): ")
    val runner2_time = scanner.nextDouble()

    print("Enter the name of runner 3: ")
    val runner3_name = scanner.next()
    print("Enter the race time for runner 3 (in minutes): ")
    val runner3_time = scanner.nextDouble()

    val runners = listOf(
        Pair(runner1_name, runner1_time),
        Pair(runner2_name, runner2_time),
        Pair(runner3_name, runner3_time)
    ).sortedBy { it.second }

    println("The runners finished in the following order:")
    for (i in runners.indices) {
        println("${i+1}. ${runners[i].first}")
    }
}
