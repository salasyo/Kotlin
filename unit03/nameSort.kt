fun main() {

    println("Enter three names: ")
    val name1: String = readLine()!!
    val name2: String = readLine()!!
    val name3: String = readLine()!!

    val names = arrayOf(name1, name2, name3)

    names.sort()

    println(names.joinToString())
}
