package br.com.bancodigital.conta;

import br.com.bancodigital.Cliente;

public class ContaCorrente extends Conta {

    // Atributo específico (extensão do domínio)
    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limiteChequeEspecial = 500.0; 
    }

}