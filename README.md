🛡️ Insurai – AI Powered Insurance Assistance System
📌 Project Overview

Insurai is a full-stack AI-powered insurance assistance platform developed as part of the Infosys Springboard – Java Tech Stack Project. The application helps users understand insurance policies, submit insurance-related queries, and receive intelligent responses using Cohere AI. The system is built using Spring Boot for the backend and React (Vite) for the frontend, with Supabase used as the cloud database.

🌐 Live Application

Frontend (Deployed on Netlify):
👉 https://effortless-speculoos-08f92d.netlify.app/

Backend: Spring Boot application (deployment-ready, tested locally)

🗂️ Project Structure

This repository follows a mono-repository structure:

INFOSYS-SPRINGBOARD-INSURAI-JAVA-TECH-STACK-PROJECT
├── insurai-backend   → Spring Boot backend
├── insurai-frontend  → React (Vite) frontend
└── README.md

⚙️ Technology Stack
Backend

Java

Spring Boot – REST API development

Spring Security & JWT – Authentication and authorization

Frontend

React (Vite) – Fast and modular UI

HTML, CSS, JavaScript

Axios – API communication

Database

Supabase – Cloud-hosted PostgreSQL database

AI Integration

Cohere AI – Natural language processing and AI-generated responses

Tools

GitHub – Version control

Postman – API testing

Netlify – Frontend deployment

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


Frontend communicates with backend via REST APIs

Backend handles business logic, authentication, and AI integration

Supabase manages persistent data

Cohere AI generates intelligent responses

🔧 Backend Overview

The backend is developed using Spring Boot and follows the MVC architecture.

Key Components

Controllers – Handle HTTP requests

Services – Business logic and AI integration

Repositories – Database operations

Security – JWT-based role authentication

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

🔌 APIs

Some important REST APIs implemented:

POST /api/auth/login – User authentication

POST /api/chatbot/query – AI-based insurance query

GET /api/policies – Fetch insurance policies

POST /api/claims – Submit insurance claims

🧪 Testing

Backend APIs tested using Postman

Frontend tested through manual UI testing

All core functionalities validated successfully

▶️ How to Run the Project Locally
Backend

Navigate to insurai-backend

Configure environment variables (Supabase & Cohere keys)

Run the Spring Boot application

Frontend

Navigate to insurai-frontend

Install dependencies

npm install


Start application

npm run dev

📄 Documentation

The project documentation includes:

Abstract and problem statement

Agile sprint planning

Architecture diagram

Functional and non-functional requirements

Testing evidence

Screenshots of UI, APIs, and GitHub repository

 Conclusion

Insurai demonstrates a complete AI-enabled full-stack application using modern technologies. The project follows Agile practices and successfully integrates AI to provide an efficient insurance assistance solution.

👨‍💻 Project Context

Developed as part of Infosys Springboard – Java Tech Stack Program By AAISHA SULTANA GUDURU-22501A4401 CSE-DATA SCIENCE PVPSIT
