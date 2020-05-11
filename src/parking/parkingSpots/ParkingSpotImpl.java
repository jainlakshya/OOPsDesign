package parking.parkingSpots;

import parking.Vehicles.Vehicle;

public abstract class ParkingSpotImpl implements ParkingSpot{
	
	private int parkingId;
	private int parkingSpotDiameterinMeters;
	private int parkingLevel;
	private static boolean isParkingAvailable;
	private int priceInd;
	private Vehicle vehicleParked;

	public abstract int getParkingPrice(); 
	
	public Vehicle getVehicleParked() {
		return vehicleParked;
	}

	public void setVehicleParked(Vehicle vehicleParked) {
		this.vehicleParked = vehicleParked;
	}

	@Override
	public int getParkingSpotDiameterinMeters() {
		// TODO Auto-generated method stub
		return this.parkingSpotDiameterinMeters;
	}

	@Override
	public int getParkingLevel() {
		// TODO Auto-generated method stub
		return this.parkingLevel;
	}

	@Override
	public boolean isParkingAvailable() {
		// TODO Auto-generated method stub
		return ParkingSpotImpl.isParkingAvailable;
	}

	public void setParkingSpotDiameterinMeters(int parkingSpotDiameterinMeters) {
		this.parkingSpotDiameterinMeters = parkingSpotDiameterinMeters;
	}

	public void setParkingLevel(int parkingLevel) {
		this.parkingLevel = parkingLevel;
	}

	public void setParkingAvailable(boolean isParkingAvailable) {
		ParkingSpotImpl.isParkingAvailable = isParkingAvailable;
	}

	public int getPriceInd() {
		return priceInd;
	}

	public void setPriceInd(int priceInd) {
		this.priceInd = priceInd;
	}

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}


}
