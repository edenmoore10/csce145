//Eden Moore
public class CargoShip extends Ship{
	private int tonnage;
	private int speed;
	public CargoShip() {
		super();
		this.tonnage = 1;
		this.speed = 1;
	}
	public CargoShip(String xName, String xDate, int xTonnage, int xSpeed) {
		super(xName, xDate);
		this.setTonnage(xTonnage);
		this.setSpeed(xSpeed);
	}
	//accessors
	public int getTonnage() {
		return this.tonnage;
	}
	public int getSpeed() {
		return this.speed;
	}
	//mutators
	public void setTonnage(int xTonnage) {
		if(xTonnage > 0) {
			this.tonnage = xTonnage;
		} else {
			System.out.println("Invalid tonnage entered!");
		}
	}
	public void setSpeed(int xSpeed) {
		if(xSpeed > 0) {
			this.speed = xSpeed;
		} else {
			System.out.println("Invalid speed entered!");
		}
	}
	public String toString() {
		return "Name: " + this.getName() + "\nTonnage: " + this.tonnage + "DWT \nMaximum Speed: " + this.speed + "mph";
	}
}
