package parking;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import parking.Vehicles.Vehicle;
import parking.Vehicles.cars.Vista;
import parking.parkingSpots.CommercialParkingSpot;
import parking.parkingSpots.HandicapParkingSpot;
import parking.parkingSpots.ParkingSpot;
import parking.parkingSpots.PublicParkingSpot;

public class ParkingStructureImpl implements ParkingStructure{
	private Hashtable<Vehicle, ParkingSpot> h = new Hashtable<Vehicle, ParkingSpot>();
	private List<ParkingSpot> allParkingSpots = new ArrayList<ParkingSpot>();
	
	//Singleton starts
	private static ParkingStructureImpl ps = null;
	private ParkingStructureImpl() {}
	
	public static ParkingStructureImpl getInstance() {
		if(null==ps) {
			return new ParkingStructureImpl();
		}else {
			return ps;
		}
		
	}

	//Singleton finishes

	@Override
	public List<Vehicle> getListofVehicles() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		for(ParkingSpot parkingSpot:this.getAllParkingSpots()) {
			vehicles.add(parkingSpot.getVehicleParked());
		}
		return vehicles;
	}

	public List<ParkingSpot> getAllParkingSpots() {
		// TODO Auto-generated method stub
		return this.allParkingSpots;
	}

	@Override
	public ParkingSpot getVehicleLocation(Vehicle vehicle) {
		return this.h.get(vehicle);
	}

	@Override
	public String parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot, int payment) {
		if(parkingSpot.getParkingPrice()==payment) {
			this.h.put(vehicle, parkingSpot);
			parkingSpot.setParkingAvailable(false);
			return "success";
		}

		
		return "Failed";
	}

	@Override
	public List<ParkingSpot> getAvailableParkingSpots() {
		List<ParkingSpot> availableParkingSpots = new ArrayList<ParkingSpot>();
		for (ParkingSpot ParkingSpot:this.allParkingSpots) {
			if(ParkingSpot.isParkingAvailable()) {
				availableParkingSpots.add(ParkingSpot);
			}
		}

		return availableParkingSpots;
	}

	@Override
	public String unparkVehicle(Vehicle vehicle) {
		try {
			ParkingSpot ParkingSpot = h.get(vehicle);
			ParkingSpot.setParkingAvailable(true);
			h.remove(vehicle);
			return "success";
		}catch(Exception e) {
			return "Failure";
		}
		
	}

	@Override
	public List<CommercialParkingSpot> getCommercialParkingSpots() {
		List<CommercialParkingSpot> allCommercialParkingSpots = new ArrayList<CommercialParkingSpot>();

		for(ParkingSpot ParkingSpot:this.allParkingSpots) {
			if(ParkingSpot instanceof CommercialParkingSpot) {
				allCommercialParkingSpots.add((CommercialParkingSpot)ParkingSpot);
			}
		}
		return allCommercialParkingSpots;
	}

	@Override
	public List<HandicapParkingSpot> getHandicapParkingSpots() {
		List<HandicapParkingSpot> allHandicapParkingSpots = new ArrayList<HandicapParkingSpot>();

		for(ParkingSpot ParkingSpot:this.allParkingSpots) {
			if(ParkingSpot instanceof HandicapParkingSpot) {
				allHandicapParkingSpots.add((HandicapParkingSpot) ParkingSpot);
			}
		}
		return allHandicapParkingSpots;
	}

	@Override
	public List<PublicParkingSpot> getPublicParkingSpots() {
		List<PublicParkingSpot> allPublicParkingSpots = new ArrayList<PublicParkingSpot>();

		for(ParkingSpot ParkingSpot:this.allParkingSpots) {
			if(ParkingSpot instanceof PublicParkingSpot) {
				allPublicParkingSpots.add((PublicParkingSpot) ParkingSpot);
			}
		}
		return allPublicParkingSpots;
	}

	public void setAllParkingSpots(List<ParkingSpot> allParkingSpots) {
		this.allParkingSpots = allParkingSpots;
	}

	@Override
	public List<Vista> getAllVistas() {
		List<Vista> vistas = new ArrayList<Vista>();
		List<ParkingSpot> ParkingSpots = new ArrayList<>(this.h.values());
		for(ParkingSpot ParkingSpot:ParkingSpots) {
			if(ParkingSpot.getVehicleParked() instanceof Vista) {
				vistas.add((Vista)ParkingSpot.getVehicleParked());
			}
		}
		return vistas;
	}
	
	
	
}
