//Eden Moore
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Ship Navigator!");
		String again = " ";
		Scanner info = new Scanner(System.in); //creating scanner
		do {
		System.out.println("Enter the name of the ship: "); //collecting ship info
		String name = info.nextLine();
		System.out.println("Enter it's launch date(mm/dd/yyyy): ");
		String date = info.nextLine();
		System.out.println("Is it a cruise ship or a cargo ship?");
		String type = info.nextLine(); //deciding which object to create
		if(type.equalsIgnoreCase("cruise ship")) { //collecting for if its a cruise ship
			System.out.println("Enter the ship's passenger capacity:");
			int capacity = info.nextInt();
			System.out.println("How many crew members are on board?");
			int crew = info.nextInt();
			Ship s1 = new CruiseShip(name, date, capacity, crew); //creating object
			System.out.println("Creating Cruise Ship!");
			System.out.println("Printing out Ship's details:");
			System.out.println(s1.toString()); //printing
		} else if(type.equalsIgnoreCase("cargo ship")) { //collecting for if its a cargo ship
			System.out.println("Enter the ship's tonnage(DWT):");
			int tonnage = info.nextInt();
			System.out.println("Enter maximum speed of the ship(mph):");
			int speed = info.nextInt();
			Ship s2 = new CargoShip(name, date, tonnage, speed); //creating object
			System.out.println("Creating Cargo Ship!");
			System.out.println("Printing out Ship's details:");
			System.out.println(s2.toString()); //printing
		} else {
			System.out.println("Invalid ship type entered!"); //catching errors
		}
		System.out.println("Do you want to contruct another ship? Enter 'yes' or 'no': ");
		info.nextLine(); //collecting if should run again
		again = info.nextLine();
		}while(again.equalsIgnoreCase("yes"));
	}

}
