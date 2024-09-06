# 📊 CalcApp - Simple Spring Boot Calculator

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.8.1-blue.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Deploy on Railway](https://img.shields.io/badge/Deployed%20on-Railway-purple.svg)](https://railway.app)

---

## 🎯 Overview

**CalcApp** is a simple web-based calculator application built using **Spring Boot** and **Thymeleaf**. It supports the four basic arithmetic operations: addition, subtraction, multiplication, and division. The app is designed to showcase the use of Spring Boot's powerful framework for web development.

---

## ✨ Features

- 🧮 **Basic Arithmetic Operations**: Addition, subtraction, multiplication, and division.
- 🖼️ **Responsive UI**: Built with Thymeleaf for server-side rendering.
- ⚙️ **Spring Boot Backend**: A lightweight yet robust backend powered by Spring Boot.
- 🚀 **Deployable on Railway**: Easily deploy the app to Railway or other cloud services.

---

## 🛠️ Project Structure

The project is structured as follows:

```plaintext
calcapp/
├── .gitignore                  # Files to ignore in Git
├── mvnw, mvnw.cmd              # Maven Wrapper for Windows/Linux
├── pom.xml                     # Maven Project Configuration
├── README.md                   # This ReadMe file
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/app/calcapp/
    │   │       ├── CalcappApplication.java        # Main Application Class
    │   │       ├── controller/
    │   │       │   └── MainController.java        # Handles Web Requests
    │   │       ├── dto/
    │   │           └── CalcDto.java               # DTO for Inputs
    │   ├── resources/
    │       ├── static/                            # Static Assets (CSS/JS)
    │       ├── templates/
    │           └── index.html                     # Thymeleaf Template for Calculator
    │       └── application.properties             # Spring Boot Config
    └── test/
        └── java/
            └── com/app/calcapp/CalcappApplicationTests.java   # Unit Tests
