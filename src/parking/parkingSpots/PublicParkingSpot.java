package parking.parkingSpots;

public class PublicParkingSpot extends ParkingSpotImpl{

	
	public int getParkingPrice() {
		int price = this.getPriceInd()*10;
				
		return price;
	}

}
