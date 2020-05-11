package parking.Vehicles;

public abstract class Car implements Vehicle{
	
	private boolean isElectric;
	
	private String name;
	private String licenceNumber;
	private String color;
	private String driveType;
	
	
	public String getDriveType() {
		return driveType;
	}
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public String getType() {
		if(this.isElectric) {
			return "Electic";
		}
		return "Gas";
	}
	

}
