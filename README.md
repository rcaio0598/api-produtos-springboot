# 🛒 API de Gerenciamento de Produtos

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![JPA](https://img.shields.io/badge/JPA-Hibernate-blue)](https://hibernate.org/)
[![H2](https://img.shields.io/badge/Database-H2-lightgrey)](https://www.h2database.com/)

> API REST para cadastro e gerenciamento de produtos, desenvolvida com **Spring Boot** e seguindo **princípios SOLID** de arquitetura de software.

---

## 📋 Sobre o Projeto

Este projeto implementa uma **API REST completa** para gerenciamento de produtos, com foco em:

- ✅ Arquitetura em camadas bem definidas
- ✅ Aplicação dos princípios **SOLID**
- ✅ Persistência de dados com **JPA/Hibernate**
- ✅ Boas práticas de desenvolvimento
- ✅ Código limpo e manutenível

O objetivo foi criar uma aplicação que simula cenários reais de desenvolvimento backend, priorizando qualidade de código e organização.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Finalidade |
|------------|--------|------------|
| Java | 17 | Linguagem de programação |
| Spring Boot | 3.x | Framework principal |
| Spring Data JPA | 3.x | Camada de persistência |
| Hibernate | 6.x | ORM (Object-Relational Mapping) |
| H2 Database | 2.x | Banco de dados em memória |
| Maven | 3.x | Gerenciamento de dependências |

---

## 🏗️ Arquitetura do Projeto

A aplicação segue uma **arquitetura em camadas**, respeitando os princípios **SOLID**:
```
📦 src/main/java/com/caio/apiprodutos
 ┣ 📂 controller      → Endpoints REST (recebe requisições HTTP)
 ┣ 📂 service         → Regras de negócio
 ┣ 📂 repository      → Acesso a dados (Spring Data JPA)
 ┣ 📂 model           → Entidades JPA
 ┗ 📂 validation      → Validações customizadas
```

### 🎯 Princípios Aplicados

- **S** - Single Responsibility: Cada classe tem uma única responsabilidade
- **O** - Open/Closed: Aberto para extensão, fechado para modificação
- **L** - Liskov Substitution: Interfaces bem definidas
- **I** - Interface Segregation: Validações desacopladas
- **D** - Dependency Inversion: Dependência de abstrações (Repository interface)

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

- **Java 17** ou superior instalado
- **Maven 3.x** instalado
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passo a Passo

1. **Clone o repositório:**
```bash
git clone https://github.com/rcaio0598/api-produtos-springboot.git
cd api-produtos-springboot
```

2. **Compile o projeto:**
```bash
mvn clean install
```

3. **Execute a aplicação:**
```bash
mvn spring-boot:run
```

4. **Acesse a API:**
```
http://localhost:8080
```

5. **Console H2 Database (opcional):**
```
http://localhost:8080/h2-console
```
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: *(deixar em branco)*

---

## 📡 Endpoints da API

### ➕ Criar Produto
```http
POST /produtos
Content-Type: application/json

{
  "nome": "Notebook Dell",
  "preco": 3500.00
}
```

**Resposta (201 Created):**
```json
{
  "id": 1,
  "nome": "Notebook Dell",
  "preco": 3500.00
}
```

---

### 📋 Listar Todos os Produtos
```http
GET /produtos
```

**Resposta (200 OK):**
```json
[
  {
    "id": 1,
    "nome": "Notebook Dell",
    "preco": 3500.00
  },
  {
    "id": 2,
    "nome": "Mouse Logitech",
    "preco": 120.00
  }
]
```

---

### 🔍 Buscar Produto por ID
```http
GET /produtos/{id}
```

**Resposta (200 OK):**
```json
{
  "id": 1,
  "nome": "Notebook Dell",
  "preco": 3500.00
}
```

---

### ✏️ Atualizar Produto
```http
PUT /produtos/{id}
Content-Type: application/json

{
  "nome": "Notebook Dell XPS",
  "preco": 4200.00
}
```

**Resposta (200 OK):**
```json
{
  "id": 1,
  "nome": "Notebook Dell XPS",
  "preco": 4200.00
}
```

---

### ❌ Deletar Produto
```http
DELETE /produtos/{id}
```

**Resposta (204 No Content)**

---

## 🧪 Testando a API

### Com Postman/Insomnia:

1. Importe a collection de requisições
2. Altere a base URL para `http://localhost:8080`
3. Execute as requisições na ordem: POST → GET → PUT → DELETE

### Com cURL:
```bash
# Criar produto
curl -X POST http://localhost:8080/produtos \
  -H "Content-Type: application/json" \
  -d '{"nome":"Teclado Mecânico","preco":450.00}'

# Listar produtos
curl http://localhost:8080/produtos

# Buscar por ID
curl http://localhost:8080/produtos/1

# Atualizar produto
curl -X PUT http://localhost:8080/produtos/1 \
  -H "Content-Type: application/json" \
  -d '{"nome":"Teclado Mecânico RGB","preco":520.00}'

# Deletar produto
curl -X DELETE http://localhost:8080/produtos/1
```

---

## 📦 Estrutura da Entidade Produto
```java
@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private Double preco;
    
    // Getters, Setters, Construtores
}
```

---

## 🎓 O Que Aprendi Neste Projeto

Durante o desenvolvimento desta API, consolidei conhecimentos em:

### Backend & Spring
- ✅ Configuração e estruturação de projetos Spring Boot
- ✅ Criação de APIs REST seguindo convenções HTTP
- ✅ Uso do Spring Data JPA para abstração de banco de dados
- ✅ Mapeamento objeto-relacional com Hibernate

### Arquitetura
- ✅ Separação de responsabilidades em camadas
- ✅ Aplicação prática dos princípios SOLID
- ✅ Organização de código para facilitar manutenção

### Boas Práticas
- ✅ Versionamento de código com Git
- ✅ Configuração adequada do `.gitignore`
- ✅ Documentação clara de APIs
- ✅ Nomenclatura descritiva de classes e métodos

### Ferramentas
- ✅ Maven para gerenciamento de dependências
- ✅ Banco de dados H2 para prototipagem rápida
- ✅ Postman para testes de API

---

## 🔄 Próximos Passos

Melhorias planejadas para versões futuras:

- [ ] Implementar validações de entrada
- [ ] Adicionar tratamento de exceções personalizado
- [ ] Criar testes unitários com JUnit e Mockito
- [ ] Implementar paginação nos endpoints de listagem
- [ ] Adicionar autenticação e autorização com Spring Security
- [ ] Integrar com banco de dados PostgreSQL
- [ ] Criar documentação Swagger/OpenAPI
- [ ] Implementar logs estruturados

---

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais durante bootcamp de Java - Deloitte.

---

## 👤 Autor

**Caio Ruan Oliveira Nascimento**

- GitHub: [@rcaio0598](https://github.com/rcaio0598)
- LinkedIn: [Conectar no LinkedIn](https://www.linkedin.com/in/caionascimentoo/)

---

## 🤝 Contribuições

Sugestões e melhorias são sempre bem-vindas! Sinta-se à vontade para abrir uma **issue** ou enviar um **pull request**.

---

**Desenvolvido com ☕ e muito aprendizado durante o Bootcamp Java - Deloitte**
```
