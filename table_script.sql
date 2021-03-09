CREATE DATABASE `userdb` ;
USE `userdb`;

CREATE TABLE `buyer` (
  `BUYERID` int(11) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PHONENUMBER` varchar(45) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `ISPRIVILEGED` tinyint(1) DEFAULT NULL,
  `REWARDPOINTS` int(11) DEFAULT NULL,
  `ISACTIVE` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`BUYERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `cart` (
  `BUYERID` int(11) NOT NULL,
  `PRODID` int(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  PRIMARY KEY (`BUYERID`,`PRODID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `seller` (
  `SELLERID` int(11) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PHONENUMBER` varchar(45) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `ISACTIVE` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`SELLERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `wishlist` (
  `BUYERID` int(11) NOT NULL,
  `PRODID` int(11) NOT NULL,
  PRIMARY KEY (`BUYERID`,`PRODID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

show tables;










create database orderManagement;
use orderManagement;

create table orderdetails(
ORDERID int primary key,
BUYERID int not null,
AMOUNT decimal(10,2) not null,
DATE date,
ADDRESS varchar(100) not null,
STATUS varchar(60) not null);

create table productsordered(
ORDERID int,
PRODID int,
SELLERID int not null,
QUANTITY int not null,
STATUS varchar(60) not null,
price decimal(10,2),
primary key(ORDERID,PRODID));

show tables;

INSERT INTO orderdetails (orderid,buyerid,amount,date,address,status)
VALUES (1,11,12345,'2020-01-28','HYD','ORDER PLACED');
INSERT INTO orderdetails (orderid,buyerid,amount,date,address,status)
VALUES (2,12,999.00,'2020-02-28','Delhi','ORDER PLACED');

INSERT INTO productsordered (orderid,prodid,sellerid,quantity,status,price)
VALUES (1,1,4,1,'ORDER PLACED',12345);
INSERT INTO productsordered (orderid,prodid,sellerid,quantity,status,price)
VALUES (2,3,7,1,'ORDER PLACED',999.00);


select * from orderdetails;

select * from productsordered;






CREATE DATABASE `product_db`;

USE `product_db`;

CREATE TABLE `product` (
  `prodid` int(11) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `image` varchar(255) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `productname` varchar(255) NOT NULL,
  `rating` int(11) DEFAULT NULL,
  `sellerid` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `subcategory` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`prodid`)
);

CREATE TABLE `subscribedproduct` (
  `subid` int(11) NOT NULL,
  `buyerid` int(11) NOT NULL,
  `prodid` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`subid`)
);

show tables;

INSERT INTO `product` VALUES 
(1,'Alisha','Clothing','Key Features of Alisha Solid Women\'s Cycling Shorts Cotton Lycra Navy, Red, Navy,Specifications of Alisha Solid Women\'s Cycling Shorts Shorts','\"http://img5a.flixcart.com/image/short/u/4/a/altht-3p-21-alisha-38-original-imaeh2d5vm5zbtgg.jpeg\"',500.00,'Alisha Solid Women\'s Cycling Shorts',NULL,7,50,'Women\'s Clothing'),
(2,'FabHomeDecor','Furniture','FabHomeDecor Fabric Double Sofa Bed (Finish Color - Leatherette Black Mechanism Type - Pull Out)','\"http://img6a.flixcart.com/image/sofa-bed/j/f/y/fhd112-double-foam-fabhomedecor-leatherette-black-leatherette-1100x1100-imaeh3gemjjcg9ta.jpeg\"',32157.00,'FabHomeDecor Fabric Double Sofa Bed',NULL,4,30,'Living Room Furniture'),
(3,'AW','Footwear','Key Features of AW Bellies Sandals Wedges Heel Casuals,AW Bellies Price: Rs. 499 Material: Synthetic Lifestyle: Casual Heel','\"http://img5a.flixcart.com/image/shoe/7/z/z/red-as-454-aw-11-original-imaeebfwsdf6jdf6.jpeg\"',999.00,'AW Bellies',NULL,2,93,'Women\'s Footwear'),
(4,'Alisha','Clothing','Key Features of Alisha Solid Women\'s Cycling Shorts Cotton Lycra Black, Red,Specifications of Alisha Solid Women\'s Cycling Shorts Shorts ','\"http://img5a.flixcart.com/image/short/6/2/h/altght-11-alisha-38-original-imaeh2d5uq9thnyg.jpeg\"',699.00,'Alisha Solid Women\'s Cycling Shorts',NULL,10,10,'Women\'s Clothing'),
(5,'Sicons','Pet Supplies','Specifications of Sicons All Purpose Arnica Dog Shampoo (500 ml)','\"http://img5a.flixcart.com/image/pet-shampoo/r/j/5/sh-df-14-sicons-500-1100x1100-imaeh3hfvav85tva.jpeg\"',220.00,'Sicons All Purpose Arnica Dog Shampoo',NULL,9,22,'Grooming'),
(6,'Eternal Gandhi','Eternal Gandhi Super Series Crystal Paper Weight...','Key Features of Eternal Gandhi Super Series Crystal Paper Weights  with Silver Finish Crystal  paper weight Product ','\"http://img5a.flixcart.com/image/paper-weight/u/e/3/eternal-gandhi-gandhi-paper-weight-mark-v-1100x1100-imaeb8adyf3xmqhf.jpeg\"',430.00,'Eternal Gandhi Super Series Crystal Paper Weights  with Silver Finish',NULL,4,86,''),
(7,'Alisha','Clothing','Key Features of Alisha Solid Women\'s Cycling Shorts Cotton Lycra Navy, Red, White, Red,Specifications of Alisha Solid Women\'s Cycling Shorts Shorts Details Number of Contents in Sales Package Pack of 4 Fabric Cotton Lycra Type Cycling Shorts ','\"http://img6a.flixcart.com/image/short/p/j/z/altght4p-26-alisha-38-original-imaeh2d5cqtxe5gt.jpeg\"',1199.00,'Alisha Solid Women\'s Cycling Shorts',NULL,4,56,'Women\'s Clothing'),
(8,'FabHomeDecor','Furniture','FabHomeDecor Fabric Double Sofa Bed (Finish Color - Brown Mechanism Type - Pull Out)','\"http://img6a.flixcart.com/image/sofa-bed/e/x/n/fhd107-double-foam-fabhomedecor-brown-brown-1100x1100-imaeh3geypmfrc5a.jpeg\"',32157.00,'FabHomeDecor Fabric Double Sofa Bed',NULL,8,32,'Living Room Furniture');

select * from product