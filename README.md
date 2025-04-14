# 🚌 Projeto Localização em Tempo Real do BRT

Este projeto é um sistema ainda em desenvolvimento composto por um frontend em **React** e um backend em **Spring Boot** que permite buscar uma linha de ônibus BRT e visualizar sua posição geográfica em tempo real. 

---

## 📦 Estrutura do Projeto

```
/backend (Spring Boot)
  └── src/main/java/com/example
      ├── config       # Configurações (CORS, HTTP)
      ├── controller   # Endpoints REST
      ├── model        # Classes de modelo
      ├── service      # Lógica de negócio
      └── demo         # Classe principal (DemoApplication)

 /frontend (React)
  └── src/
      └── services
             ├── api.js # Configuração base do axios  
      ├── App.js       # Componente principal
      ├── List.js      # Componente que consome a API
      └── ...
```

---

## 🚀 Como rodar o projeto

### Backend - Spring Boot

1. Certifique que você tenha o [Maven](https://maven.apache.org/install.html) instalado.
2. Dentro do diretório do projeto rode o seguinte comando:
```bash
cd backend
```
3. E depois rode:
```bash
mvn spring-boot:run
```
> 🔧 O backend roda por padrão na porta `8080`.

---

### Frontend - React

1. Acesse a pasta do React:

```bash
cd frontend
```

2. Instale as dependências:

```bash
npm install
```

3. Rode o servidor de desenvolvimento:

```bash
npm start
```

> 💻 O frontend roda por padrão na porta `3000`.

---

## 🔁 Funcionalidade

- Você pode digitar o número de uma linha de ônibus (ex: 22) na barra de busca.
- Ao clicar no botão de buscar, será feita uma requisição para o backend.
- Os dados da linha (linha, trajeto, latitude, longitude) serão exibidos em uma lista.
- A localização dos ônibus é atualizada automaticamente a cada 10 segundos.

---

## 🌐 CORS

Certifique-se de que o CORS está corretamente configurado no backend para aceitar requisições vindas de `http://localhost:3000`.

Exemplo de configuração:

```java
registry.addMapping("/**")
        .allowedOrigins("http://localhost:3000")
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
```

---

## 📌 Observações

- O projeto usa a API pública da prefeitura do Rio de Janeiro: https://dados.mobilidade.rio
- A atualização automática pode ser ajustada no `setInterval` do React.

---


