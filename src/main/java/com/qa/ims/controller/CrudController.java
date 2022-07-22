package com.qa.ims.controller;

import java.sql.SQLException;
import java.util.List;

/**
 * Create, Read, Update and Delete controller. Takes in inputs for each action
 * to be sent to a service class
 */
public interface CrudController<T> {

	List<T> readAll();

	T create() throws SQLException;

	T update();

	int delete();

}
