package com.amdocs.mechanicappointment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.mechanicappointment.dao.CustomerRepository;
import com.amdocs.mechanicappointment.entity.Customer;
import com.amdocs.mechanicappointment.exception.CustomerNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public Customer registerCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public Customer deleteCustomer(int custId) throws CustomerNotFoundException {
		Optional<Customer> customer = custRepo.findById(custId);
		Customer cust = null;
		if(customer.isPresent()) {
			custRepo.deleteById(custId);
			cust = customer.get();
		}else {
			throw new CustomerNotFoundException("No such Customer");
		}
		return cust;
	}

	@Override
	public Customer getCustomer(int custId) throws CustomerNotFoundException {
		Optional<Customer> customer = custRepo.findById(custId);
		Customer cust = null;
		if(customer.isPresent()) {
			cust = customer.get();
		}else {
			throw new CustomerNotFoundException("No such Customer");
		}
		return cust;
	}

	@Override
	public List<Customer> getCustomers() {
		return custRepo.findAll();
	}
}
