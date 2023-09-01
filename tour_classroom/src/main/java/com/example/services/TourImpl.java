package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Tour;
import com.example.repositories.TourRepository;

public class TourImpl implements TourManager {
	@Autowired
	private TourRepository repository;
	
	public List<Tour> getTours(String tour_name)
	{
		return repository.getTours(tour_name);
	}

	@Override
	public void addTours(Tour tour) {
		// TODO Auto-generated method stub
		repository.save(tour);
	}

	@Override
	public List<Tour> getAllTours() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
