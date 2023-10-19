DROP TABLE IF EXISTS STUDENTS;
CREATE TABLE STUDENTS (	
                           id int NOT NULL AUTO_INCREMENT,
                           name varchar(15),
                           surname varchar(25),
                           faculty varchar(20),
                           age int,
                           PRIMARY KEY (id)
);

DROP TABLE IF EXISTS FACULTIES;
CREATE TABLE COURSES (	
                           id int NOT NULL AUTO_INCREMENT,
                           name varchar(15),
                           faculty varchar(20),
                           hours int,
                           PRIMARY KEY (id)
);

