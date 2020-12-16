create database if not exists Sistema_restaurante;


use Sistema_restaurante; 

DROP TABLES if exists Usuarios;

create table Usuarios(
Usuario varchar(20) not null,
Password varchar(30) not null,
Level_Acces int(5) not null,
primary key (Usuario)
);


drop table if exists Presupuesto;
create table Presupuesto(
id_Presupuesto int(10) not null auto_increment,
Ganancia int(10) not null,
fecha date not null,
primary key  (id_Presupuesto)
);

drop table if exists Reserva;
create table Reserva(
id_Reserva int(10) not null auto_increment,
Nombre_Cliente varchar(50) not null,
DNI int(8) not null,
email varchar(50) not null,
Telefono int(9) not null,
fecha_hora date not null,
numero_mesa int(50) not null,
primary key  (id_Reserva)
);







create table Mozos(
id_Moso varchar(20) not null,
Nombre_Apellido varchar(50) not null,
DNI int(8) not null,
Telefono int(9) not null,
direccion varchar(50),
primary key (id_Moso)
);

create table Cliente(
id_cliente varchar(20) not null,
Nombre varchar(30) not null,
DNI int(5) not null,
primary key (id_cliente)
);

create table Venta(
id_venta varchar(20) not null,
Cliente int,
Mozo int,
Numero_Venta varchar(9) not null,
fecha_hora date not null,
Monto int(50) not null,
primary key (id_venta),
FOREIGN KEY (Cliente) REFERENCES Cliente (id_cliente),
FOREIGN KEY (Mozo) REFERENCES Mozos (id_Moso)
);

create table Detalle_Venta(
id_Detalle varchar(20) not null,
Ventas varchar(50) not null,
Producto int(8) not null,
Cantidad int(9) not null,
Precio_venta double not null,
primary key (id_Detalle),
FOREIGN KEY (Ventas) REFERENCES Venta (id_venta),
FOREIGN KEY (Producto) REFERENCES Producto (id_Producto)
);


drop table if exists Producto;
create table Producto(
id_Producto int(10) not null auto_increment,
Nombre varchar(20) not null,
Descripcion varchar(50) not null,
Stock int(50),
Precio int (50) not null,
primary key  (id_Producto)
);

INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Lomo Saltado', 'Plato de fondo', '30', '10.00');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Taypa', 'Plato de fondo', '30', '9.00');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Chaufa de Pollo', 'Plato de fondo', '30', '8.00');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Sopa Wantan', 'Adicionales', '30', '6.00');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Wantanes Fritos', 'Adicionales', '30', '5.00');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Inka Kola (Personal)', 'Bebidas', '20', '2.50');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Coca Cola (Personal)', 'Bebidas', '20', '2.50');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Chicha (un vaso)', 'Bebidas', '15', '3.00');
INSERT INTO `sistema_restaurante`.`producto` (`Nombre`, `Descripcion`, `Stock`, `Precio`) VALUES ('Limonada (un vaso)', 'Bebidas', '15', '3.00');


/*
create table mesa(
id_Mesa varchar(20) not null,
primary key (id_Mesa)
);
*/




