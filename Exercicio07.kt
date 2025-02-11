fun main() {
    println("Digite o valor do lado do quadrado: ")
    val lado: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    val area: Double = lado * lado
    val total: Double = area * 2
   
    
    println("A area dobrada é ${"%.2f".format(total)}")
    }