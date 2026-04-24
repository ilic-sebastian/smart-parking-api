package com.example.smartparking;
import java.util.ArrayList;

public class ParkingService {

	private ParkingLot parkinglot;
	
	public ParkingService() {
		this.parkinglot = new ParkingLot();
	}
	
	 public ArrayList<Car> getAllCars() {
	        return parkinglot.getAllCars();
	    }

	    public Car getCarByID(int id) {
	    	Car car = parkinglot.findCarByID(id);
	        
	    	if(car == null) {
	    		throw new IllegalStateException("Car not found");
	    	}
	    	return car;
	    }

	    public Car addCar(Car car) {
	        boolean added = parkinglot.addCar(car);

	        if (!added) {
	            throw new IllegalStateException("Parkinglot is full");
	        }

	        return car;
	    }

	    public Car setSpeed(int id, int value) {
	        return parkinglot.setSpeedByID(id, value);
	    }

	    public boolean deleteCar(int id) {
	        boolean deleted = parkinglot.removeCarByID(id);

	        if (!deleted) {
	            throw new IllegalStateException("Car not found");
	        }

	        return deleted;
	    }

	    public int getCount() {
	        return parkinglot.getCount();
	    }
	}