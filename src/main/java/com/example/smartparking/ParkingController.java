package com.example.smartparking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.ArrayList;

@RestController
public class ParkingController {

	private ParkingService parkingService;

	public ParkingController() {
		parkingService = new ParkingService();
		
		parkingService.addCar(new Car("BMW", "RED", 180, 4 ));
		parkingService.addCar(new Car("AUDI", "BLACK", 200, 5 ));
		parkingService.addCar(new Car("VW", "GREY", 100, 7 ));
		
	}
	
	

	@GetMapping("/cars")
	public ArrayList<Car> getAllCars() {
		return parkingService.getAllCars();
	}

	@GetMapping("/cars/{id}")
	public Car getCarByID(@PathVariable int id) {
		try {
			return parkingService.getCarByID(id);
		} catch (IllegalStateException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PostMapping("/cars")
	public Car addCar(@RequestBody Car car) {
		try {
			return parkingService.addCar(car);
		} catch (IllegalStateException e) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
		}
	}

	@PutMapping("/cars/{id}/speed/{value}")
	public Car setSpeedByID(@PathVariable int id, @PathVariable int value) {
		try {
			return parkingService.setSpeed(id, value);
		} catch (IllegalStateException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/cars/{id}")
	public boolean deleteCarByID(@PathVariable int id) {
		try {
			return parkingService.deleteCar(id);
		} catch (IllegalStateException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping("/cars/count")
	public int countCars() {
		return parkingService.getCount();
	}
}
