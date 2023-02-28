package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Customer;
import org.generation.app.repository.ICustumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	ICustumerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers = (List<Customer>) customerRepository.findAll();
		return allCustomers;
	}

	@Override
	public List<Customer> getAllActiveCustomers() {
		List<Customer> allCustomers = (List<Customer>) customerRepository.findAllByActive(true);
		return allCustomers;
	}

}
