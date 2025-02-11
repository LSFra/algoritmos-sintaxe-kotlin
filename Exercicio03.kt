fun main() {
    println("Digite o primeiro número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Digite o segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    println("A soma dos números $num1 e $num2 é:  ${num1 + num2}")
}