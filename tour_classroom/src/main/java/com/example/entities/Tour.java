package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tour {
int tour_id;
String tour_name;
double cost;
int time;


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getTour_id() {
	return tour_id;
}
public void setTour_id(int tour_id) {
	this.tour_id = tour_id;
}


public String getTour_name() {
	return tour_name;
}
public void setTour_name(String tour_name) {
	this.tour_name = tour_name;
}


public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}


public int getTime() {
	return time;
}
public void setTime(int time) {
	this.time = time;
}
}
