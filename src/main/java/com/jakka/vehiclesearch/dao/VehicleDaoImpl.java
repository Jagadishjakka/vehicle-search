package com.jakka.vehiclesearch.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jakka.vehiclesearch.model.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Vehicle> allVehicles() {
		String sql = "SELECT  * FROM VEHICLE_INVENTORY";
		List<Vehicle> vehicles = jdbcTemplate.query(sql, new VehicleMapper());
		return vehicles.size() > 0 ? vehicles : null;
	}

	public void addVehicle(Vehicle vehicle) {

		String sql = "insert into VEHICLE_INVENTORY values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { vehicle.getVehicleId(), vehicle.getVehicleType(), vehicle.getVehicleYear(),
						vehicle.getVehicleMake(), vehicle.getVehicleModel(), vehicle.getVehicleFuel(),
						vehicle.getVehicleMiles() });

	}

	public void updateVehicle(Vehicle vehicle) {
		String sql = "UPDATE  VEHICLE_INVENTORY SET VEHICLE_TYPE=?,	VEHICLE_YEAR=?,	VEHICLE_MAKE=?,	VEHICLE_MODEL=?, VEHICLE_FUEL=?, VEHICLE_MILES=? WHERE VEHICLE_ID=? ";
		jdbcTemplate.update(sql,
				new Object[] { vehicle.getVehicleType(), vehicle.getVehicleYear(), vehicle.getVehicleMake(),
						vehicle.getVehicleModel(), vehicle.getVehicleFuel(), vehicle.getVehicleMiles(),
						vehicle.getVehicleId() });

	}

	public void deleteVehicle(Vehicle vehicle) {
		String sql = "DELETE FROM VEHICLE_INVENTORY WHERE VEHICLE_ID= '" + vehicle.getVehicleId() + "'";
		jdbcTemplate.update(sql);

	}

	public Vehicle findVehiclebyId(Vehicle vehicle) {
		String sql = "SELECT  * FROM VEHICLE_INVENTORY WHERE VEHICLE_ID='" + vehicle.getVehicleId() + "'";
		List<Vehicle> vehicles = jdbcTemplate.query(sql, new VehicleMapper());
		return vehicles.size() > 0 ? vehicles.get(0) : null;
	}

	class VehicleMapper implements RowMapper<Vehicle> {
		public Vehicle mapRow(ResultSet rs, int arg1) throws SQLException {
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleId(rs.getInt("VEHICLE_ID"));
			vehicle.setVehicleMake(rs.getString("VEHICLE_MAKE"));
			vehicle.setVehicleModel(rs.getString("VEHICLE_MODEL"));
			vehicle.setVehicleType(rs.getString("VEHICLE_TYPE"));
			vehicle.setVehicleMiles(rs.getInt("VEHICLE_MILES"));
			vehicle.setVehicleFuel(rs.getString("VEHICLE_FUEL"));
			vehicle.setVehicleYear(rs.getInt("VEHICLE_YEAR"));
			return vehicle;
		}
	}
}
