
<p align="center">
  <img src="https://hermes.dio.me/assets/diome/logo.svg" alt="DIO Logo" width="300"/>
  <br/>
  <br/>
  <br/>
  <img src="./Santander-2025--Back-End-com-Java--Desafio-2/assets/backend-com-java.png" alt="Bootcamp Logo" width="100"/>
</p>

# 📌 Projeto DesafioControleFluxo

Este projeto foi desenvolvido como parte do desafio **Controle de Fluxo** do Bootcamp DIO.  
O objetivo é exercitar o conteúdo do módulo de Controle de Fluxo, criando um programa que recebe dois números inteiros via terminal e imprime uma sequência de números com base na diferença entre eles.

## 🚀 Tecnologias Utilizadas

- **Java** (versão recomendada: 11+)
- **Terminal / Prompt de Comando**
- **Classe Scanner**
- **Controle de Fluxo (for, exceções customizadas)**

## 📄 Descrição

O programa realiza as seguintes operações:
- Recebe **dois números inteiros** como entrada do usuário.
- Verifica se o **segundo número é maior** que o primeiro.
- Caso contrário, lança uma exceção customizada chamada `ParametrosInvalidosException` com a mensagem:  
  `"O segundo parâmetro deve ser maior que o primeiro"`.
- Se os números forem válidos, executa um `for` que imprime no console a contagem de 1 até a diferença entre os dois números, exibindo mensagens como:
  - `"Imprimindo o número 1"`
  - `"Imprimindo o número 2"`
  - E assim por diante.

## ⚙️ Como Funciona

1️⃣ Usuário digita o **primeiro número**  
2️⃣ Usuário digita o **segundo número**  
3️⃣ O sistema valida os parâmetros:  
   - Se o segundo número for menor ou igual ao primeiro, uma exceção será lançada.  
   <img src="./Santander-2025--Back-End-com-Java--Desafio-1/assets/exceptionOk.png" alt="image" width="100"/>
   - Se for maior, o programa imprime a sequência de números até o valor da diferença.
   <img src="./Santander-2025--Back-End-com-Java--Desafio-1/assets/tryOk.png" alt="image" width="100"/>

## 💻 Como Executar

1️⃣ Clone o repositório:
```bash
git clone https://github.com/amarildochagasjr/Santander-2025--Back-End-com-Java--Desafio-1
```

2️⃣ Compile o projeto e execute a classe `Contador`:
```bash
javac Contador.java ParametrosInvalidosException.java
java Contador
```

3️⃣ Siga as instruções no terminal para inserir os números.

---

🚀 **Bom estudo e bons códigos!**
