package parking.parkingSpots;

public class PublicParkingSpot extends ParkingSpotImpl{

	
	public int getParkingPrice() {
		//Strategy Pattern
		int price = this.getPaymentAlgorithm().paymentAlgo()*10;
				
		return price;
	}

}
