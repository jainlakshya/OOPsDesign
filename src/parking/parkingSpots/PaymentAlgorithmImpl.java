package parking.parkingSpots;

public abstract class PaymentAlgorithmImpl implements PaymentAlgorithm {
	
	private int paymentInd;

	public int getPaymentInd() {
		return paymentInd;
	}

	public void setPaymentInd(int paymentInd) {
		this.paymentInd = paymentInd;
	}

	public abstract int paymentAlgo();
	
}
