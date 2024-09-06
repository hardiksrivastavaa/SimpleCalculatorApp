# CalcApp - Simple Spring Boot Calculator

## Overview

CalcApp is a basic calculator web application built using **Spring Boot** and **Thymeleaf**. The application allows users to perform simple arithmetic operations such as addition, subtraction, multiplication, and division. It's a demonstration of how to use **Spring Boot** for building web applications with server-side rendering using Thymeleaf.

## Features

- **Basic Arithmetic Operations**: Add, subtract, multiply, and divide.
- **Responsive UI**: Frontend developed with Thymeleaf for rendering templates.
- **Spring Boot Framework**: Using the Spring ecosystem to manage the backend logic.
- **Simple User Interface**: Easy-to-use web-based interface for calculations.
  
## Project Structure

The project is organized as a standard **Maven** project. Here's an overview of the directory structure:

```plaintext
calcapp/
├── .gitignore                  # Files and directories to ignore in Git
├── HELP.md                     # Spring Boot default help document (optional)
├── mvnw, mvnw.cmd              # Maven Wrapper files for Windows/Linux
├── pom.xml                     # Maven project object model configuration file
├── README.md                   # Project's readme file (this file)
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/app/calcapp/
    │   │       ├── CalcappApplication.java        # Main application class
    │   │       ├── controller/
    │   │       │   └── MainController.java        # Handles web requests
    │   │       ├── dto/
    │   │           └── CalcDto.java               # Data Transfer Object for handling inputs
    │   ├── resources/
    │       ├── static/                            # Place for static assets like CSS/JS
    │       ├── templates/
    │           └── index.html                     # Thymeleaf template for the calculator UI
    │       └── application.properties             # Configuration file for Spring Boot
    └── test/
        └── java/
            └── com/app/calcapp/CalcappApplicationTests.java   # Unit tests for the app
