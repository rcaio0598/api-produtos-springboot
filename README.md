# API Produtos - Spring Boot (JPA + Hibernate + H2)

## 📌 Descrição
Projeto desenvolvido como exercício prático para implementar persistência com **Spring Data JPA**, **Hibernate** e banco de dados **H2 em memória**.

O objetivo é evoluir um CRUD já existente, agora salvando os dados no banco ao invés de manter em memória.

---

## 🧱 Tecnologias / Starters
- Spring Boot 4
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database (em memória)
- Maven

---

## 🗂 Estrutura do Projeto

- `model/Produto.java` → Entidade JPA
- `repository/ProdutoRepository.java` → Repositório JPA
- `controller/ProdutoController.java` → CRUD via REST
- `application.properties` → Configuração do H2 e JPA

---

## 🛠 Funcionalidades (CRUD)

### ✅ Create
**POST /produtos**

Exemplo JSON:

```json
{
  "nome": "Camiseta",
  "preco": 59.90,
  "quantidade": 10
}
