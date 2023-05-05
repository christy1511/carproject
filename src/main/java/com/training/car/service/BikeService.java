package com.training.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.car.dao.BikeDao;
import com.training.car.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bikesDao;
	public String addBike(Bike bikes) {
		return bikesDao.addBike(bikes);
	}
	public Bike getBikesById(int id) {
		return bikesDao.getBikeById(id);
	}
	 public String deleteBikesById(int id) {
			return bikesDao.deleteCarsById(id);
		}
	 public String updateBike(Bike id) {
			return bikesDao.updateCar(id);
		}
	 public String listBike(List<Bike> bikes) {
			
			return bikesDao.listBike(bikes);
		}
	 public List <Bike> getlistBike(int id) {
			return bikesDao.getlistBike(id);
		}
}



