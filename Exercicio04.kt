fun main() {
    println("Digite a primeira nota: ")
    val nota1: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite a segunda nota: ")
    val nota2: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite a terceira nota: ")
    val nota3: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Digite a quarta nota: ")
    val nota4: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    val total: Double = nota1 + nota2 + nota3 + nota4
    
    val media: Double = total/4
    
    println("A média das notas é: %.2f".format(media))
}