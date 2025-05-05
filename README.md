# 🧾 Employee Management System

A **Spring Boot REST API** that provides full CRUD (Create, Read, Update, Delete) functionality for managing employee records. This project demonstrates how to build a clean, layered backend architecture using Spring Boot, JPA, and either H2 or MySQL databases.
---

## ✅ Features

- Create new employee records
- View all employees
- Retrieve employee details by ID
- Update employee information
- Delete employees
- Graceful error handling with custom exceptions

---

## 🛠 Technologies Used

- Java 17+ (or Java 11+)
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 / MySQL (configurable)
- Maven
---


## 🔌 API Endpoints

| Method | Endpoint              | Description               |
|--------|-----------------------|---------------------------|
| POST   | `/api/employees`      | Create a new employee     |
| GET    | `/api/employees`      | Get all employees         |
| GET    | `/api/employees/{id}` | Get employee by ID        |
| PUT    | `/api/employees/{id}` | Update employee by ID     |
| DELETE | `/api/employees/{id}` | Delete employee by ID     |

## 🛠️ Setup Instructions

### Prerequisites

- Java 21
- Maven
- MySQL (create a database, e.g., `employee_db`)

### Configure `application.properties`

Add these in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
server.port=8080
```

### Run the Application

mvn clean install
mvn spring-boot:run

### Example JSON Payload

```{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "department": "Engineering"
}
```
