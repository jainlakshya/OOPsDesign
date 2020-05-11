package parking.parkingSpots;

public interface PaymentAlgorithm {
	
	public int paymentAlgo();
	
	//Payment indices to calculate payment
	public int getPaymentInd();
	public void setPaymentInd(int paymentInd);

}
