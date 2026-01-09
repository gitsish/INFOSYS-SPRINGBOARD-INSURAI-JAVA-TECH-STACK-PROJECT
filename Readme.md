# 🏢 InsurAI – Corporate Policy Automation and Intelligence System

> **Infosys Springboard – Java Tech Stack Virtual Internship Project**

InsurAI is a full-stack corporate insurance management and automation system designed to streamline policy administration, employee claims, agent interactions, fraud detection, and intelligent assistance. The application is built using **React (Frontend)** and **Spring Boot (Backend)** with secure authentication, role-based access, and AI-powered features.

---

## 📌 Project Overview

InsurAI automates end-to-end corporate insurance workflows including:
- User onboarding and role management  
- Policy lifecycle management  
- Claims submission, approval, and tracking  
- Agent query handling  
- Fraud detection and audit logging  
- AI chatbot assistance for employees  

The project is implemented and documented **milestone-wise** following enterprise application development standards.

---

## 🧱 System Architecture
SYSTEM ARCHITECTURE

┌────────────────────────────┐
│   Frontend (React + Vite)   │
│   - Role-based Dashboards   │
│   - Axios API Calls         │
└─────────────┬──────────────┘
              │
              │  REST APIs (JSON over HTTP)
              ▼
┌────────────────────────────┐
│   Backend (Spring Boot)    │
│   - Controllers            │
│   - Services               │
│   - JWT Security           │
│   - Business Logic         │
└─────────────┬──────────────┘
              │
              │  JPA / Hibernate
              ▼
┌────────────────────────────┐
│   Database                 │
│   - MySQL (Local)          │
│   - Supabase PostgreSQL    │
└─────────────┬──────────────┘
              │
              ▼
┌────────────────────────────┐
│   AI & Cloud Services      │
│   - AI Chatbot             │
│   - Fraud Intelligence     │
│   - Supabase Storage       │
└────────────────────────────┘

---

## 🛠️ Technology Stack

### Frontend
- React (Vite)  
- JavaScript, HTML5, CSS3  
- Axios  
- React Router  
- Role-based dashboards  

### Backend
- Java 21  
- Spring Boot  
- Spring Security + JWT  
- Spring Data JPA  
- Hibernate ORM  
- RESTful APIs  

### Database
- MySQL (Local)  
- Supabase PostgreSQL (Cloud)  

### AI & Cloud
- AI Chatbot Integration  
- Supabase Cloud Storage (Document Handling)  

### Tools
- Git & GitHub  
- Postman (API Testing)  
- Eclipse IDE  

---

## 📂 Repository Structure

PROJECT ARCHITECTURE

┌───────────────────────────────────────┐
│           Presentation Layer          │
│        (React + Vite Frontend)         │
│  - Login & Registration Pages          │
│  - Role-based Dashboards               │
│  - Policy, Claim & Query UI            │
│  - Chatbot Interface                   │
└───────────────┬───────────────────────┘
                │
                │ REST APIs (JSON)
                ▼
┌───────────────────────────────────────┐
│           Application Layer            │
│          (Spring Boot Backend)         │
│  - Controllers (REST APIs)             │
│  - Service Layer (Business Logic)      │
│  - JWT Authentication & Authorization │
│  - Validation & Exception Handling    │
└───────────────┬───────────────────────┘
                │
                │ JPA / Hibernate
                ▼
┌───────────────────────────────────────┐
│              Data Layer                │
│        (MySQL / Supabase PostgreSQL)   │
│  - User Data                           │
│  - Policies                            │
│  - Claims                              │
│  - Queries & Audit Logs                │
└───────────────┬───────────────────────┘
                │
                ▼
┌───────────────────────────────────────┐
│        AI & Cloud Integration Layer    │
│  - AI Chatbot                          │
│  - Fraud Detection Logic               │
│  - Supabase Cloud Storage              │
│  - Notifications & Logs                │
└───────────────────────────────────────┘

---

## 👥 User Roles

- Admin  
- HR  
- Agent  
- Employee  

Each role has dedicated dashboards with permissions enforced using JWT-based security.

---

## 📁 Milestone 1 – Authentication & Registration

- Admin login with fixed credentials  
- Admin registers HR and Agent accounts  
- HR login with email and password  
- Agent login with email and password  
- Employee self-registration and login  

**Documentation**
- Valid_Scenarios.md  
- Validation_Scenarios.md  
- TestCases_M1.pdf  

---

## 📁 Milestone 2 – Policy Management & Dashboards

- Admin creates, edits, deletes, and manages policies  
- HR and Employees can view active policies  
- Employees can download policies in PDF format  
- Admin user management (roles and statuses)  
- HR employee management with search  
- Agent availability toggle (Available / Unavailable)  
- Employee query submission to agents  

**Documentation**
- Valid_Scenarios.md  
- Validation_Scenarios.md  
- TestCases_M2.pdf  

---

## 📁 Milestone 3 – Claim Management & Enhancements

### Employee
- Submit new claims with auto-listed policies  
- Upload supporting documents  
- Edit submitted claims  
- View claim status and total amounts  
- Agent messaging support  
- FAQ section  
- Enhanced UI and dashboards  

### HR
- View and manage all employee claims  
- Approve or reject claims with remarks  
- Filter claims by status  
- Download reports (CSV, PDF)  
- Analytics dashboards and trend charts  

### Admin
- Advanced policy creation with document upload  
- Supabase Cloud Storage integration  
- View all claims  
- Advanced analytics and report exports  

### Agent
- View and respond to employee queries  
- Update and edit query responses  

### Automation Enhancements
- Policy auto-fetch during claim submission  
- Claims auto-linked to HR  
- Status updates reflected across all roles  
- Real-time interface synchronization  

**Documentation**
- Valid_Scenarios.md  
- Validation_Scenarios.md  
- TestCases_M3.pdf  

---

## 📁 Milestone 4 – Fraud Detection, Notifications, Audit Logging & Chatbot

### Employee
- AI chatbot for FAQs and claim guidance  
- Real-time notifications  
- Improved dashboard UI  

### HR
- Fraud alert monitoring  
- Claim and approval notifications  
- Audit log access  
- Enhanced analytics dashboards  

### Admin
- Fraud alert management  
- System-wide audit logs  
- Chatbot interaction review  
- Refined dashboards and reports  

### Agent
- Query notifications  
- Improved query management UI  

### Automation Enhancements
- Automatic fraud checks on claim submission  
- Instant notifications on status changes  
- Complete audit trail across all roles  
- Seamless chatbot integration  

---

## 🔐 Security & Authentication

- JWT-based authentication  
- Role-based authorization  
- Password encryption using BCrypt  
- Secure REST APIs  
- CORS configuration enabled  

---

## 🧪 Testing & Validation

- Backend APIs tested using Postman  
- Role-based access verified  
- JWT validation confirmed  
- Claim and policy workflows tested  
- Automation and UI flows validated  

---

## 🎥 Live Execution & Documentation

- Live execution videos (frontend, backend, chatbot)
  
- Milestone-wise PPT presentations  
- API testing proofs and screenshots

    <img width="1246" height="590" alt="image" src="https://github.com/user-attachments/assets/9b8316e1-d85a-4771-82d2-b1e466966783" />
    <img width="1910" height="928" alt="Screenshot 2026-01-09 212945" src="https://github.com/user-attachments/assets/f2fae84c-bc08-4d89-9fe0-ff5a8af881f9" />
    <img width="1910" height="920" alt="Screenshot 2026-01-09 212903" src="https://github.com/user-attachments/assets/7e8c42f7-bf4f-4113-8130-bba7b9546a37" />
    <img width="1913" height="898" alt="Screenshot 2026-01-09 213011" src="https://github.com/user-attachments/assets/c4d983f7-91dc-4e03-b1a6-00f307ec6f5b" />
    <img width="1874" height="802" alt="Screenshot 2026-01-08 170156" src="https://github.com/user-attachments/assets/fd874cb9-724c-4c35-9aeb-6ee81037f04b" />

    <img width="1919" height="924" alt="Screenshot 2026-01-09 213110" src="https://github.com/user-attachments/assets/3a0b803a-7834-49e6-bd65-4513c9eedf9f" />
    <img width="1913" height="929" alt="Screenshot 2026-01-09 011509" src="https://github.com/user-attachments/assets/0b8ef740-c27c-45f8-b911-8b9682012052" />

    <img width="1906" height="964" alt="Screenshot 2026-01-09 015609" src="https://github.com/user-attachments/assets/4cb150e2-14d3-4734-a915-34036873d657" />
    <img width="1919" height="958" alt="Screenshot 2026-01-09 015546" src="https://github.com/user-attachments/assets/fc466f18-38bd-4ff3-99b3-23fc25d7661e" />
    <img width="1905" height="963" alt="Screenshot 2026-01-09 020019" src="https://github.com/user-attachments/assets/c024faad-ab51-46f7-8c48-728f2a272181" />
    <img width="1918" height="974" alt="Screenshot 2026-01-09 020517" src="https://github.com/user-attachments/assets/a16b1f45-3ea9-4f5e-b74e-cca1d6a716e5" />
    <img width="1918" height="974" alt="Screenshot 2026-01-09 021450" src="https://github.com/user-attachments/assets/9aaff2ad-c14e-4ec0-b004-1c5acc19978a" />
    <img width="1908" height="975" alt="Screenshot 2026-01-09 022250" src="https://github.com/user-attachments/assets/9dcc57ed-7750-47a1-b579-38ead99c67c1" />
    <img width="1892" height="962" alt="Screenshot 2026-01-09 022333" src="https://github.com/user-attachments/assets/be8724a7-828b-49c9-a8be-4644869ed554" />
    <img width="1919" height="974" alt="Screenshot 2026-01-09 005259" src="https://github.com/user-attachments/assets/6ae16e57-018d-4cf8-9b20-edce3aedb341" />

    <img width="1291" height="450" alt="Screenshot 2026-01-09 213329" src="https://github.com/user-attachments/assets/d22c5ee7-4f0f-46c4-ad9f-6d80a08f8a3e" />
    <img width="1741" height="387" alt="Screenshot 2026-01-09 213507" src="https://github.com/user-attachments/assets/79fbe8c0-a872-4b9e-acb2-ff3f383dab2d" />






**Google Drive Link:**  
https://drive.google.com/drive/folders/1PpRvgcAbskYgv3I545NkfslyLUSdWW0t?usp=drive_link

---

## 👨‍💻 Project Team Details

**Team Leader**  
Aaisha Sultana Guduru  
Github Link: https://github.com/gitsish/INFOSYS-SPRINGBOARD-INSURAI-JAVA-TECH-STACK-PROJECT
Roll No: 22501A4401  
Branch: CSE – Data Science  
Institute: PVPSIT, Vijayawada  

**Team Members**
1. Anushka Dutta  
2. Ananya Gupta
   Github link: https://github.com/A-N-A-N-Y-A-25/InsurAI-Project  
3. Manisha Mohanty
    Github Link: https://github.com/manishamohanty290/InsurAI-Corporate-policy-automation-and-intelligence-systemss/tree/main/DBMS/DBMS
4. Feroza Sultana
    Github Link: https://github.com/firozasulthana/InsureAI.git 

---

## 🧠 Conclusion

InsurAI is a real-world corporate insurance automation system demonstrating secure full-stack development, modular architecture, milestone-based delivery, and intelligent automation using modern Java technologies.

