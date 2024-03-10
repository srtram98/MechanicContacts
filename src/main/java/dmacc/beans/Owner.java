package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 10, 2024
 */
@Entity
public class Owner {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String email;
	@Autowired
	private Vehicle vehicle;
	
	public Owner() {
		super();
		this.email = "stram@gmail.com";
	}

	public Owner(String name) {
		super();
		this.name = name;
	}

	public Owner(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public Owner(long id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", vehicle=" + vehicle
				+ "]";
	}

	
	
	
}
