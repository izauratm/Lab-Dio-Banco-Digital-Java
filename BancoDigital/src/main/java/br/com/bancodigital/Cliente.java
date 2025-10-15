package br.com.bancodigital;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// @Data: Gera Getters, Setters, ToString, EqualsAndHashCode
@Data
// @RequiredArgsConstructor: Gera um construtor com campos final ou @NonNull
@RequiredArgsConstructor
@NoArgsConstructor(force = true) // Gera construtor sem argumentos para uso do Lombok em outras anotações
public class Cliente {

    @NonNull
    private String nome;

    @NonNull
    private String cpf;
    private String telefone; 
}