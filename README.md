# Projeto desenvolvido durante curso da Udemy - Microsserviços Java com Spring Boot e Spring Cloud

## Sobre o App:
Aplicativo com o objetivo de introduzir a algumas das principais ferramentas do Spring Cloud para estruturação de um sistema em microsserviços. Chamadas de API entre microsserviços por meio de clientes Feign

## Ferramentas/Tecnologias utilizadas:
- Java 11
- Sprint Boot 2.3.4
- Feign
- Ribbon
- Hystrix
- OAuth e JWT
- Discovery Server Eureka
- API Gateway Zuul
- Config Server

## Como rodar
* Fazer um clone deste repositório
* Abrir no Eclipse ou STS
* Criar um repositório no git para o config server
* Dentro do repositório criar um arquivo chamado application.properties e inserir os dados abaixo
```
oauth.client.name=<Criar seu app name>
oauth.client.secret=<Criar seu app secret>

jwt.secret=<Criar seu jwt secret>
```
* No application.properties do projeto hr-config-server informar
```
spring.cloud.config.server.git.uri=<url do projeto git para o config server>
```
* Definir as variáveis de ambiente GITHUB_USER e GITHUB_PASS com o seu usuário e senha do github (apenas em caso de repositório privado)
* Iniciar todos os projetos

## Como Acessar os Endpoints
Escrita desta seção em breve

## Visão geral do sistema
<p align="center">
  <img src="/ms-system.png">
</p>
