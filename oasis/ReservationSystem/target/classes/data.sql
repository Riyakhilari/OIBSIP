-- Create PASSENGER table
CREATE TABLE PASSENGER (
    id INT PRIMARY KEY AUTO_INCREMENT,
    passenger_name VARCHAR(255) NOT NULL,
    seat_number INTEGER NOT NULL
);

-- Insert sample data
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('John Doe', 1);


-- Example 2
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Alice Smith', 2);

-- Example 3
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Bob Johnson', 3);

-- Example 4
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Eva Davis', 4);

-- Example 5
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Michael Brown', 5);

-- Example 6
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Sophia Wilson', 6);

-- Example 7
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('David Lee', 7);

-- Example 8
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Emma White', 8);

-- Example 9
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Daniel Harris', 9);

-- Example 10
INSERT INTO PASSENGER (passenger_name, seat_number) VALUES ('Olivia Miller', 10);






CREATE TABLE IF NOT EXISTS TRAIN (
    id INT PRIMARY KEY AUTO_INCREMENT,
    train_number INT NOT NULL,
    train_name VARCHAR(255) NOT NULL
    -- Other columns as needed
);



-- Example 1
INSERT INTO TRAIN (train_number, train_name) VALUES (12345, 'Express A');

-- Example 2
INSERT INTO TRAIN (train_number, train_name) VALUES (456, 'Rapid B');

-- Example 3
INSERT INTO TRAIN (train_number, train_name) VALUES (789, 'Local C');

-- Example 4
INSERT INTO TRAIN (train_number, train_name) VALUES (101, 'Superfast D');

-- Example 5
INSERT INTO TRAIN (train_number, train_name) VALUES (45678, 'Metro E');

-- Example 6
INSERT INTO TRAIN (train_number, train_name) VALUES (303, 'High-speed F');

-- Example 7
INSERT INTO TRAIN (train_number, train_name) VALUES (404, 'Shuttle G');

-- Example 8
INSERT INTO TRAIN (train_number, train_name) VALUES (505, 'Inter-city H');

-- Example 9
INSERT INTO TRAIN (train_number, train_name) VALUES (606, 'Limited I');

-- Example 10
INSERT INTO TRAIN (train_number, train_name) VALUES (707, 'Express J');









CREATE TABLE IF NOT EXISTS RESERVATION (
    id INT PRIMARY KEY AUTO_INCREMENT,
    pnr_number INT NOT NULL,
    passenger_name VARCHAR(255) NOT NULL,
    train_number VARCHAR(20) NOT NULL,
    class_type VARCHAR(50),
    journey_date DATE,
    from_destination VARCHAR(255),
    to_destination VARCHAR(255),
    train_id INT,
    passenger_id INT,
    FOREIGN KEY (train_id) REFERENCES TRAIN(id),
    FOREIGN KEY (passenger_id) REFERENCES PASSENGER(id)
);
-- Example 1
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (12345, 'John Doe', 'Express A', 'First Class', '2023-01-15', 'City A', 'City B', 1, 1);

-- Example 2
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (54321, 'Alice Smith', 'Rapid B', 'Economy', '2023-02-20', 'City C', 'City D', 2, 2);

-- Example 3
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (98765, 'Bob Johnson', 'Local C', 'Business Class', '2023-03-25', 'City E', 'City F', 3, 3);

-- Example 4
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (45678, 'Eva Davis', 'Express A', 'First Class', '2023-04-10', 'City G', 'City H', 1, 4);

-- Example 5
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (87654, 'Michael Brown', 'Rapid B', 'Economy', '2023-05-15', 'City I', 'City J', 2, 5);

-- Example 6
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (23456, 'Sophia Wilson', 'Local C', 'Business Class', '2023-06-20', 'City K', 'City L', 3, 6);

-- Example 7
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (78901, 'David Lee', 'Shuttle G', 'Economy', '2023-07-25', 'City M', 'City N', 7, 7);

-- Example 8
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (34567, 'Emma White', 'Inter-city H', 'First Class', '2023-08-30', 'City O', 'City P', 8, 8);

-- Example 9
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (89012, 'Daniel Harris', 'Limited I', 'Business Class', '2023-09-05', 'City Q', 'City R', 9, 9);

-- Example 10
INSERT INTO RESERVATION (pnr_number, passenger_name, train_number, class_type, journey_date, from_destination, to_destination, train_id, passenger_id) 
VALUES (67890, 'Olivia Miller', 'Express J', 'Economy', '2023-10-10', 'City S', 'City T', 10, 10);
