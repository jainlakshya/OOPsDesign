package parking.parkingSpots;

public class HandicapParkingSpot extends ParkingSpotImpl{

	
	public int getParkingPrice() {
		int price = this.getPriceInd()*5;
				
		return price;
	}

}
