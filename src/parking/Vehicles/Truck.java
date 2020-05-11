package parking.Vehicles;

public abstract class Truck implements Vehicle{
	
	private boolean isCommercial;
	
	public String getCarType() {
		if(this.isCommercial) {
			return "Commercial";
		}
		return "Private";
	}
	

}
