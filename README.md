# API de Lista de Tarefas (To-Do List)

## 📖 Descrição

Este projeto é uma API RESTful simples desenvolvida em Java com Spring Boot para gerenciar uma lista de tarefas (To-Do List). Ela oferece um conjunto completo de operações CRUD (Criar, Ler, Atualizar, Excluir) para tarefas, permitindo aos usuários gerenciar suas atividades de forma eficiente.

O foco principal desta API é demonstrar a criação de um serviço backend funcional e bem estruturado, utilizando as melhores práticas do Spring Boot para desenvolvimento rápido e robusto.

## ✨ Funcionalidades Principais

*   **Criação de Tarefas**: Adicione novas tarefas à lista com uma descrição.
*   **Listagem de Tarefas**: Recupere todas as tarefas existentes ou uma tarefa específica por seu ID.
*   **Atualização de Tarefas**: Modifique a descrição ou o status de conclusão de uma tarefa existente.
*   **Exclusão de Tarefas**: Remova tarefas individuais ou limpe todas as tarefas da lista.
*   **API RESTful**: Interface clara e padronizada para interação com o serviço.

## 🛠️ Tecnologias e Ferramentas

*   **Linguagem**: Java 17 (ou superior)
*   **Framework**: Spring Boot
*   **Construção**: Maven (ou Gradle)
*   **Testes**: JUnit 5, Spring Boot Test

## 🚀 Como Rodar a Aplicação

Para executar esta API em seu ambiente local, siga os passos abaixo:

1.  **Pré-requisitos**:
    *   Java Development Kit (JDK) 17 ou superior instalado.
    *   Maven (ou Gradle) instalado.

2.  **Clone o Repositório**:
    ```bash
    git clone <URL_DO_SEU_REPOSITORIO>
    cd <nome-do-seu-repositorio>
    ```

3.  **Compile e Execute**:

    **Usando Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```

    **Usando Gradle:**
    ```bash
    ./gradlew bootRun
    ```

    A aplicação será iniciada e estará acessível em `http://localhost:8080`.

## 💡 Endpoints da API

Todos os endpoints estão prefixados com `/tasks`.

### `GET /tasks`

*   **Descrição**: Retorna uma lista de todas as tarefas cadastradas.
*   **Resposta de Sucesso (200 OK)**:
    ```json
    [
      {
        "id": "string",
        "description": "string",
        "completed": false,
        "createdAt": "2025-07-30T10:00:00"
      }
    ]
    ```

### `GET /tasks/{id}`

*   **Descrição**: Retorna uma tarefa específica pelo seu ID.
*   **Parâmetros de Path**:
    *   `id` (string): O ID único da tarefa.
*   **Resposta de Sucesso (200 OK)**:
    ```json
    {
      "id": "string",
      "description": "string",
      "completed": false,
      "createdAt": "2025-07-30T10:00:00"
    }
    ```
*   **Resposta de Erro (404 Not Found)**: Se a tarefa não for encontrada.

### `POST /tasks`

*   **Descrição**: Cria uma nova tarefa.
*   **Corpo da Requisição (Content-Type: text/plain)**:
    ```
    "Descrição da nova tarefa"
    ```
*   **Resposta de Sucesso (201 Created)**:
    ```json
    {
      "id": "string",
      "description": "Descrição da nova tarefa",
      "completed": false,
      "createdAt": "2025-07-30T10:00:00"
    }
    ```
*   **Resposta de Erro (400 Bad Request)**: Se a descrição estiver vazia ou nula.

### `PUT /tasks/{id}`

*   **Descrição**: Atualiza uma tarefa existente pelo seu ID.
*   **Parâmetros de Path**:
    *   `id` (string): O ID único da tarefa a ser atualizada.
*   **Corpo da Requisição (Content-Type: application/json)**:
    ```json
    {
      "description": "Nova descrição da tarefa",
      "completed": true
    }
    ```
*   **Resposta de Sucesso (200 OK)**:
    ```json
    {
      "id": "string",
      "description": "Nova descrição da tarefa",
      "completed": true,
      "createdAt": "2025-07-30T10:00:00"
    }
    ```
*   **Resposta de Erro (404 Not Found)**: Se a tarefa não for encontrada.

### `DELETE /tasks/{id}`

*   **Descrição**: Exclui uma tarefa específica pelo seu ID.
*   **Parâmetros de Path**:
    *   `id` (string): O ID único da tarefa a ser excluída.
*   **Resposta de Sucesso (204 No Content)**: Se a tarefa for excluída com sucesso.
*   **Resposta de Erro (404 Not Found)**: Se a tarefa não for encontrada.

### `DELETE /tasks`

*   **Descrição**: Exclui todas as tarefas da lista.
*   **Resposta de Sucesso (204 No Content)**:

## 📂 Estrutura do Projeto

```
. (raiz do projeto)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── todolist/
│   │   │       └── api/
│   │   │           ├── ApiApplication.java       # Ponto de entrada da aplicação
│   │   │           ├── controller/
│   │   │           │   └── ApiController.java    # Controlador REST para tarefas
│   │   │           ├── model/
│   │   │           │   └── Task.java             # Modelo de dados da tarefa
│   │   │           └── repository/
│   │   │               └── TaskRepository.java   # Repositório para operações de dados
│   │   └── resources/
│   │       └── application.properties            # Configurações da aplicação
│   └── test/
│       └── java/
│           └── todolist/
│               └── api/
│                   └── ApiApplicationTests.java  # Testes de integração
├── pom.xml                                       # Configurações do projeto Maven
└── README.md                                     # Este arquivo
```
