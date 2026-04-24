# Smart Parking API

A simple RESTful backend application built with **Java** and **Spring Boot** to manage cars in a parking lot.

---

## Overview

This project demonstrates the fundamentals of backend development, including:

* REST API design
* CRUD operations
* Layered architecture (Controller → Service → Logic)
* Error handling using HTTP status codes

The application allows managing cars inside a parking lot with a fixed capacity.

---

## Features

* Add a car to the parking lot
* Retrieve all cars
* Get a car by ID
* Update a car’s speed
* Delete a car
* Count total cars
* Capacity limit handling (max. 5 cars)

---

## Architecture

The project follows a simple layered structure:

```text
Controller → Service → ParkingLot
```

* **Controller**

  * Handles HTTP requests and responses
  * Converts exceptions into HTTP status codes

* **Service**

  * Contains business logic
  * Validates operations and throws exceptions

* **ParkingLot**

  * Manages in-memory data (ArrayList)
  * Contains core logic for data handling

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|------------|
| GET    | /cars | Get all cars |
| GET    | /cars/{id} | Get a car by ID |
| POST   | /cars | Add a new car |
| PUT    | /cars/{id}/speed/{value} | Update speed |
| DELETE | /cars/{id} | Delete a car |
| GET    | /cars/count | Get total number of cars |
---

## Error Handling

The API uses appropriate HTTP status codes:

* **404 Not Found** → Car does not exist
* **409 Conflict** → Parking lot is full

Exceptions are handled in the controller and mapped to HTTP responses.

---

## Technologies

* Java
* Spring Boot
* REST API
* Maven (if used)

---

## How to Run

1. Clone the repository
2. Open the project in your IDE (e.g. Eclipse or IntelliJ)
3. Run the Spring Boot application
4. Test endpoints using Postman or a browser

---

## Learning Focus

This project was built to strengthen:

* Understanding of backend architecture
* Clean separation of concerns
* Proper use of exceptions and HTTP responses
* Writing maintainable and structured code

---

## Author

[Sebastian Ilic]
