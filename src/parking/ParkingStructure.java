package parking;

import java.util.List;

import parking.Vehicles.Vehicle;
import parking.Vehicles.cars.Vista;
import parking.parkingSpots.CommercialParkingSpot;
import parking.parkingSpots.HandicapParkingSpot;
import parking.parkingSpots.ParkingSpot;
import parking.parkingSpots.PublicParkingSpot;

public interface ParkingStructure {

	//Get all Vehicles parked
	public List<Vehicle> getListofVehicles();
	
	//Get Vehicle parked location
	public ParkingSpot getVehicleLocation(Vehicle vehicle);
	
	//Park a vehicle
	public String parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot, int payment);
	
	//Get available parking spots
	public List<ParkingSpot> getAvailableParkingSpots();
	
	//Unpark Vehicle
	public String unparkVehicle(Vehicle vehicle);
	
	//Commercial parking spots
	public List<CommercialParkingSpot> getCommercialParkingSpots();
	
	//Handicap parking spots
	public List<HandicapParkingSpot> getHandicapParkingSpots();
	
	//Public parking spots
	public List<PublicParkingSpot> getPublicParkingSpots();

	//Get all parking spots
	public List<ParkingSpot> getAllParkingSpots();
	public void setAllParkingSpots(List<ParkingSpot> allParkingSpots);
	
	//Get all Vistas
	public List<Vista> getAllVistas();
}
