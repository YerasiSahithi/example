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

import com.example.demo.pojo.Car;
import com.example.demo.repo.Carrepository;

@RestController

@RequestMapping("/Car")

public class CarController {
	@Autowired
	private Carrepository carRepository;

	 @RequestMapping("/getAllIPO")

	public Iterable<Car> getAllCar()

	{

	 return carRepository.findAll();

	}
	 @PostMapping("/saveCar")

	 public Car saveCar(@RequestBody Car car)

	 {

	 System.out.println(car);

	 carRepository.save(car);

	 return car;

	 }
	 @PutMapping("/updateCar/{carid}")

	 public Car updateCar(@RequestBody Car car,@PathVariable("carid") String carid)

	 {

	 System.out.println(car);

	 carRepository.save(car);
	 car.setCarid(carid);

	 return car;

	 }
	 @DeleteMapping("/deleteCar/{carid}")

	 public Boolean deleteCar(@PathVariable("carid") String carid)

	 {

	 System.out.println(carid);

	 carRepository.deleteById(carid);

	 return true;

	 }
	 @GetMapping("/findCar/{carid}")

	 public Car findCar (@PathVariable("carid") String carid)

	 {
	 Optional<Car> car= carRepository.findById(carid);

	 return car.get();

	 }








}
