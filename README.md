# 🛠️ API de Eventos com Spring Boot 🎉

## 📖 Descrição

Esta API foi desenvolvida utilizando **Java Spring Boot** e segue uma estrutura modular para atender diversas funcionalidades relacionadas a **eventos**, **cupons** e **endereços**. O projeto utiliza uma base de dados relacional para armazenar as informações, configurada por meio de scripts de migração.

---

## 📂 Estrutura do Projeto

```bash
aula-java-api/
├── .mvn/                    # Arquivos do Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/aula_java/api/
│   │   │   ├── domain/      # Pacote principal do domínio
│   │   │   │   ├── address/Address.java    # Entidade Address
│   │   │   │   ├── cupon/Cupon.java        # Entidade Cupon
│   │   │   │   ├── event/Event.java        # Entidade Event
│   │   │   ├── repositorios/              # (Futuro) Repositórios JPA
│   │   │   ├── ApiApplication.java        # Classe principal da aplicação
│   │   ├── resources/
│   │       ├── db/migration/
│   │       │   ├── v1_create-event-table.sql  # Script de criação de tabelas
│   │       ├── application.properties      # Configurações do Spring Boot
│   │
│   ├── test/
│       ├── java/aula_java/api/             # Testes unitários e de integração
├── pom.xml                 # Arquivo de configuração do Maven
├── mvnw                    # Maven Wrapper Script
├── mvnw.cmd                # Maven Wrapper para Windows
└── .gitignore              # Arquivo de exclusões do Git
```

---

## 🚀 Tecnologias Utilizadas

- **☕ Java 17**
- **🌱 Spring Boot**
  - Spring Web 🌐
  - Spring Data JPA 🗄️
  - Spring DevTools ⚙️
- **📦 Flyway** para controle de migrações no banco de dados.
- **🐘 Banco de Dados**: H2 ou outro configurável via `application.properties`.
- **🐳 Docker** (opcional, futuro suporte).
- **🐍 Maven** como gerenciador de dependências.

---

## 🛠️ Como Executar

1. **⚙️ Pré-requisitos**:
   - **JDK 17+**
   - **Maven**

2. Clone o repositório:  
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```

3. Navegue até o diretório do projeto:  
   ```bash
   cd aula-java-api
   ```

4. Baixe as dependências e compile o projeto:  
   ```bash
   mvn clean install
   ```

5. Inicie a aplicação:  
   ```bash
   mvn spring-boot:run
   ```

---

## 🌐 Endpoints (Exemplo)

- **GET /events**: 🔎 Retorna uma lista de eventos.
- **POST /events**: ➕ Cria um novo evento.
- **GET /cupons**: 🎟️ Lista os cupons disponíveis.
- **GET /addresses**: 📍 Retorna os endereços associados.

---

## 📋 Próximos Passos

- 🛠️ **Implementar os repositórios** para conectar as entidades ao banco de dados.
- 🚀 **Adicionar endpoints** para manipular entidades.
- 📖 **Criar documentação da API** com **Swagger**.
- ✅ **Melhorar os testes unitários** e de integração.

---

## 🤝 Contribuição

✨ Contribuições são bem-vindas!  
Faça um **fork**, implemente suas alterações e envie um **pull request**. 💡

---
