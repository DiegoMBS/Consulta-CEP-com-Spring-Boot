# 📦 Consulta de CEP com Spring Boot

Aplicação web desenvolvida com **Spring Boot** que consome dados da API pública do [ViaCEP](https://viacep.com.br/), permitindo a consulta de endereços a partir do CEP informado.

## ✨ Funcionalidades

- Consulta de endereço pelo CEP
- Consumo de API REST externa (ViaCEP)
- Exibição dos dados retornados diretamente na interface
- Interface simples e funcional com HTML e JavaScript

## 🖥️ Interface

A interface é composta por:
- Um campo de entrada para digitar o CEP
- Um botão para realizar a consulta
- Um painel que exibe os dados de endereço retornados pela API

[Tela da aplicação]
<img width="800" height="300" alt="consulta" src="https://github.com/user-attachments/assets/c85e4b04-c106-460f-96a2-150a2d4e4a83" />

[Tela apresentado o resultado da consulta:]
<img width="642" height="556" alt="consulta_ok" src="https://github.com/user-attachments/assets/586b37d1-8ada-4aa5-8d57-578671d29cbf" />

[Tela com critica ao digitar errado:] <br>
<img width="642" height="556" alt="consulta com erro" src="https://github.com/user-attachments/assets/e30f235c-b0f4-4402-b163-fd8b1b646880" />


## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- REST API (ViaCEP)
- HTML/CSS/JavaScript (puro)
- Maven

## 📁 Estrutura do projeto

Consulta-CEP-com-Spring-Boot/<br>
├── src/ # Código-fonte da aplicação <br>
├── .mvn/ # Wrapper do Maven <br>
├── pom.xml # Gerenciador de dependências <br>
├── requests.http # Requisições de teste <br>
└── README.md # Documentação do projeto <br>


## 🔧 Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- Maven

### Passos

1. Clone este repositório:
bash
git clone https://github.com/SeuUsuario/Consulta-CEP-com-Spring-Boot.git
Acesse a pasta do projeto:

2. Acesse a pasta do projeto:
bash
cd Consulta-CEP-com-Spring-Boot
Compile e execute:

3. Compile e execute:
bash
./mvnw spring-boot:run

4. Acesse no navegador:
web
http://localhost:8080


## 📌 Observações
O campo de CEP deve ser preenchido com 8 dígitos (somente números).

Em caso de CEP inválido, a aplicação tratará o erro e não exibirá os dados.

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
