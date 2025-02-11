fun main() {
    println("Digite a distancia em metros: ")
    val metros: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    val cent: Double = metros * 100
    
    println("A distancia em centimentros é: $cent")
    }