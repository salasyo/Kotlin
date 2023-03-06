fun main() {
    val stores = 5 
    val barCharSymbol = '*'
    
    val sales = Array(stores) { 0 }
    
    for (i in 0 until stores) {
        print("Enter today's sales for store ${i + 1}: ")
        sales[i] = readLine()?.toIntOrNull() ?: 0
    }
    
    println("\nSALES BAR CHART")
    for (i in 0 until stores) {
        print("Store ${i + 1}: ")
        repeat(sales[i] / 100) { print(barCharSymbol) }
        println()
    }
}
