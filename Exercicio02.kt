fun main() {
    println("Digite um número: ")
    val num = readLine()?.toIntOrNull() ?: 0
    println("O número digitado foi: $num")
}