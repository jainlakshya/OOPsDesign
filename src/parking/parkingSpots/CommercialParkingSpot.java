package parking.parkingSpots;

public class CommercialParkingSpot extends ParkingSpotImpl{

	
	public int getParkingPrice() {
		//Strategy Pattern
		int price = this.getPaymentAlgorithm().paymentAlgo()*20;
				
		return price;
	}

}
