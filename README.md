🛡️ Insurai – AI Powered Insurance Assistance System
📌 Project Overview

Insurai is a full-stack AI-powered insurance assistance platform developed as part of the Infosys Springboard Java Tech Stack Project. The application helps users understand insurance policies, submit queries, and receive intelligent responses using Cohere AI. The system is built using Spring Boot for the backend and React (Vite) for the frontend, with Supabase used as the cloud database.

🗂️ Project Structure

This repository follows a mono-repository structure:

INFOSYS-SPRINGBOARD-INSURAI-JAVA-TECH-STACK-PROJECT
├── insurai-backend   → Spring Boot backend
├── insurai-frontend  → React (Vite) frontend
└── README.md

⚙️ Technology Stack
Backend

Java

Spring Boot – RESTful API development

Spring Security & JWT – Authentication and authorization

Frontend

React (Vite) – Fast and modular UI development

HTML, CSS, JavaScript

Axios – API communication

Database

Supabase – Cloud-hosted PostgreSQL database for storing user and application data

AI Integration

Cohere AI – Used for natural language processing and AI-based insurance query responses

Tools

GitHub – Version control

Postman – API testing

🧱 System Architecture

The Insurai system follows a three-tier architecture:

Frontend (React + Vite)
        |
        | REST APIs
        |
Backend (Spring Boot)
        |
        |------------------|
   Supabase Database   Cohere AI


The frontend interacts with the backend through REST APIs

The backend handles business logic, authentication, and integrations

Supabase manages persistent data storage

Cohere AI generates intelligent responses to insurance queries

🔧 Backend Overview

The backend is developed using Spring Boot and follows the MVC architecture.

Key Components

Controllers – Handle incoming HTTP requests

Services – Business logic and AI integration

Repositories – Database interaction using Supabase

Security – JWT-based authentication and role-based access

Example Controllers

AuthController

PolicyController

ClaimController

ChatbotController

🎨 Frontend Overview

The frontend is built using React with Vite to provide a responsive and user-friendly interface.

Features

User login and registration

Role-based dashboards (Admin, HR, Agent, Employee)

Insurance policy viewing

AI-powered chatbot for insurance queries

API integration using Axios

🔌 APIs

Some key REST APIs implemented:

POST /api/auth/login – User authentication

POST /api/chatbot/query – AI-based insurance query

GET /api/policies – Fetch insurance policies

POST /api/claims – Submit insurance claims

🧪 Testing

Backend APIs tested using Postman

Frontend tested through manual UI testing

All core functionalities were validated before integration

▶️ How to Run the Project
Backend

Navigate to insurai-backend

Configure environment variables (Supabase & Cohere keys)

Run the Spring Boot application

Frontend

Navigate to insurai-frontend

Install dependencies

npm install


Start the application

npm run dev

📄 Documentation

The project documentation includes:

Abstract

Architecture diagram

Agile sprint planning

Functional and non-functional requirements

Testing evidence

Screenshots of UI, APIs, and GitHub repository

📄 Conclusion

Insurai demonstrates a complete AI-enabled full-stack application using modern technologies. By integrating Cohere AI with a secure and scalable backend and a responsive frontend, the system provides an efficient solution for insurance assistance while following Agile development practices.

👨‍💻 Project Context

Developed as part of the Infosys Springboard – Java Tech Stack Program BY AAISHA SULTANA GUDURU -22501A4401 CSE-DATA SCIENCE-PVPSIT.
