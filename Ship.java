//Eden Moore
public class Ship {
	private String name;
	private String date;
	
	public Ship() {
		this.name = "unknown";
		this.date = "01/01/1990";
	}
	public Ship(String xName, String xDate) {
		this.setName(xName);
		this.setDate(xDate);
	}
	//accesssors
	public String getName() {
		return this.name;
	}
	public String getDate() {
		return this.date;
	}
	//mutators
	public void setName(String xName) {
		this.name = xName;
	}
	public void setDate(String xDate) {
		if(Integer.parseInt(xDate.substring(6)) >= 1990 && Integer.parseInt(xDate.substring(6)) <= 2019) {
			this.date = xDate;
		} else {
			System.out.println("Invalid date entered, resetting to 01/01/1990");
		}
	}
	public String toString() {
		return "Name: " + this.name + "\nLaunch date: " + this.date;
	}
}
