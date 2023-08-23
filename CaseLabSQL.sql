
-- create
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    surname VARCHAR(255) NOT NULL,
    experience INT
);


-- insert
INSERT INTO employees (id, surname, experience)
VALUES
    (1, 'Иванов', 10),
    (2, 'Петров', 12),
    (3, 'Сидоров', 14);

-- fetch 
SELECT surname
FROM employees
ORDER BY experience DESC
LIMIT 1 OFFSET 1;
