# 🏦 Banco Digital Simples em Java
Este repositório reúne os principais aprendizados adquiridos durante o **Bootcamp GFT - Desenvolvimento Java com IA - Curso: Orientação a Objetos e Eficiência na Manipulação de Dados em Java** da plataforma DIO.me.
Um projeto simples de simulação de um sistema de banco digital desenvolvido em Java, utilizando Programação Orientada a Objetos (POO) com herança, interfaces e o uso da biblioteca [Lombok](https://projectlombok.org/) para redução de código boilerplate.

---

## 🚀 Funcionalidades
O sistema simula as operações bancárias básicas entre diferentes tipos de contas.

Operações Principais
- Abertura de Contas: Criação de Contas Correntes e Contas Poupança.
- Depósito e Saque: Transações básicas de movimentação de saldo.
- Transferência: Movimentação de valores entre contas de diferentes clientes.
- Extrato: Impressão detalhada das informações da conta e saldo.
- Rendimento: Aplicação de rendimento mensal (simulado) na Conta Poupança.
- Investimentos: Simulação de rendimentos de investimentos como o CDB.
- Listagem de Contas: O objeto Banco é responsável por manter e listar todas as contas cadastradas.

## 🧱 Estrutura do Projeto  

O projeto utiliza uma estrutura de pacotes organizada para separar as entidades principais do domínio bancário.
```
src/main/java
└── br.com.bancodigital
    ├── Banco.java              // Gerencia a lista de contas
    ├── Cliente.java            // Entidade principal (titular da conta)
    ├── IConta.java             // Interface para as operações bancárias
    ├── Investimentos.java      // Simulação de produtos de investimento
    ├── Main.java               // Ponto de entrada e execução do teste
    └── conta                   // Subpacote para as classes de conta
        ├── Conta.java          // Classe abstrata (estrutura base)
        ├── ContaCorrente.java  // Estende Conta (adiciona Cheque Especial)
        └── ContaPoupanca.java  // Estende Conta (adiciona Rendimento)
```

## 🛠️ Tecnologias Utilizadas
- Linguagem: Java 17+ (recomendado)
- IDE: IntelliJ IDEA (Utilizado para o desenvolvimento e push para o GitHub)
- Conceitos POO: Abstração, Encapsulamento, Herança e Polimorfismo
- Bibliotecas:
  * **Lombok:** Utilizado para gerar getters, setters, construtores (@Data, @Getter, @RequiredArgsConstructor).
 
## 👩‍💻 Desenvolvedora
Izaura TM - responsável pelo projeto.

## 📫 Contribuições
Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias, sugestões ou novas funcionalidades!

> Este conteúdo faz parte do projeto **Criando um Banco Digital com Java e Orientação a Objetos - Laboratório** da plataforma DIO.me.

---
 ### 💡Links de Referência:
- [Lombok](https://projectlombok.org/)
- [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/)
- [JAVA Downloads](https://www.oracle.com/java/technologies/downloads/)
  
📎 Link do curso: [DIO.me](https://web.dio.me/home) 



