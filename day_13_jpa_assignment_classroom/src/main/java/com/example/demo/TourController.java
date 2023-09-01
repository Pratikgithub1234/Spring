package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class TourController {
	@Autowired
	TourRepository trepository;
	@GetMapping("new_tour")
	public ModelAndView before()
	{
		Tour t=new Tour();
		return new ModelAndView("Tour","mytour",t);
	}
	@GetMapping("view_tour")
	public String getTour(HttpServletRequest request)
	{
		List<Tour> tourlist=trepository.findAll();
		request.setAttribute("mylist", tourlist);
		return "View";
	}
	@PostMapping("new_tour")
	public String afterSubmit(Tour tour)
	{
		trepository.save(tour);
		return "success";
	}
}
