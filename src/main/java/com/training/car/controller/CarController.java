package com.training.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.car.entity.Car;
import com.training.car.service.CarService;



@RestController
@RequestMapping(value="/car")
public class CarController {
	@Autowired
	CarService carsSer;
	@PostMapping(value = "/add")
	public String addCar(@RequestBody Car cars) {
		return carsSer.addCar(cars);

	}
	@GetMapping(value = "/get/{id}")
	public Car getCarsById(@PathVariable int id) {
		return carsSer.getCarsById(id);
	}
	@DeleteMapping(value = "/delete/{id}")
	public String deleteCarById(@PathVariable int id) {
		  return carsSer.deleteCarsById(id);
	  }
	@PutMapping(value = "/update/{id}")
	public String updateCar(@RequestBody Car id) {
		  return carsSer.updateCar(id);
	  }
	 @PostMapping(value = "/list")
	  public String listCar(@RequestBody List<Car> cars) {
		  return carsSer.listCar(cars);
	  }

		@GetMapping(value="/getlistCar/{id}")
		public List <Car> getlistCar() {
			return carsSer.getlistCar();
		}
	}
	


