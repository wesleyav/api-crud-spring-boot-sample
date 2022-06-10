# Projeto CRUD API com Spring Boot

<p align="center">
  <img src="https://img.shields.io/badge/SPRING-FRAMEWORK-blue">
  <img src="https://img.shields.io/badge/LICENSE-MIT-blue">
  <img src="https://img.shields.io/badge/STATUS-CONCLUIDO-blue">
</p>

> Status do Projeto: :heavy_check_mark: CONCLUÍDO

<table>
  <tr>
    <td><img widht="100" height="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" /></td>
    <td><img widht="100" height="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-plain-wordmark.svg" /></td>
    <td><img widht="100" height="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/tomcat/tomcat-original-wordmark.svg" /></td>
    <td><img widht="100" height="100" src="https://pics.freeicons.io/uploads/icons/png/2550246031617448419-512.png" /></td>
  </tr>
</table>

### Descrição

Este é um projeto simples de <b>CRUD</b> com Spring Boot. Utiliza o H2 como banco de dados (em memória).Possui apenas uma tabela (city) que foi obtida do banco de dados de amostra Sakila disponível em (https://dev.mysql.com/doc/sakila/en/). Há um script que popula a tabela city quando o projeto é iniciado.

### Pré-requisitos

- Java JDK 11

### Modelo Entidade Relacionamento (MER)

![](/src/main/resources/docs/img/01-table-city.png)

### Como rodar a aplicação:

No terminal, clone o projeto:

```git
git clone https://github.com/wesleyav/api-crud-spring-boot-sample.git
```

Na raiz do projeto, execute:

```bash
mvn spring-boot: run
```

### Endpoints

Esse projeto possui alguns endpoints que podem ser acessados via Swagger através da seguinte url: http://localhost:8080/swagger-ui/index.html

### Swagger

![](/src/main/resources/docs/img/01-swagger.png)

## Licença

The [MIT License]() (MIT)
Copyright :copyright: 2022 - Projeto CRUD API com Spring Boot
