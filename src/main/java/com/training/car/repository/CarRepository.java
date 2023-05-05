package com.training.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.car.entity.Car;


	public interface CarRepository extends JpaRepository<Car,Integer> {

	}


