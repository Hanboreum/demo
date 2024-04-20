CREATE TABLE product (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    price INT NOT NULL,
    description VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO product (name, price, description) VALUES
('notebook', 3000, 'notebook....'),
('pen', 1500, 'black'),
('pen', 2000, 'pink');

