package com.training.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.car.entity.Car;
import com.training.car.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carsRepo;

	public String addCar(Car cars) {
		carsRepo.save(cars);
		return "successfully saved";
	}

	public Car getCarsById(int id) {
		return carsRepo.findById(id).get();
	}

	public String deleteCarsById(int Id) {
		carsRepo.deleteById(Id);
		return "Successfully deleted";
	}

	public String updateCar(Car id) {
		carsRepo.save(id);
		return "updated";
	}

	public String listCar(List<Car> cars) {
		carsRepo.saveAll(cars);
		return "Successfully saved";
	}
	public List<Car> getlistCar(){
		return carsRepo.findAll();
	}
}
