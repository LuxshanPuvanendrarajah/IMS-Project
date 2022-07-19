DROP SCHEMA `ims`;
CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);

  CREATE TABLE IF NOT EXISTS `ims`.`item` (
    `item_id` INT(11) NOT NULL AUTO_INCREMENT,
    `itemName` VARCHAR(40) NOT  NULL,
    `itemPrice` FLOAT NOT NULL,
    PRIMARY KEY (`item_id`)
);


CREATE TABLE IF NOT EXISTS `ims`.`order` (
    `order_id` INT(11) NOT NULL AUTO_INCREMENT,
    `customer_id` INT NOT NULL,
    `TotalPrice` FLOAT DEFAULT NULL,
	PRIMARY KEY (`order_id`),
	FOREIGN KEY (`customer_id`) REFERENCES `customers`(`customer_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`order_item` (
    `order_item_id` INT(11) NOT NULL AUTO_INCREMENT,
    `order_id` INT(11) NOT NULL,
    `item_id` INT(11) NOT NULL ,
    `OrderQuantity` INT DEFAULT NULl,
    PRIMARY KEY (`order_item_id`),
    FOREIGN KEY (`order_id`)REFERENCES `order`(`order_id`),
    FOREIGN KEY (`item_id`) REFERENCES `item`(`item_id`)
);




