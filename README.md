# 🎟️ Ticket Booking System

A full-stack web application for booking event tickets, built using **React (Frontend)** and **Spring Boot (Backend)**.

---

## 🚀 Project Overview

The Ticket Booking System allows users to:

* View available events
* Check event details
* Book tickets
* Make payments (simulated)
* Receive booking confirmation

Admins can:

* View remaining tickets
* Monitor bookings
* Manage ticket availability

---

## 🧩 Modules

### 1. Home Module

* Landing page of the application
* Navigation to all sections

### 2. Events Module

* Displays all events with:

  * Name
  * Department
  * Date & Time
  * Venue
  * Price
  * Available tickets

### 3. Booking Module

* Collects user details:

  * Name
  * Email
  * Department
  * Number of tickets
* Calculates total cost

### 4. Payment Module

* Simulates payment process
* Confirms booking

### 5. Success Module

* Displays booking confirmation
* Shows ticket details

### 6. Admin Module

* Displays remaining tickets
* Monitors event availability

---

## 🏗️ Architecture

The project follows a **3-tier architecture**:

* **Frontend:** React JS
* **Backend:** Spring Boot (REST API)
* **Database:** MySQL / In-memory storage

---

## 🔄 Workflow

1. User opens the application
2. Views available events
3. Selects an event
4. Enters booking details
5. Proceeds to payment
6. Booking is confirmed
7. Tickets are updated
8. Admin can view updated data

---

## 🛠️ Technologies Used

### Frontend

* React JS
* HTML, CSS
* React Router

### Backend

* Spring Boot
* REST APIs
* Java

### Database

* MySQL (or in-memory storage)

---

## 📡 API Endpoints

| Method | Endpoint        | Description              |
| ------ | --------------- | ------------------------ |
| GET    | /api/events     | Get all events           |
| POST   | /api/book       | Book tickets             |
| GET    | /api/tickets    | Get ticket availability  |
| POST   | /api/addTickets | Increase tickets (Admin) |

---

## ▶️ How to Run

### 🔹 Backend (Spring Boot)

```bash
cd backend
mvn spring-boot:run
```

Runs on:

```
http://localhost:8081
```

---

### 🔹 Frontend (React)

```bash
cd frontend
npm install
npm start
```

Runs on:

```
http://localhost:3000
```

---

## 📊 Features

* Dynamic ticket availability
* Real-time booking updates
* User-friendly interface
* Admin dashboard
* Error handling (invalid input / sold out)

---

## 🎯 Objective

To develop a web-based system that enables users to book event tickets online while allowing administrators to manage and monitor ticket availability efficiently.

---

## 🔮 Future Enhancements

* Real payment gateway integration
* User authentication (login/signup)
* Email confirmation with QR code
* Real-time updates using WebSockets
* Mobile responsiveness improvements

---

## 👨‍💻 Author

* T.Tarun Naga Sai

---

## 📌 Notes

* Ensure backend is running before frontend
* Event names must match backend keys exactly
* Ticket updates happen after booking confirmation
