package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Customer;

public interface ICustomerService {
	public List<Customer> getAllCustomers(); //nos regresa todos los clientes
	public List<Customer> getAllActiveCustomers(); //este metodo nos trae clientes activos
	

}
