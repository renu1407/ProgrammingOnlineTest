package com.sample.project;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class Controller {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value= "/getCustomer/{id}", method =RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> getCustomerById(@PathVariable String id)
	{
	
		Customer customer=customerService.getCustomerDetailById(id);
		return ResponseEntity.ok(customer);
		
	}
	
	@RequestMapping(value= "/getCustomerDetails", method =RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<List<Customer>> getCustomerDeatilsWithBill()
	{
	
		List<Customer> customer=customerService.getCustomersTotalBill();
		return ResponseEntity.ok(customer);
		
	}

}
