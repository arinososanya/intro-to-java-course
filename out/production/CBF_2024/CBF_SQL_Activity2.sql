DROP TABLE IF EXISTS market;

CREATE DATABASE market;

USE market;

CREATE TABLE IF NOT EXISTS `produce` (
  `id` INT(10)  NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `type` VARCHAR(50) NOT NULL,
  `variety` VARCHAR(50) NULL,
  `colour` VARCHAR(50) NOT NULL,
  `price` DECIMAL(4,2) NOT NULL
);

INSERT INTO `produce`(id,name,`type`,variety,colour,price)
VALUES(1,'apple','fruit','pink lady','pink',0.85),
(2,'apple','fruit','braeburn','red',0.55),
(3,'apple','fruit','bramley','green',0.99),
(4,'apple','fruit','russet','light brown',0.29),
(5,'apple','fruit','granny smith','green',0.29),
(6,'apple','fruit','jazz','red',0.81),
(7,'apple','fruit','royal gala','red',0.44),
(8,'orange','citrus fruit','valencia','orange',0.65),
(9,'orange','citrus fruit','clementine ','orange',0.32),
(10,'orange','citrus fruit','blood orange','orange',1.29),
(11,'lemon','citrus fruit','lima','yellow',0.35),
(12,'lemon','citrus fruit','eureka','yellow',0.35),
(13,'lime','citrus fruit','kaffir','green',0.32),
(14,'cucumber','vegetable',NULL,'green',0.75),
(15,'radish','vegetable',NULL,'pink',0.15),
(16,'lettuce','vegetable','iceberg','green',1.19),
(17,'lettuce','vegetable','gem','green',0.99),
(18,'lettuce','vegetable','romaine','red',0.84),
(19,'tomato','fruit','cherry','red',0.16),
(20,'tomato','fruit','plum','red',0.15),
(21,'onion','vegetable',NULL,'white',0.22),
(22,'onion','vegetable',NULL,'purple',0.26),
(23,'onion','vegetable','shallots','white',0.17),
(24,'onion','vegetable','spring','red',0.10),
(25,'garlic','vegetable',NULL,'white',0.69),
(26,'carrot','vegetable',NULL,'orange',0.12),
(27,'pepper','vegetable','bell','orange',0.79),
(28,'pepper','vegetable','bell','yellow',0.79),
(29,'pepper','vegetable','bell','green',0.79),
(30,'bean','legume','black eye','white',0.10),
(31,'lentil','legume',NULL,'green',0.10),
(32,'dal','legume',NULL,'yellow',0.10),
(33,'rice','grain',NULL,'white',0.05),
(34,'rice','grain',NULL,'brown',0.06),
(35,'sweet corn','vegetable',NULL,'yellow',0.10),
(36,'watermelon','fruit',NULL,'green',3.10),
(37,'pumpkin','vegetable',NULL,'orange',2.09),
(38,'aubergine','vegetable',NULL,'purple',0.87),
(39,'beetroot','vegetable',NULL,'purple',1.13),
(40,'butternut squash','vegetable',NULL,'orange',2.60),
(41,'blackberry','fruit',NULL,'purple',0.10),
(42,'strawberry','fruit',NULL,'red',0.25),
(43,'asparagus','vegetable',NULL,'green',0.87),
(44,'broccoli','vegetable',NULL,'green',0.55),
(45,'banana','fruit',NULL,'yellow',0.25),
(46,'plantain','fruit','false horn','green',0.30),
(47,'plantain','fruit','horn','yellow',0.45),
(48,'okra','vegetable','emerald','green',0.11),
(49,'chilli','vegetable','scotch bonnet','red',0.25);


SELECT * FROM produce;

-- 1. Write a query that returns only the pink vegetables, pink citrus fruits and pink fruits (2 rows returned)
SELECT * FROM produce WHERE colour IN ('pink') AND type = 'vegetable' 
OR colour IN ('pink') AND type = 'fruit' 
OR colour IN ('pink') AND type = 'citrus fruit'; -- can also write colour = pink or try colour in pink AND type = xyz 

-- Alternative method for No.1
SELECT * FROM produce WHERE colour IN ('pink') AND type IN ('vegetable', 'citrus fruit', 'fruit');

-- 2. Write a query that returns only green vegetables (6 rows returned)
SELECT * FROM produce WHERE (type = 'vegetable' AND colour = 'green') LIMIT 6; -- to limit the no. of results to 6, use LIMIT 6

-- 3. All vegetables and fruits with the letter 'b' in their name (9 rows returned)
SELECT * FROM produce WHERE type IN ('vegetable', 'fruit') AND name LIKE '%b%'; -- the name of the veg or fruit is in the name column and that's what we want 

-- 4. Returns all apples that are NOT green (5 rows returned)

-- 5. All vegetables, citrus fruit and fruit that have the letter 'c' in their name BUT do not start OR end with the letter 'c' (8 rows returned)

-- Order all the items in the produce by the most expensive. What is the most expensive item?

-- Write a query using GROUP BY to retrieve the COUNT of the different colours of produce, group by colour.
SELECT COUNT (colour) AS item_category_number FROM produce

-- Return the SUM of the price of all the red fruits and vegetables in the produce table. What is the total cost? (£3.55)

-- Using the COUNT operator, how many items cost more than 25p?

-- Using the COUNT operator, how many items cost less than 22p?