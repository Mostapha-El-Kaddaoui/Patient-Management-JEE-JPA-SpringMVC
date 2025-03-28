# Hospital Management System

## Description
This is a simple Spring Boot application for managing patients in a hospital. It provides functionalities for listing, searching, and deleting patients with pagination support.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MYSQL and H2 Database (or any JPA-compatible database)
- HTML & BOOTSTRAP

## Project Structure
- **Entities**: Defines the `Patient` entity
- **Repository**: Provides database access for patients
- **Web Controller**: Handles patient-related requests
- **Main Application**: Initializes and runs the Spring Boot application

## Features
- List all patients with pagination
- Search for patients by name
- Delete a patient

## Endpoints
- `GET /index`: Displays a paginated list of patients
- `GET /delete`: Deletes a patient by ID and redirects to the patient list

## Setup and Installation

### Clone the Repository
```bash
git clone https://github.com/yourusername/hospital-management-system.git
cd hospital-management-system
```
![image](https://github.com/user-attachments/assets/d6853f6a-ac84-4fab-b0c9-0e636fbf513b)

