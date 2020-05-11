package parking.parkingSpots;

public class WeekdayPaymentAlgorithmImpl extends PaymentAlgorithmImpl {

	public int paymentAlgo() {
		return this.getPaymentInd()*10;
	}
	
}
