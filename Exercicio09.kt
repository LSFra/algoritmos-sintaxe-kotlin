fun main() {
    println("Digite a temperatura em Fahrenheit: ")
    val F: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    val C: Double = 5 * ((F-32) / 9)
    
    println("A temperatura em celsius é:  ${"%.2f".format(C)}")
    }