package parking.parkingSpots;

import parking.Vehicles.Vehicle;

public interface ParkingSpot {

	//Get parking spot diameter
	public int getParkingSpotDiameterinMeters();
	public void setParkingSpotDiameterinMeters(int parkingSpotDiameterinMeters);
	
	//Parking level location
	public int getParkingLevel();
	public void setParkingLevel(int parkingLevel);
	
	//Parking price
	public int getParkingPrice(); 
	
	//Parking spot availability
	public boolean isParkingAvailable();
	public void setParkingAvailable(boolean isParkingAvailable);
	
	//Parking id
	public int getParkingId();
	public void setParkingId(int parkingId);
	
	//Vehicle Parked object
	public Vehicle getVehicleParked();
	public void setVehicleParked(Vehicle vehicleParked);
	
	
}
