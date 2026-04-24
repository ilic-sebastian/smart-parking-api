package com.example.smartparking;

public class Car {
	private int id;
	private String brand;
	private String color;
	private int speed;
	private int seats;
	private static int count = 1;
	
	//Konstruktor
	public Car (String brand, String color, int speed, int seats) {
		this.id = count;
		count++;
		this.brand = brand;
		this.color = color;
		this.speed = speed;
		this.seats = seats;
	}
	
	//FÜR POST (JSON --> Objekt)
	public Car() {}
	
	public int getID() {
		return id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
}
