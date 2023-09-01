package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer>

{
	@Query(value="select * from tour where where tour_id=(select tourid from tour where tname=:tname));",nativeQuery = true)
	List<Tour> getTours(@Param("tour_name")String tour_name);
}

