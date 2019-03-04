SET TERMOUT ON
PROMPT cw3.sql started. Beginning building.
PROMPT 
PROMPT Dropping tables...

DROP TABLE User;
DROP TABLE RoomType;
DROP TABLE Room;
DROP TABLE Booking;
DROP TABLE Facilities;

PROMPT Tables dropped.
PROMPT 
PROMPT Creating User table...

CREATE TABLE User (
    UserName     VARCHAR2(12) PRIMARY KEY,
    UserPassword     VARCHAR2(12) NOT NULL,
    Name         VARCHAR2(20) NOT NULL,
    YearOfStudy     NUMBER(1) DEFAULT 1,
    phoneNumber     NUMBER(14) NOT NULL,
    StudentID     NUMBER(9) NOT NULL,
    Email     VARCHAR2(30) NOT NULL
    
);

PROMPT User table created.
PROMPT 
PROMPT Inserting data into User table...

INSERT INTO User VALUES (
	'student1', 'password1', 'Name', 1, 
	00447996767656, 170912345, 'email@gmail.com'
);

INSERT INTO User VALUES (
    'tutor1', 'password2', 'Name2', 2, 
    00447399767656, 170976545, 'email2@gmail.com'
);

PROMPT Data inserted into User table.
PROMPT 
PROMPT Creating UserType table...

CREATE TABLE UserType (
    type        VARCHAR2(7) PRIMARY KEY,
);

PROMPT UserType table created.
PROMPT 
PROMPT Inserting data into UserType table...

INSERT INTO UserType VALUES(
    'Student'
);

INSERT INTO UserType VALUES(
    'Tutor'
);

PROMPT Data inserted into UserType table.
PROMPT 
PROMPT Creating Availability table...

CREATE TABLE Availability (
    TutorUserName     VARCHAR2(12),
    Day        	VARCHAR2(10) NOT NULL,
    StartTime	NUMBER(10) DEFAULT 9,
    EndTime	NUMBER(10) DEFAULT 18,
);

PROMPT Availability table created.
PROMPT 
PROMPT Inserting data into Availability table...

INSERT INTO Availability VALUES(
    'tutor1', 'Monday', 11, 13
);

INSERT INTO Availability VALUES(
    'tutor1', 'Wednesday', 10, 15
);


PROMPT Data inserted into Availability table.
PROMPT 
PROMPT Creating Session table...

CREATE TABLE Session (
    bookingID     	NUMBER(4) PRIMARY KEY,
    TutorUserName       VARCHAR2(12) NOT NULL,
    StudentUserName     VARCHAR2(12) NOT NULL,
    SessionDate    	DATE NOT NULL,
    Day         VARCHAR2(10) NOT NULL,
    StartTime	NUMBER(10) NOT NULL,
    EndTime	NUMBER(10) NOT NULL,	
    cost        NUMBER(2) DEFAULT 10
);

PROMPT Session table created.
PROMPT 
PROMPT Inserting data into Session table...

INSERT INTO Session VALUES(
    1001, 'tutor1', 'student1',
    TO_DATE('04-MAR-2019', 'DD-MON-YYYY'), 'Monday', 11, 12, 10);

INSERT INTO Session VALUES(
    1002, 'tutor1', 'student1',
    TO_DATE('06-MAR-2019', 'DD-MON-YYYY'), 'Wednesday', 13, 14, 10);


PROMPT Data inserted into Session table.
PROMPT 
PROMPT Table creation and data insertion complete. Committing...
COMMIT;

PROMPT cw3.sql has finished building.

