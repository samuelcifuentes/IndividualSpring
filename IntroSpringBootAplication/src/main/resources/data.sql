-- SQL to create tables for Student, Profesor, and Curso entities

-- Table for Student entity
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    program VARCHAR(255),
    age VARCHAR(255)
);

-- Table for Profesor entity
CREATE TABLE profesor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Table for Curso entity
CREATE TABLE curso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    program VARCHAR(255),
    profesor_id BIGINT,
    FOREIGN KEY (profesor_id) REFERENCES profesor(id)
);

-- Insert data into students table
INSERT INTO students (code, name, program, age) VALUES
('A00123456', 'Juan Perez', 'Ingeniería de Sistemas', '20'),
('A00123457', 'Maria Rodriguez', 'Diseño Industrial', '22'),
('A00123458', 'Carlos Gomez', 'Administración de Empresas', '21');

-- Insert data into profesor table
INSERT INTO profesor (name) VALUES
('Dr. Smith'),
('Dra. Martinez');

-- Insert data into curso table
INSERT INTO curso (name, program, profesor_id) VALUES
('Cálculo I', 'Ingeniería', 1),
('Programación Orientada a Objetos', 'Ingeniería de Sistemas', 1),
('Diseño de Producto', 'Diseño Industrial', 2);
