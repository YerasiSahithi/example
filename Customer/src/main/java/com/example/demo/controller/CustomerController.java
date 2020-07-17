package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Customer;
import com.example.demo.repo.Customerrepo;

@RestController

@RequestMapping("/Customer")

public class CustomerController {
	@Autowired
	private Customerrepo customerRepository;

	 @RequestMapping("/getAllCustomer")

	public Iterable<Customer> getAllCustomer()

	{

	 return customerRepository.findAll();

	}
	 @PostMapping("/saveCustomer")

	 public Customer saveCar(@RequestBody Customer customer)

	 {

	 System.out.println(customer);

	 customerRepository.save(customer);

	 return customer;

	 }
	 @PutMapping("/updateCustomer/{customerid}")

	 public Customer updateCar(@RequestBody Customer customer,@PathVariable("customerid") int customerid)

	 {

	 System.out.println(customer);

	 customerRepository.save(customer);
	 customer.setCustomerid(customerid);

	 return customer;

	 }
	 @DeleteMapping("/deleteCustomer/{customerid}")

	 public Boolean deleteCustomer(@PathVariable("customerid") int customerid)

	 {

	 System.out.println(customerid);

	 customerRepository.deleteById(customerid);

	 return true;

	 }
	 @GetMapping("/findCustomer/{customerid}")

	 public Customer findCustomer (@PathVariable("customerid") int customerid)

	 {
	 Optional<Customer> car= customerRepository.findById(customerid);

	 return car.get();

	 }








}
