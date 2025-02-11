fun main() {
    println("Digite o raio do circulo: ")
    val raio: Double = readLine()?.toDoubleOrNull() ?: 0.0
    
    val area: Double = 3.14159265358979323846 * (raio * raio)
    
    println("A area aproximada é ${"%.2f".format(area)}")
    }
    