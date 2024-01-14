# Reservation System

This project is a simple Reservation System that allows users to make train reservations. It includes backend services implemented in Java using the Spring Boot framework and a H2 in-memory database for storage. The system provides functionalities for making reservations, retrieving reservation details, and deleting reservations.

## Table of Contents

- [ReservationServiceImpl.java](#reservationserviceimpljava)
- [ReservationController.java](#reservationcontrollerjava)
- [Passenger.java](#passengerjava)
- [Reservation.java](#reservationjava)
- [PnrRecord.java](#pnrrecordjava)
- [Train.java](#trainjava)
- [Repository Interfaces](#repository-interfaces)
- [Application Configuration](#application-configuration)

## ReservationServiceImpl.java

This service class implements the business logic for reservation-related operations. It interacts with repositories to fetch and store data. The key methods include:
- `makeReservation`: Creates a reservation for a given train and passenger.
- `getAllReservations`: Retrieves all reservations.
- `getAllTrain`: Retrieves all trains.
- `GetReservationByName`: Retrieves reservations for a passenger by name.
- `findByPnrNumber`: Retrieves a reservation by its PNR number.
- `deleteByPnrNumber`: Deletes a reservation by its PNR number.

## ReservationController.java

The controller class exposes REST endpoints for interacting with the reservation system. Key endpoints include:
- `searchReservation`: Retrieves reservations for a passenger by name.
- `getAllReservations`: Retrieves all reservations.
- `getAllTrain`: Retrieves all trains.
- `searchReservationPNR`: Retrieves a reservation by its PNR number.
- `deleteReservation`: Deletes a reservation by its PNR number.
- `makeReservation`: Creates a reservation by specifying train and passenger IDs.

## Passenger.java

This entity class represents a passenger, with attributes such as ID, passenger name, and seat number.

## Reservation.java

This entity class represents a reservation, with associations to the Train and Passenger entities. It includes a PnrRecord as an embedded class.

## PnrRecord.java

The PnrRecord class encapsulates details related to a Passenger Name Record (PNR), including the PNR number, passenger name, train number, class type, journey date, from destination, and to destination.

## Train.java

This entity class represents a train, with attributes such as ID, train number, and train name.

## Repository Interfaces

- **ReservationRepository:** Manages CRUD operations for the Reservation entity.
- **PassengerRepository:** Manages CRUD operations for the Passenger entity.
- **TrainRepository:** Manages CRUD operations for the Train entity.

## Application Configuration

The `application.properties` file includes configurations for the H2 in-memory database, H2 console, Hibernate, and server properties. It also specifies the SQL script (`data.sql`) for initializing data.

```properties
# Database Configuration for H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver

# H2 Console Configuration
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Hibernate Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect

# Server Configuration
server.port=8000

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

spring.datasource.initialization-mode=always
spring.datasource.data=pathway:data.sql
```

This configuration enables the H2 in-memory database, H2 console, and sets up Hibernate for data persistence. It also specifies the port on which the server runs and the SQL script for data initialization. The script (`data.sql`) is expected to be located in the `pathway` directory.
