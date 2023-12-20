# Student Hub Application

The Student Hub Application is a Spring Boot web application that allows users to manage courses and calendar events associated with those courses.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Database Configuration](#database-configuration)
    - [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MySQL Database](https://dev.mysql.com/downloads/)
- [Maven](https://maven.apache.org/download.cgi)

## Getting Started

### Database Configuration

1. Create a MySQL database for the application.
2. Update the database connection details in the `application.yml` file.

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/YourDatabaseName?useSSL=false&serverTimezone=UTC
    username: YourDatabaseUsername
    password: YourDatabasePassword
    driver-class-name: com.mysql.cj.jdbc.Driver
