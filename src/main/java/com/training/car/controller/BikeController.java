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

import com.training.car.entity.Bike;
import com.training.car.service.BikeService;




@RestController
@RequestMapping(value="/Bike")
public class BikeController {
	@Autowired
	BikeService BikesSer;
	@PostMapping(value = "/addcar")
	public String addBike(@RequestBody Bike bikes) {
		return BikesSer.addBike(bikes);

	}
	@GetMapping(value = "/get/{id}")
	public Bike getBikesById(@PathVariable int id) {
		return BikesSer.getBikesById(id);
	}
	@DeleteMapping(value = "/delete/{id}")
	public String deleteBikeById(@PathVariable int id) {
		  return BikesSer.deleteBikesById(id);
	  }
	@PutMapping(value = "/update/{id}")
	public String updateBike(@RequestBody Bike id) {
		  return BikesSer.updateBike(id);
	  }
	 @PostMapping(value = "/list")
	  public String listBike(@RequestBody List<Bike> bikes) {
		  return BikesSer.listBike(bikes);
	  }
	
   @GetMapping(value="/getlistBike/{id}")
	public List <Bike> getlistBike(@PathVariable int id) {
		return BikesSer.getlistBike(id);
	}
	}


