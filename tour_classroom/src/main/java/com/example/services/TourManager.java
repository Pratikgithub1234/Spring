package com.example.services;

import java.util.List;
import com.example.entities.Tour;

public interface TourManager {

	List<Tour> getTours(String tour_name);
	
	void addTours(Tour tour);
	 List<Tour> getAllTours();
}