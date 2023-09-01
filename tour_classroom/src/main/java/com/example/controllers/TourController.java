package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Tour;
import com.example.services.TourManager;

@RestController
public class TourController {

	
	@Autowired
	private TourManager manager;
	
	@GetMapping("api/tours/{tour_name}")
	public List<Tour> getStudents(@PathVariable String tour_name)
	{
		return manager.getTours(tour_name);
	}
	
	@PostMapping("api/tour")
	public void addCourse(@RequestBody Tour tour)
	{
		manager.addTours(tour);
	}
}
