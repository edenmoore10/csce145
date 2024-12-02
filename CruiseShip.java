//Eden Moore
public class CruiseShip extends Ship{
	private int capacity;
	private int crew;
	public CruiseShip() {
		super();
		this.capacity = 1;
		this.crew = 1;
	}
	public CruiseShip(String xName, String xDate, int xCapacity, int xCrew) {
		super(xName, xDate);
		this.setCapacity(xCapacity);
		this.setCrew(xCrew);
	}
	//accessors
	public int getCapacity() {
		return this.capacity;
	}
	public int getCrew() {
		return this.crew;
	}
	//mutators
	public void setCapacity(int xCapacity) {
		if(xCapacity > 0) {
			this.capacity = xCapacity;
		} else {
			System.out.println("Invalid capacity entered!");
		}
	}
	public void setCrew(int xCrew) {
		if(xCrew > 0) {
			this.crew = xCrew;
		} else {
			System.out.println("Invalid crew number entered!");
		}
	}
	public String toString() {
		return "Name: " + this.getName() + "\nPassenger Capacity: " + this.capacity + "\nCrew: " + this.crew;
	}
}
