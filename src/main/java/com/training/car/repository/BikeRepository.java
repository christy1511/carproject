package com.training.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.car.entity.Bike;



	public interface BikeRepository extends JpaRepository<Bike,Integer> {

	}



