package parking.parkingSpots;

public class HandicapParkingSpot extends ParkingSpotImpl{

	
	public int getParkingPrice() {
		//Strategy Pattern
		int price = this.getPaymentAlgorithm().paymentAlgo()*5;
				
		return price;
	}

}
