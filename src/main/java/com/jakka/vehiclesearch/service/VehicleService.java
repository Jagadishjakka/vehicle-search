package com.jakka.vehiclesearch.service;

import java.util.List;

import com.jakka.vehiclesearch.model.Vehicle;

public interface VehicleService {

	public List<Vehicle> allVehicles();

	public void addVehicle(Vehicle vehicle);

	public void updateVehicle(Vehicle vehicle);

	public void deleteVehicle(Vehicle vehicle);

	public Vehicle findVehiclebyId(Vehicle vehicle);

}
