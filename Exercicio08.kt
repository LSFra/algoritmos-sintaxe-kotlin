fun main() {
    println("Digite o valor que você recebe por hora trabalhada: ")
    val valorhora: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite o número de horas que você trabalhou: ")
    val horas = readLine()?.toIntOrNull() ?: 0
    
    val salario = valorhora * horas
    
    println("O salario é ${"%.2f".format(salario)}")
    }