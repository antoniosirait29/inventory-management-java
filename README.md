# Inventory & Order Management System

A Java-based console application built to practice Object-Oriented Programming (OOP), business logic implementation, input validation, and application structure through a practical inventory management use case.

This project is part of my journey to strengthen my Java programming skills by building a real-world inspired application from scratch.

## Overview

The Inventory & Order Management System is designed to manage product data through a simple command-line interface.

The application currently focuses on product management, including product registration, data validation, duplicate SKU prevention, and product listing.

The project is being developed incrementally, with plans to introduce more advanced backend development concepts and database integration.

## Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Core programming language |
| Maven | Project and dependency management |
| IntelliJ IDEA | Development environment |
| Git & GitHub | Version control |

## Current Features

- **Add Product** — Register new products with SKU, name, category, price, and initial stock.
- **View All Products** — Display all registered products.
- **Input Validation** — Validate user input to prevent empty fields and invalid numeric values.
- **Duplicate SKU Prevention** — Prevent products with an existing SKU from being registered.
- **Exception Handling** — Handle invalid input and business rule violations.
- **Console Menu** — Navigate application features through a command-line interface.

## Technical Concepts & Learning Outcomes

This project is also a practical exercise to understand and apply fundamental Java concepts.

### 1. Object-Oriented Programming (OOP)
- Classes and Objects
- Constructors
- Encapsulation
- Getters
- Method implementation
- Object interaction

### 2. Java Collections
- `List` Interface
- `ArrayList` Implementation
- Generic Types (`List<Product>`)
- Enhanced For Loop
- Collection iteration

### 3. Control Flow & Input Handling
- Conditional Statements (`if-else`, `switch`)
- Traditional For Loop and Enhanced For Loop
- While Loop
- `break` and `continue`
- Java `Scanner` for console input
- Variable Scope

### 4. Exception Handling & Validation
- `try-catch`
- `throw`
- `IllegalArgumentException`
- `NumberFormatException`
- String validation using `isBlank()`
- Numeric conversion using `BigDecimal` and `Integer.parseInt()`

### 5. Object-Oriented Design & Code Organization
- Separation of Concerns
- Separation between Model and Service layers
- Business logic implementation
- Basic data integrity validation

## Project Structure

```text
inventory-order-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── inventory/
│   │   │           ├── Main.java
│   │   │           ├── model/
│   │   │           │   └── Product.java
│   │   │           └── service/
│   │   │               └── ProductService.java
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

### Architecture Overview

| Component | Responsibility |
|---|---|
| `Main.java` | Application entry point, console interaction, and menu navigation |
| `Product.java` | Product domain model and basic data validation |
| `ProductService.java` | Product-related business logic and collection management |

## Getting Started

### Prerequisites

- JDK 21 or later
- Maven
- IntelliJ IDEA (recommended)

### Installation

1. Clone the repository:

```bash
git clone https://github.com/antoniosirait29/inventory-management-java.git
```

2. Navigate to the project directory:

```bash
cd inventory-management-java
```

3. Build the project:

```bash
mvn clean compile
```

4. Run the application through `Main.java` in IntelliJ IDEA.

## Application Preview

The application provides a console-based menu:

```text
=====================================
     INVENTORY MANAGEMENT SYSTEM
=====================================
1. Add Product
2. View all product
0. Exit
=====================================
Input menu:
```

Users can register products by providing the required product information and view the registered product list.

## Development Roadmap

This project is actively being developed. The following features are planned:

- [x] Product model and constructor
- [x] Product service implementation
- [x] Add product functionality
- [x] View all products functionality
- [x] Duplicate SKU validation
- [x] Basic input validation
- [x] Console-based menu structure
- [ ] Improve console input handling and menu validation
- [ ] Unit testing with JUnit
- [ ] Update product functionality
- [ ] Delete product functionality
- [ ] Search product by SKU
- [ ] Stock management
- [ ] Order management
- [ ] Database integration with PostgreSQL
- [ ] JDBC integration
- [ ] Refactor application architecture
- [ ] REST API development with Spring Boot

## Learning Objectives

The main objective of this project is to develop a stronger understanding of Java through hands-on implementation rather than focusing solely on theoretical concepts.

Key learning goals include:

- Building applications using Java and OOP principles.
- Translating business requirements into application logic.
- Writing clean, readable, and maintainable code.
- Understanding data structures and collection management.
- Implementing input validation and exception handling.
- Gradually developing backend engineering skills.

## Author

**Antonio Rizki**

Information Systems Graduate | Aspiring Java Backend Developer

- GitHub: [@antoniosirait29](https://github.com/antoniosirait29)
- LinkedIn: [Antonio Rizki](https://www.linkedin.com/in/antoniosirait/)

---

*This project is continuously evolving as part of my hands-on Java backend development learning journey.*
