package com.amdocs.mechanicappointment.service;

import java.util.List;

import com.amdocs.mechanicappointment.entity.Customer;
import com.amdocs.mechanicappointment.exception.CustomerNotFoundException;

public interface CustomerService {
	public Customer registerCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int custId) throws CustomerNotFoundException;
	public Customer getCustomer(int custId) throws CustomerNotFoundException;
	public List<Customer> getCustomers();
}