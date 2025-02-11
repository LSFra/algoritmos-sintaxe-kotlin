fun main() {
    println("Digite a temperatura em Celsius: ")
    val C: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    val F: Double = C * 2 + 30
    
    println("A temperatura em Fahrenheit é:  ${"%.2f".format(F)}")
    }
    