package parking.parkingSpots;

public class CommercialParkingSpot extends ParkingSpotImpl{

	
	public int getParkingPrice() {
		int price = this.getPriceInd()*20;
				
		return price;
	}

}
