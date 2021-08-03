# Api para Cadastro de Veículos
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/mcarnelos/projeto-api-cadastro-de-veiculos/blob/master/LICENSE) 

# Sobre o projeto

Projeto de uma Api Rest que faz cadastro de Veículos em Java.

## Features
- Cadastro de Veículos com verbo POST /veiculos
- Busca de Veículos com verbo GET /veiculos
- Busca de Veículos por id com verbo GET /veiculos/id
- Update de Veículos por id com verbo PUT /veiculos/id
- Deletar Veículos por id com verbo DELETE /veiculos/id

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Banco de Dados 
- MongoDB

# Como executar o projeto

## Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- IDE para desenvolvimento JAVA como Spring Tool Suite 4 ou IntelliJ IDEA
- Gerenciador de dependências Maven
- Postman para testar os verbos HTTP
- Banco de Dados MongoDB Compass

## Back end

```bash
# clonar repositório
git clone https://github.com/mcarnelos/projeto-api-cadastro-de-veiculos

# Importe o projeto na sua IDE

# Aguarde a sincronização das dependências do Maven

# Execute a aplicação

# O servidor inciará na porta:8081 abra o Postman e execute os verbos HTTP na url <http://localhost:8081/veiculos>

# Faça os testes no banco de dados MongoDB atraves da porta 27017
```

# Autor

Murilo Carnelós

https://www.linkedin.com/in/murilo-carnel%C3%B3s/
