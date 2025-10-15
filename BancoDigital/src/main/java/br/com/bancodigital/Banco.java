package br.com.bancodigital;

import java.util.ArrayList;
import java.util.List;
import br.com.bancodigital.conta.Conta;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter // Apenas Getters para manter a lista de contas encapsulada
@RequiredArgsConstructor 
public class Banco {

    @NonNull
    private String nome;

    private List<Conta> contas = new ArrayList<>(); // Lista de contas (extensão do domínio)

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        System.out.println("\n=== Contas do Banco " + this.nome + " ===");
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        for (Conta conta : contas) {
            System.out.println(String.format("Agência: %d | Número: %d | Titular: %s | Saldo: R$%.2f",
                    conta.getAgencia(), conta.getNumero(), conta.getCliente().getNome(), conta.getSaldo()));
        }
        System.out.println("===============================\n");
    }
}
