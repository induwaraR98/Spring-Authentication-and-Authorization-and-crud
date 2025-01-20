# Spring Boot User Management Project

This project is a simple Spring Boot application that includes user authentication and basic CRUD functionality. Users can register, log in, and perform CRUD operations.

## Features

- **User Registration**: Users can create an account with a unique username and password.
- **Authentication**: Login functionality using Spring Security.
- **CRUD Operations**: Basic create, read, update, and delete operations for users.
- **Database Integration**: Supports a relational database for storing user data.
- **Secure Password Storage**: User passwords are encrypted using industry-standard hashing algorithms.

## Technologies Used

- **Backend**: Spring Boot, Spring Security
- **Database**: PostgreSQL
- **Build Tool**: Maven
- **Language**: Java

## Setup and Installation

### Clone the Repository

Clone the repository using the following command:

```bash
git clone https://github.com/induwaraR98/Spring-Authentication-and-Authorization-and-crud.git
cd your-repository
```
##Configure the Database

Open application.properties or application.yml in your project.
Update the database configurations for PostgreSQL. Example configuration:
properties
Copy
Edit
spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
Replace your-database, your-username, and your-password with your actual PostgreSQL database credentials.

Build and Run the Application
To build and run the application, use Maven:

bash
Copy
Edit
mvn spring-boot:run
This will start the application, and you can access it at http://localhost:8080.

##Access the Application
Once the application is running, open a browser and navigate to http://localhost:8080 to interact with it.

##Future Enhancements
Implement role-based access control (RBAC).
Add support for JWT-based authentication.
Include pagination for user lists.
Add unit and integration tests.
