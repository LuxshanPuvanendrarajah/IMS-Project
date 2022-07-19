INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');


INSERT INTO `ims`.`item` (`itemName`, `itemPrice`) VALUES ('chocolate', '1.99');


INSERT INTO `ims`.`order` (`customer_id`) VALUES (1);


INSERT INTO `ims`.`order_item` (`order_id`, `item_id`, `OrderQuantity`) VALUES (1,1,1);