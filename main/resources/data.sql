DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

CREATE TABLE fabricantes (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(100),
  PRIMARY KEY (codigo)
);

CREATE TABLE articulos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(100),
  precio int,
  fabricante int,
  PRIMARY KEY (codigo),
  FOREIGN KEY (fabricante) REFERENCES fabricantes (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO fabricantes (nombre) VALUES ('Roberto');
INSERT INTO fabricantes (nombre) VALUES ('Alfredo');

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Teclado',40,2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('raton',20,1);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Altavoces',25,1);