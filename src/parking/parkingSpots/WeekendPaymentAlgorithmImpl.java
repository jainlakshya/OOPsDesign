package parking.parkingSpots;

public class WeekendPaymentAlgorithmImpl extends PaymentAlgorithmImpl {

	public int paymentAlgo() {
		return this.getPaymentInd()*5;
	}
	
}
