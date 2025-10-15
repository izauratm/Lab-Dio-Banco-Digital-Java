package br.com.bancodigital.conta;

import br.com.bancodigital.Cliente;

public class ContaPoupanca extends Conta {

    private double taxaRendimentoMensal;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.taxaRendimentoMensal = 0.005; 
    }

    // Método específico (extensão do domínio)
    public void aplicarRendimento() {
        this.saldo += this.saldo * this.taxaRendimentoMensal;
        System.out.println("Rendimento de poupança aplicado. Novo saldo: R$" + String.format("%.2f", this.saldo));
    }
}