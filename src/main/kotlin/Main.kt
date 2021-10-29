/*
Exercício 1

1 - Criem um novo projeto que se chama Calculadora
2 - Implemente uma função para cada operação aritmética

- Adição
- Subtração
- Multiplicação
- Divisão

3 - Na função Main, chame todas as funções com valores diferentes (pelo menos uma vez)
4 - Se desafiem, adicionando, ainda, uma função para calcular a potência de um número, com qualquer expoente.
 */


import kotlin.math.pow
fun main(args: Array<String>) {

    var operacao = 0
    var num1 = 0
    var num2 = 0

    println("Para usar a calculadora, digite a operação que deseja realizar: ")
    println("1 - Adição (+)")
    println("2 - Subtração (-)")
    println("3 - Multiplicação (*)")
    println("4 - Divisão (/)")
    println("5 - Exponencial (/)")
    operacao = readLine()!!.toInt()

    println("Digite o primeiro número: ")
    num1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    num2 = readLine()!!.toInt()

    fun adicao(n1: Int, n2: Int){
        val result = n1 + n2
        println("$n1 + $n2 = $result")
    }

    fun subtracao(n1: Int, n2: Int){
        val result = n1 - n2
        println("$n1 - $n2 = $result")
    }

    fun multiplicacao(n1: Int, n2: Int){
        val result = n1 * n2
        println("$n1 X $n2 = $result")
    }

    fun divisao(n1: Int, n2: Int){
        val result = n1 / n2
        println("$n1 / $n2 = $result")
    }

    fun exponencial(n1: Int, n2: Int) {
        var result = n1
        val x = 1

        if (n2 == 0) {
            println("$n1 ^ $n2 = 1")
        } else {

            for (x in n2 downTo 2 step 1) {
                println(x)
                println(n2)
                result *= n1
            }

            println("$n1 ^ $n2 = $result")
        }
    }

    if (operacao == 1){
        println("Você escolheu a opção 1 - Adição (+).")
        adicao(num1, num2)
    }

    if (operacao == 2){
        println("Você escolheu a opção 2 - Subtração (-).")
        subtracao(num1, num2)
    }

    if (operacao == 3){
        println("Você escolheu a opção 2 - Multiplicação (*).")
        multiplicacao(num1, num2)
    }

    if (operacao == 4){
        println("Você escolheu a opção 2 - Divisão (/).")
        divisao(num1, num2)
    }

    if (operacao == 5){
        println("Você escolheu a opção 5 - Exponencial (^).")
        exponencial(num1, num2)
    }



}