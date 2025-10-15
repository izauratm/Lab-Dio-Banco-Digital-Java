package br.com.bancodigital;

import br.com.bancodigital.conta.Conta;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Investimentos {

    @NonNull
    private String tipo;

    @NonNull
    private double valorInicial;

    @NonNull
    private Conta contaAssociada;

    private double rendimentoAcumulado;

    // Método de extensão do domínio
    public void simularRendimento(int meses, double taxaMensal) {
        double valorAtual = this.valorInicial;
        for (int i = 0; i < meses; i++) {
            valorAtual *= (1 + taxaMensal);
        }
        this.rendimentoAcumulado = valorAtual - this.valorInicial;
        System.out.println(String.format("Simulação de %s em %d meses: Rendimento de R$%.2f",
                this.tipo, meses, this.rendimentoAcumulado));
    }
}