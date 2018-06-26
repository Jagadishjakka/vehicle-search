package com.jakka.vehiclesearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakka.vehiclesearch.dao.VehicleDAO;
import com.jakka.vehiclesearch.model.Vehicle;

@Service
public class VehicleSerivceImpl implements VehicleService {

	VehicleDAO vehicleDao;

	@Autowired
	public void setVehicleDao(VehicleDAO vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

	public List<Vehicle> allVehicles() {
		return vehicleDao.allVehicles();
	}

	public void addVehicle(Vehicle vehicle) {
		vehicleDao.addVehicle(vehicle);
	}

	public void updateVehicle(Vehicle vehicle) {
		vehicleDao.updateVehicle(vehicle);
	}

	public void deleteVehicle(Vehicle vehicle) {
		vehicleDao.deleteVehicle(vehicle);
	}

	public Vehicle findVehiclebyId(Vehicle vehicle) {

		return vehicleDao.findVehiclebyId(vehicle);
	}

}
