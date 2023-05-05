package com.training.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.car.dao.CarDao;
import com.training.car.entity.Car;




@Service
public class CarService {
	@Autowired
	CarDao carsDao;
	public String addCar(Car cars) {
		return carsDao.addCar(cars);
	}
	public Car getCarsById(int id) {
		return carsDao.getCarsById(id);
	}
	 public String deleteCarsById(int id) {
			return carsDao.deleteCarsById(id);
		}
	 public String updateCar(Car id) {
			return carsDao.updateCar(id);
		}
	 public String listCar(List<Car> cars) {
			
			return carsDao.listCar(cars);
		}
	 public List <Car> getlistCar() {
			return carsDao.getlistCar();
	 }	
	
		
			
		}
	 

