# Savings App — Personal Finance API

REST API for personal finance management built with Spring Boot and MySQL. Track your income and expenses, set savings goals and apply proven saving methods to improve your financial habits.

## Features

- JWT authentication with Spring Security — register, login and protected endpoints
- Income and expense tracking with categories
- Savings goals with progress monitoring
- Five saving methods: Kakeibo, 50/30/20, Pay Yourself First, 70/20/10 and Zero-Based Budget
- Bilingual support ready (ES/EN) via i18n properties files
- Deployed on personal VPS

## Tech Stack

- Java 21
- Spring Boot 4.0.5
- Spring Security + JWT (jjwt 0.12.3)
- Spring Data JPA / Hibernate
- MySQL 9.6
- Maven
- Lombok

## Project Structure
```
src/main/java/com/nuxx/savings_app/
├── controller/       # HTTP request handlers
├── service/          # Business logic
├── repository/       # Database access layer
├── model/            # JPA entities
├── dto/              # Data transfer objects
├── security/         # JWT and Spring Security configuration
└── exception/        # Custom exception handling
```

## Getting Started

1. Clone the repository
2. Create a MySQL database named `savings_app`
3. Configure your credentials in `application.properties`
4. Run with `mvn spring-boot:run`
5. API available at `http://localhost:8080`

## API Endpoints

### Auth (public)
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/auth/registro | Register a new user |
| POST | /api/auth/login | Login and receive JWT token |

### Users (protected)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/usuarios/perfil | Get current user profile |
| PUT | /api/usuarios/perfil | Update current user profile |

### Expenses (protected)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/gastos | Get all expenses |
| POST | /api/gastos | Create expense |
| PUT | /api/gastos/{id} | Update expense |
| DELETE | /api/gastos/{id} | Delete expense |

### Income (protected)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/ingresos | Get all income |
| POST | /api/ingresos | Create income |
| PUT | /api/ingresos/{id} | Update income |
| DELETE | /api/ingresos/{id} | Delete income |

### Goals (protected)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/metas | Get all goals |
| POST | /api/metas | Create goal |
| PUT | /api/metas/{id} | Update goal |
| DELETE | /api/metas/{id} | Delete goal |

## Author

**Nelson Filipe Fardilha Karlsson**
[GitHub](https://github.com/NUXX-G)  · [Portfolio](https://nelsonffkarlsson.com)
