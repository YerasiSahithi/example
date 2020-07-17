package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.Customer;

public interface Customerrepo extends  CrudRepository<Customer,String>{

}
