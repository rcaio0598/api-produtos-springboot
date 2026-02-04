# 🧩 API de Produtos – Spring Boot | Arquitetura com SOLID

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![JPA](https://img.shields.io/badge/JPA-Hibernate-blue)
![H2](https://img.shields.io/badge/Database-H2-lightgrey)

---

## 📌 Sobre o Projeto

Esta aplicação é uma **API REST para cadastro e gerenciamento de produtos**, desenvolvida com **Spring Boot**, utilizando **Spring Data JPA** e **Hibernate**, com banco de dados **H2 em memória**.

O projeto foi criado como exercício prático de bootcamp, com foco não apenas em CRUD, mas principalmente em **organização de código, boas práticas e aplicação dos princípios SOLID**, simulando a estrutura de uma aplicação real.

---

## 🎯 Objetivos do Projeto

- Implementar uma API REST seguindo boas práticas
- Aplicar persistência de dados com JPA (sem SQL manual)
- Separar responsabilidades entre camadas
- Praticar princípios SOLID na arquitetura
- Criar um projeto claro, legível e fácil de evoluir

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **Banco de dados H2 (em memória)**
- **Maven**
- **Postman** (testes da API)

---

## 🧠 Arquitetura e Boas Práticas

O projeto foi estruturado respeitando os **princípios SOLID**, com foco em baixo acoplamento, alta coesão e facilidade de manutenção.

### 📂 Organização em Camadas

- **Controller**
  - Responsável apenas por receber e responder requisições HTTP
- **Service**
  - Contém as regras de negócio da aplicação
- **Repository**
  - Acesso a dados utilizando Spring Data JPA
- **Validation**
  - Validações desacopladas da camada de serviço
- **Model**
  - Entidades JPA que representam o domínio

Essa separação facilita:
- Manutenção do código
- Evolução do projeto
- Escrita de testes
- Leitura por outros desenvolvedores

---

## 📦 Entidade Produto

A entidade principal do sistema é `Produto`, contendo:

- `id` (Long)
- `nome` (String)
- `preco` (Double)

A persistência é feita com **JPA**, utilizando:
- `@Entity`
- `@Id`
- `@GeneratedValue`

---

## 📡 Endpoints da API

### ➕ Criar Produto
**POST** `/produtos`

```json
{
  "nome": "Notebook",
  "preco": 3500.00
}
