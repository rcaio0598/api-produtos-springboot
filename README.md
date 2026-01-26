# API Produtos - Spring Boot (JPA + H2)

![Status](https://img.shields.io/badge/status-concluído-brightgreen)
![Java](https://img.shields.io/badge/java-17-blue)
![Spring](https://img.shields.io/badge/springboot-4.0.2-green)
![H2](https://img.shields.io/badge/H2-in-memory-purple)

---

## 📌 Sobre o projeto

Este projeto é uma API REST de produtos criada com **Spring Boot**, utilizando **Spring Data JPA** e **Hibernate**, com banco de dados **H2 em memória**.

O objetivo do exercício é implementar persistência em banco de dados e realizar operações CRUD (Create, Read, Update, Delete) utilizando JPA, sem SQL manual.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco H2 (em memória)
- Postman (para testes)

---

## 📌 Checklist do exercício

- [x] Entidade Produto com `@Entity`
- [x] ID com `@Id` e `@GeneratedValue`
- [x] CRUD com JPA (sem SQL manual)
- [x] H2 configurado
- [x] Console do H2 funcionando
- [x] Aplicação rodando na porta padrão 8080

---

## 📦 Como rodar o projeto

### 1) Baixar o projeto
Clone ou faça download do repositório.

### 2) Rodar a aplicação
Abra o terminal dentro da pasta do projeto e execute:

```bash
mvn spring-boot:run
