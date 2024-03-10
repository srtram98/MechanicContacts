package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 10, 2024
 */
@Embeddable
public class Vehicle {

	private String year;
	private String make;
	private String model;
	private String color;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String year, String make, String model, String color) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", make=" + make + ", model=" + model + ", color=" + color + "]";
	}
	
	
}
