package com.jakka.vehiclesearch.model
;

public class Vehicle {

	int vehicleId;
	String vehicleType;
	int vehicleYear;
	String vehicleMake;
	String vehicleModel;
	String vehicleFuel;
	int vehicleMiles;
	
	public Vehicle() {
	}
	
	public Vehicle(int vehicleId) {
		this.vehicleId=vehicleId;
	}
	
	public Vehicle(int vehicleId, String vehicleType, int vehicleYear, String vehicleMake, String vehicleModel,
			String vehicleFuel, int vehicleMiles) {
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleYear = vehicleYear;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleFuel = vehicleFuel;
		this.vehicleMiles = vehicleMiles;
	}
	
	

	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleYear() {
		return vehicleYear;
	}
	public void setVehicleYear(int vehicleYear) {
		this.vehicleYear = vehicleYear;
	}
	public String getVehicleMake() {
		return vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleFuel() {
		return vehicleFuel;
	}
	public void setVehicleFuel(String vehicleFuel) {
		this.vehicleFuel = vehicleFuel;
	}
	public int getVehicleMiles() {
		return vehicleMiles;
	}
	public void setVehicleMiles(int vehicleMiles) {
		this.vehicleMiles = vehicleMiles;
	}
	
	
}
