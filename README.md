# Spring Boot Users CRUD (REST API)

CRUD simple de usuarios construido con **Spring Boot** como API REST, aplicando buenas prácticas: **Controller → Service → Repository**, uso de **DTO + Mapper** y manejo de errores con **Exceptions**.

---

## 🚀 Funcionalidades

- ✅ Listar usuarios
- ✅ Crear usuario
- ✅ Actualizar usuario
- ✅ Eliminar usuario
- ✅ DTO para exponer/recibir datos
- ✅ Mapper para convertir Entity ↔ DTO
- ✅ Excepción personalizada (ej. `NotFoundException`)

---

## 🧰 Tecnologías

- Java (17+ recomendado)
- Spring Boot
- Spring Web (REST)
- Spring Data JPA
- Maven + Maven Wrapper (`mvnw`)

---

## 📁 Estructura del proyecto

~~~text
src/main/java/.../
  controller/   → endpoints REST
  service/      → lógica de negocio
  repository/   → acceso a datos (JPA)
  dto/          → objetos de transferencia
  mapper/       → conversiones DTO ↔ Entity
  model/        → entidades
  exception/    → excepciones personalizadas
~~~

---

## ✅ Requisitos

- Java instalado (17+ recomendado)
- (Opcional) Maven instalado  
  > También puedes ejecutar con el Maven Wrapper incluido (`mvnw`).

Verifica tu Java:

~~~bash
java -version
~~~

---

## ▶️ Cómo ejecutar el proyecto

### Opción A: Maven Wrapper (recomendado)

~~~bash
./mvnw spring-boot:run
~~~

En Windows también puedes usar:

~~~bash
mvnw.cmd spring-boot:run
~~~

### Opción B: Maven instalado

~~~bash
mvn clean install
mvn spring-boot:run
~~~

Por defecto la API corre en:

- `http://localhost:8080`

> Si tu puerto es diferente, revisa `src/main/resources/application.properties`.

---

## ⚙️ Configuración

Archivo:
- `src/main/resources/application.properties`

Ahí puedes ajustar:
- puerto (`server.port`)
- configuración de base de datos (si aplica)
- logs, etc.

---

## 📌 Endpoints

**Base URL:** `http://localhost:8080`  
**Base path:** `/api/user`

| Método | Endpoint            | Descripción |
|------:|----------------------|------------|
| GET   | `/api/user`          | Listar usuarios |
| POST  | `/api/user`          | Crear usuario |
| PUT   | `/api/user/{id}`     | Actualizar usuario |
| DELETE| `/api/user/{id}`     | Eliminar usuario |

---

## 🧪 Ejemplos de uso (cURL)

### 1) Listar usuarios
~~~bash
curl -X GET http://localhost:8080/api/user
~~~

### 2) Crear usuario
~~~bash
curl -X POST http://localhost:8080/api/user \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Raul",
    "email": "raul@gmail.com"
  }'
~~~

### 3) Actualizar usuario
~~~bash
curl -X PUT http://localhost:8080/api/user/1 \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Raul Actualizado",
    "email": "raul.updated@gmail.com"
  }'
~~~

### 4) Eliminar usuario
~~~bash
curl -X DELETE http://localhost:8080/api/user/1
~~~

---

## 🧩 Postman (colección incluida)

Se incluye una colección de Postman lista para probar los endpoints:

- `postman/TestUsers.postman_collection.json`

### Cómo importarla
1. Abre Postman
2. Click en **Import**
3. Selecciona el archivo `postman/TestUsers.postman_collection.json`
4. Ejecuta las requests

### Orden recomendado de pruebas
1) **POST** (crear)  
2) **GET** (listar)  
3) **PUT** (actualizar)  
4) **DELETE** (eliminar)

> Si tu API corre en otro puerto, edita las URLs en Postman.

---

## 🧯 Manejo de errores

Incluye excepción personalizada (por ejemplo `NotFoundException`) para casos como:
- actualizar/eliminar un usuario inexistente.

---

## 👤 Autor

**Raul Diaz**  
GitHub: https://github.com/Raul-dd

---
