package br.com.bancodigital.conta;

import br.com.bancodigital.IConta;
import br.com.bancodigital.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    // Métodos da interface
    @Override
    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.err.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.err.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para conta " + contaDestino.getNumero() + " realizada com sucesso.");
        } else {
            System.err.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato " + this.getClass().getSimpleName() + " ===");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
        System.out.println("===============================");
    }
}