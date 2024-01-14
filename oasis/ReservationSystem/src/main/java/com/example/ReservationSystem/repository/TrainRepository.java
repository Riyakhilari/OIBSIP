package com.example.ReservationSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;

import com.example.ReservationSystem.model.*;


public interface TrainRepository extends  CrudRepository<Train, Long> {

	List<Train> findByTrainName(String trainName);
	Train findById(long id);
}