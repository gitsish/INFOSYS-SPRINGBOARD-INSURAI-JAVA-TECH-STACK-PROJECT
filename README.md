
🛡️ Insurai – AI Powered Insurance Assistance System
📌 Project Overview

Insurai is a full-stack AI-powered insurance assistance platform developed as part of the Infosys Springboard – Java Tech Stack Project.
The system digitizes and automates insurance operations such as policy management, claims processing, fraud detection, and employee support using modern web technologies and AI integration.

The application supports multiple user roles (Admin, HR, Agent, Employee) with secure authentication and role-based access.

🌐 Live Application

🔗 Frontend (Deployed on Netlify):
👉 https://effortless-speculoos-08f92d.netlify.app/

Backend is a Spring Boot application tested locally and via Postman.

🧱 System Architecture
Frontend (React + Vite)
        |
        | REST APIs (JSON)
        |
Backend (Spring Boot)
        |
        | JPA / Hibernate
        |
Database (Supabase – PostgreSQL)
        |
AI Integration (Cohere API)

🛠️ Technology Stack
🔹 Frontend

React (Vite)

JavaScript, HTML5, CSS3

Axios (API calls)

React Router (Routing)

Role-based dashboards

🔹 Backend

Java 21

Spring Boot

Spring Security + JWT

Spring Data JPA

Hibernate ORM

RESTful APIs

🔹 Database

Supabase (PostgreSQL – cloud hosted)

🔹 AI & Cloud

Cohere AI (chatbot & intelligent responses)

Supabase Storage (file handling)

🔹 Tools

Git & GitHub

Postman (API testing)

Netlify (Frontend deployment)

Eclipse IDE

👥 User Roles & Functionalities
👤 Admin

Secure login (JWT based)

Manage users (HR, Agents, Employees)

View all claims

Fraud detection dashboard

Audit logs & reports

Policy management

👨‍💼 HR

Employee onboarding

Policy assignment

Fraud monitoring

Reports & analytics

🧑‍💻 Agent

Claim handling

Query resolution

Availability management

Reports dashboard

👩‍💻 Employee

Registration & login

View assigned policies

Submit claims

Ask insurance-related questions (AI Chatbot)

Track claim status

Notifications & support

🔐 Authentication & Security

JWT-based authentication

Role-based authorization

Password encryption using BCrypt

Custom authentication filters for each role

CORS configuration enabled

📁 Project Structure
INFOSYS-SPRINGBOARD-INSURAI-JAVA-TECH-STACK-PROJECT
│
├── insurai-backend
│   ├── controller
│   ├── service
│   ├── repository
│   ├── model
│   ├── config
│   └── pom.xml
│
├── insurai-frontend
│   ├── src
│   ├── pages
│   ├── dashboard
│   ├── api.js
│   └── vite.config.js
│
└── README.md

🔗 API Usage (Postman Tested)
🔑 Admin Login API
POST http://localhost:8080/admin/login


Request Body (JSON):

{
  "email": "admin@insurai.com",
  "password": "Admin@123"
}


Response:

{
  "message": "Login successful",
  "name": "Admin",
  "role": "ADMIN",
  "token": "<JWT_TOKEN>"
}


✔️ API tested successfully using Postman
✔️ JWT token used for secured endpoints

🚀 Frontend Deployment (Netlify)

Connected GitHub repository to Netlify

Configured monorepo build settings

Build command: npm run build

Publish directory: insurai-frontend/dist

Auto-deployment enabled on GitHub push

🧪 Testing

Backend APIs tested using Postman

Frontend tested on live Netlify URL

Role-based routing verified

JWT authorization validated

📸 Screenshots & Proofs

Login & Registration pages

Employee Dashboard

Admin & Agent dashboards

Postman API success responses

Netlify deployment logs

(Screenshots attached separately in documentation)

✅ Project Status

✔️ Backend – Completed
✔️ Frontend – Completed
✔️ Deployment – Completed
✔️ API Testing – Completed
✔️ Documentation – In Progress

🏁 Conclusion

Insurai demonstrates a real-world enterprise-level insurance solution using Java full-stack development with AI integration.
The project follows clean architecture, secure coding practices, and modern deployment workflows.

👨‍💻 Project Context

Developed as part of Infosys Springboard – Java Tech Stack Program By AAISHA SULTANA GUDURU-22501A4401 CSE-DATA SCIENCE PVPSIT
