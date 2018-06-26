package com.jakka.vehiclesearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jakka.vehiclesearch.model.Vehicle;
import com.jakka.vehiclesearch.service.VehicleService;

@RestController
public class VehicleController {

	private static final String success= "Success";
	private static final String failed= "Failed";

	@Autowired
	VehicleService vehicleService;

	@RequestMapping(value = "/vehicles", method = RequestMethod.GET, consumes ="application/json")
	public ResponseEntity<List<Vehicle>> listAllVehicles() {

		List<Vehicle> vehicleList = vehicleService.allVehicles();
		if (vehicleList == null) {
			return new ResponseEntity<List<Vehicle>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Vehicle>>(vehicleList, HttpStatus.OK);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes="application/json", produces="text/plain")
	public ResponseEntity<String> add(@RequestBody Vehicle vehicle) {

		try {
			vehicleService.addVehicle(vehicle);
			return new ResponseEntity<String>(success, HttpStatus.CREATED);
		} catch (DataAccessException dae) {
			return new ResponseEntity<String>(failed, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes="application/json", produces="text/plain")
	public ResponseEntity<String> edit(@RequestBody Vehicle vehicle) {
		try {
			vehicleService.updateVehicle(vehicle);
			return new ResponseEntity<String>(success, HttpStatus.OK);
		} catch (DataAccessException dae) {
			return new ResponseEntity<String>(failed, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes="application/json", produces="text/plain")
	public ResponseEntity<String> delete(@RequestBody Vehicle vehicle) {
		try {

			vehicleService.deleteVehicle(vehicle);
			return new ResponseEntity<String>(success, HttpStatus.OK);
		} catch (DataAccessException dae) {
			return new ResponseEntity<String>(failed, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/search/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Vehicle> search(@PathVariable("id") int id) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(id);
		Vehicle v = vehicleService.findVehiclebyId(vehicle);
		if (v == null) {
			return new ResponseEntity<Vehicle>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Vehicle>(v, HttpStatus.OK);

	}
}
