# Cab Booking System (Spring Boot)

## Project Overview
This project is a backend REST API for a Cab Booking System built using Java Spring Boot.  
It simulates the core functionality of ride booking platforms like Uber and Ola.

## Technologies Used

- Java
- Spring Boot
- Hibernate (JPA)
- MySQL
- Maven
- Postman

## Features

- User Registration
- User Login
- Ride Booking
- View All Rides
- RESTful API Architecture

## Project Structure

src/main/java/com/cabbooking

controller
- UserController
- AuthController
- RideController

service
- UserService
- RideService

repository
- UserRepository
- RideRepository

entity
- User
- Ride

## API Endpoints

Register User
POST /api/users/register

Login
POST /api/auth/login

Book Ride
POST /api/rides/book

Get All Rides
GET /api/rides

## Database Configuration

Edit application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/cabbooking
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update

## How to Run

1. Clone the repository
2. Open project in IDE
3. Run CabbookingApplication
4. Test APIs using Postman

## Future Improvements

- Driver assignment
- Payment system
- JWT authentication
- Ride tracking

## Author

Pankaj Kumar
