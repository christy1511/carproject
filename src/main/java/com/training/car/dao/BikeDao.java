package com.training.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.car.entity.Bike;
import com.training.car.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikesRepo;
	public String addBike(Bike bikes) {
		bikesRepo.save(bikes);
		return "successfully saved";
	}
	 public Bike getBikeById(int id) {
			return bikesRepo.findById(id).get();
		     }
	 public String deleteCarsById(int Id) {
		   bikesRepo.deleteById(Id);
	      return "Successfully deleted";
	   }
	
	 public String updateCar(Bike id) {
			bikesRepo.save(id);
			return "updated";
		}
	 public String listBike(List<Bike> bikes) {
	     bikesRepo.saveAll(bikes);
		return "Successfully saved";
	 }
	 public List<Bike>getlistBike(int id) {
	 return bikesRepo.findAll();
      
	 }
	
	}




