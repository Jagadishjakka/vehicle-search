package com.jakka.vehiclesearch.dao;

import java.util.List;

import com.jakka.vehiclesearch.model.Vehicle;

public interface VehicleDAO {

	public List<Vehicle> allVehicles();
	public void addVehicle(Vehicle vehicle);
	public void updateVehicle(Vehicle vehicle);
	public void deleteVehicle(Vehicle vehicle);
	public Vehicle findVehiclebyId(Vehicle vehicle);
	
}
