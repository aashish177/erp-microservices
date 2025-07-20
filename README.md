# ERP Microservices System

This project is a modular, microservices-based backend for a simplified ERP platform, built with Spring Boot and Java 17.

## Services
 `reviewms`       Manages user reviews and ratings       
 `jobms`         Handles job postings and applications  
 `companyms`     Manages company data and profiles      
 `gateway`       API gateway for routing requests       
 `Config-server` Centralized configuration management   
 `service-ref`   Eureka service registry and discovery  

## Tech Stack

- Java 17
- Spring Boot
- Spring Cloud (Eureka, Config, Gateway)
- REST APIs
- Maven

## How to Run

Each microservice can be run individually:

```bash
cd reviewms
./mvnw spring-boot:run
