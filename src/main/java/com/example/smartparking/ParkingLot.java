package com.example.smartparking;

import java.util.ArrayList;

public class ParkingLot {
	private ArrayList<Car> cars;

	public ParkingLot() {
		cars = new ArrayList<>();
	}

	public boolean addCar(Car car) {
		if (cars.size() < 5) {
			cars.add(car);
			return true;
		}
		return false;
	}

	public boolean removeCarByID(int id) {
		return cars.removeIf(c -> c.getID() == id);
	}

	public Car findCarByID(int id) {
		for (Car car : cars) {
			if (car.getID() == id) {
				return car;
			}
		}
		return null;
	}

	public ArrayList<Car> getAllCars() {
		return cars;
	}

	public Car setSpeedByID(int id, int value) {

		for (Car car : cars) {

			if (car.getID() == id) {
				car.setSpeed(value);
				return car;
			}
		}
		throw new IllegalStateException("Car not found");

	}

	public int getCount() {
		return cars.size();

	}
}
