# Desafio_Java_conta-banco
# Projeto Conta Banco 🏦

Este projeto é um desafio prático de Java que simula a abertura de uma conta bancária via terminal. Ele foi desenvolvido para exercitar conceitos fundamentais de sintaxe, estruturas de controle e manipulação de entradas de dados.

Este é um desafio proposto pelo professor Gleyson Sampaio na plataforma DIO, criar em Java um projeto que simule a abertura de uma conta bancária via terminal, colocando em prática o que foi aprendido até então, conceitos, estrutura, tipagens, condições, execeções e repetições.

## 🚀 Funcionalidades

- **Como foi feita a Entrada?** Solicita dados como Nome, Agência, Conta e Saldo.
- **Para a validação dos dados foi colocado:** - Impede campos vazios (Nome e Agência).
  - Garante que a Agência contenha apenas números.
  - Cuida de erros de digitação para valores numéricos (Inteiros e Decimais).
- **Um simulador financeiro com repetição:** Inclui um simulador de rendimento automático para os primeiros 6 meses.
- **Mensagens Personalizadas:** Exibe um resumo formatado da conta após o sucesso do cadastro.

## 🛠️ Pré Requisitos (como pedido)

- **Java JDK 17** (ou superior)
- **Classe Scanner:** Para leitura de dados do terminal.
- **Regex (Expressões Regulares):** Para validação de strings.
- **Controle de Fluxo:** Estruturas `if-else`, `switch-case`, `for`, `while` e `do-while`.
- **Tratamento de Exceções:** Uso de `try-catch-finally` para robustez do sistema.

## 📋 Como executar

1. Clone o repositório ou baixe o arquivo `ContaTerminalCompleta.java`.
2. Abra o terminal na pasta do projeto.
3. Compile o código:
   ```bash
   javac ContaTerminalCompleta.java
