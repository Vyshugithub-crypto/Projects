# Student Management API

A RESTful backend API built using **Spring Boot** for managing student records, including registration, updates, and performance tracking. Designed for scalability, security, and integration with frontend dashboards or admin portals.

## 🚀 Features

- Create, read, update, and delete student records
- Filter students by department, year, or performance
- Secure endpoints with JWT-based authentication
- Input validation and error handling
- API documentation via Swagger UI

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **MySQL** (or PostgreSQL)
- **Hibernate / JPA**
- **Swagger** for API docs

## 📦 Endpoints Overview

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/students` | Add a new student |
| `GET` | `/api/students` | Get all students |
| `GET` | `/api/students/{id}` | Get student by ID |
| `PUT` | `/api/students/{id}` | Update student details |
| `DELETE` | `/api/students/{id}` | Delete student |
| `GET` | `/api/students/search?dept=IT&year=3` | Filter students |

## 🔐 Authentication

- JWT-based login system
- Role-based access control (Admin, Faculty)

## 🧪 Testing

- Unit tests with JUnit and Mockito
- Integration tests for API endpoints

## 📚 Setup Instructions

1. Clone the repo  
   `git clone https://github.com/yourusername/student-management-api`

2. Configure `application.properties` with your DB credentials

3. Run the application  
   `mvn spring-boot:run`

4. Access Swagger UI at  
   `http://localhost:8080/swagger-ui/`

## 📁 Folder Structure



## 👩‍💻 Author

**Vaishnavi Kongalla**  
[LinkedIn](https://www.linkedin.com/in/vaishnavi-kongalla-9235192ab)  
[GitHub](https://github.com/Vyshugithub-crypto)

---

Let me know if you want to add deployment instructions (e.g., AWS EC2, Docker), or convert this into a portfolio project for your resume or LinkedIn. You're building a solid backend profile!
