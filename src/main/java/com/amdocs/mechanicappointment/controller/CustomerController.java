package com.amdocs.mechanicappointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.mechanicappointment.entity.Customer;
import com.amdocs.mechanicappointment.exception.CustomerNotFoundException;
import com.amdocs.mechanicappointment.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/register", consumes={MediaType.APPLICATION_JSON_VALUE})
	public Customer registerCustomer(@Valid @RequestBody Customer customer) {
		return customerService.registerCustomer(customer);
	}
	
	@PutMapping(value = "/update",consumes={MediaType.APPLICATION_JSON_VALUE})
	public Customer updateCustomere(@RequestBody @Valid Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Customer deleteEmployee(@PathVariable("id") int userId) throws CustomerNotFoundException {
		return customerService.deleteCustomer(userId);
	}
	
	@GetMapping(value = "/get/{id}")
	public Customer getCustomer(@PathVariable("id") int userId) throws CustomerNotFoundException{
		return customerService.getCustomer(userId);
	}
	
	@GetMapping(value = "/getAll")
	public List<Customer> getCustomer() {
		return customerService.getCustomers();
	}
}
