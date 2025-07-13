# 🩸 Blood Donor Finder

A real-time Spring Boot application that finds matching blood group donors and simulates SMS notifications . Built with Java, Spring Boot, MySQL, and styled HTML.

---

## 🚀 Features

* Register blood donors with details (name, city, blood group, phone)
* Find donors by blood group and city
* Simulate SMS alerts to matching donors
* Clean HTML form for donor submission
* Uses Spring Data JPA + MySQL

---

## 🛠️ Technologies Used

* Java 17
* Spring Boot 3.5.3
* Spring Web, Spring Data JPA, MySQL Driver
* HTML +  CSS (for frontend)
* Git + GitHub

---
## 🧪 Sample Donor Registration

**POST** `/add-donor`

```json
{
  "name": "Pranith Kumar",
  "phoneNumber": "7330708003",
  "bloodGroup": "B+",
  "city": "Kurnool"
}