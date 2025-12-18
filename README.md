## Beer Stock API (Desafio)

API REST para gerenciamento de estoque de cervejas (cadastro, listagem, consulta e exclusão), com testes automatizados e documentação OpenAPI/Swagger.

## O que foi feito (implementações)

- Implementação completa da API REST de gerenciamento de estoque de cervejas.
- Criação de testes unitários e testes de controller com JUnit 5 + Mockito, cobrindo:
	- criação, listagem, consulta por nome e exclusão;
	- operações de incremento e decremento de estoque (incluindo cenários de erro).
- Atualização do projeto para rodar em Java 21 (LTS).
- Atualização do projeto para Spring Boot 3.2.x e migração de `javax.*` para `jakarta.*`.
- Substituição do Swagger Springfox (legado) por Springdoc OpenAPI (Swagger UI).

### Status da entrega

- Projeto compilando e executando com Java 21 (LTS)
- Suíte de testes executando via Maven Wrapper
- Documentação disponível via Swagger UI

### Tecnologias

- Java 21 (LTS)
- Spring Boot 3.2.x
- Spring Web + Validation
- Spring Data JPA + H2 (memória)
- Lombok + MapStruct
- Springdoc OpenAPI (Swagger UI)
- JUnit 5 + Mockito (testes)

### Funcionalidades implementadas

- CRUD básico de cervejas:
	- Criar cerveja
	- Listar cervejas
	- Buscar cerveja por nome
	- Remover cerveja por id
- Operação de incremento de quantidade em estoque (com validações)
- Operação de decremento de quantidade em estoque (com validações)
- Regras de validação de payload (Bean Validation)
- Documentação dos endpoints via OpenAPI
- Testes unitários e testes de controller

### Como executar (Windows)

Requisitos:

- Java 21 instalado e configurado no PATH

Executar a aplicação:

```bash
./mvnw.cmd spring-boot:run
```

Aplicação disponível em:

- http://localhost:8080

### Documentação (Swagger / OpenAPI)

- Swagger UI: http://localhost:8080/swagger-ui/index.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

### Endpoints principais

Base path: `/api/v1/beers`

- `POST /api/v1/beers` — cria uma cerveja
- `GET /api/v1/beers` — lista cervejas
- `GET /api/v1/beers/{name}` — busca por nome
- `DELETE /api/v1/beers/{id}` — remove por id
- `PATCH /api/v1/beers/{id}/increment` — incrementa quantidade
- `PATCH /api/v1/beers/{id}/decrement` — decrementa quantidade

### Como rodar os testes

```bash
./mvnw.cmd test
```

### Postman

A collection está disponível em `postman/Beer API.postman_collection.json`.

## Autor

Leandro da Silva Stampini



