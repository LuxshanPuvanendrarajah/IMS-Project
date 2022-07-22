package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.Order_item;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	/**
	 * Reads all Orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	/**
	 * Creates a order by taking in user input
	 * @throws SQLexception
	 */
	@Override
	public Order create() throws SQLException {
		
		boolean additem = true;
		
		LOGGER.info("Please enter the customer id to create an order.");
		Long customer_id = utils.getLong();
		Order order = orderDAO.create(new Order(customer_id));
		while (additem) {
			LOGGER.info("Adding an item? yes/no");
			String option =utils.getString();
			if (option.equalsIgnoreCase("yes")) {	
			LOGGER.info("Enter the Order id:");
			Long order_id =  utils.getLong();
			LOGGER.info("Enter the item id:");
			Long item_id =  utils.getLong();
			LOGGER.info("Enter the quantity of item needed");
			Long orderQuantity= utils.getLong();
			orderDAO.generate(new Order_item(order_id,item_id,orderQuantity));
			LOGGER.info("do you want to add anything else?");
			}else { additem = false;
				}
		}
		LOGGER.info("Order created");
		return order;
	}

		/**
	 * Updates an existing order by taking in user input
	 */
	@Override
	public Order update() {
		boolean updateitem = true;
		LOGGER.info("Please enter the order id of the order you would like to update");
		Long order_id = utils.getLong();
		Order order = orderDAO.update(new Order(order_id));
		while (updateitem) {
			LOGGER.info("Do you want to update an item?: yes/no");
			String option = utils.getString();
			if(option.toLowerCase().equals("yes")) {
				LOGGER.info("please enter the item id:");
				Long item_id = utils.getLong();
				LOGGER.info("please enter the order quantity");
				Long orderQuantity = utils.getLong();
				orderDAO.edit(new Order_item(item_id,orderQuantity));
				LOGGER.info("Do you want to update anything else from your order? yes/no");
				
		}else{
				updateitem = false;

			}
			LOGGER.info("order updated");
		}
		return order;
	}

	/**
	 * Deletes an existing Order by the id of the order
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}
	
	}
	

		

