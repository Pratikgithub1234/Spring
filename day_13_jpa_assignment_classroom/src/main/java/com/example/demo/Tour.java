package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tour")
public class Tour {
int tourId;
String tourName;
String tourType;
double cost;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
public int getTourId() {
	return tourId;
}
public void setTourId(int tourId) {
	this.tourId = tourId;
}

public String getTourName() {
	return tourName;
}
@Column
public void setTourName(String tourName) {
	this.tourName = tourName;
}

public String getTourType() {
	return tourType;
}
@Column
public void setTourType(String tourType) {
	this.tourType = tourType;
}

public double getCost() {
	return cost;
}
@Column
public void setCost(double cost) {
	this.cost = cost;
}

}
