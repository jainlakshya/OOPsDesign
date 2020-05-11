package parking.Vehicles;

public interface Vehicle {

	//Gets name of the vehicle
	public String getName();
	public void setName(String name);
	
	//Gets the licence number
	public String getLicenceNumber();
	public void setLicenceNumber(String licenceNumber);
	
	//Gets the color
	public String getColor();
	public void setColor(String color);
	
	//Gets the type of vehicle - manual or automatic
	public String getDriveType();
	public void setDriveType(String driveType);
	
}

