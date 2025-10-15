package br.com.bancodigital;

import br.com.bancodigital.conta.ContaCorrente;
import br.com.bancodigital.conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Banco bancoDigital = new Banco("Banco Digital Java");

        Cliente venilton = new Cliente("Venilton Santos", "123.456.789-00");
        Cliente maria = new Cliente("Maria Oliveira", "987.654.321-11");
        Cliente carlos = new Cliente("Carlos Silva", "111.222.333-44");
        Cliente vera = new Cliente ("Vera Ramos","987.455.300.00");

        ContaCorrente cc = new ContaCorrente(venilton);
        ContaPoupanca poupanca = new ContaPoupanca(maria);

        ContaCorrente ccCarlos = new ContaCorrente(carlos);
        ContaPoupanca poupancaVera = new ContaPoupanca(vera);

        bancoDigital.adicionarConta(poupancaVera);
        bancoDigital.adicionarConta(ccCarlos);

        bancoDigital.adicionarConta(cc);
        bancoDigital.adicionarConta(poupanca);
     
        System.out.println("--- OPERAÇÕES ---");
        
        cc.depositar(1000);
       
        cc.sacar(200);
      
        cc.transferir(150, poupanca);
        
        poupanca.aplicarRendimento();

        poupancaVera.depositar(500);
        ccCarlos.depositar(2000);
        ccCarlos.sacar(350);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
       
        System.out.println("--- INVESTIMENTOS ---");
        Investimentos cdb = new Investimentos("CDB", 500.0, cc);
        cdb.simularRendimento(12, 0.01); // 1% ao mês
        System.out.println("Valor inicial do CDB: R$" + cdb.getValorInicial());

       bancoDigital.listarContas();
    }
}