fun calcularOrcamento(orcamento: Double, gasto: Double): Double {
    return orcamento - gasto
}

fun verificarLancamento(qualidade: Double, orcamentoRestante: Double): Boolean {
    return qualidade >= 70 && orcamentoRestante >= 0
}

fun main() {

    println("=== DESENVOLVIMENTO DE INDIE GAME ===")

    print("Digite o nome do jogo: ")
    val nome = readlnOrNull() ?: "Jogo sem nome"

    print("Digite o orçamento disponível: 10.000 ")
    val orcamento = readlnOrNull()?.toDoubleOrNull() ?: 10000.0

    var qualidade = 0.0
    var orcamentoRestante = orcamento

    println("\n=== DESENVOLVIMENTO ===")

    for (etapa in 1..4) {

        val gasto = 1500.0
        orcamentoRestante = calcularOrcamento(orcamentoRestante, gasto)

        qualidade += 20

        println("\nEtapa $etapa")
        println("Gasto: R$ $gasto")
        println("Orçamento restante: R$ $orcamentoRestante")
        println("Qualidade do jogo: $qualidade%")
    }

    val lancamento = verificarLancamento(qualidade, orcamentoRestante)

    println("\n=== RESULTADO FINAL ===")
    println("Jogo: $nome")
    println("Orçamento restante: R$ $orcamentoRestante")
    println("Qualidade final: $qualidade%")

    if (lancamento) {
        println("O jogo está pronto para ser lançado!")
    } else {
        println("O jogo ainda não está pronto para ser lançado.")
    }
}
