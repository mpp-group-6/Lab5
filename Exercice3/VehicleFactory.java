package Lesson5;

public class VehicleFactory {
	

	public static Vehicle getVehicle(String v) {
		Vehicle vehicle;
		
		switch (v) {
			case "Car" : vehicle=new Car();
						 break;
			case "Bus" : vehicle=new Bus();
					 	 break;
			case "Truck" : vehicle=new Truck();
							break;
			case "ElectricCar" : vehicle=new ElectricCar();
								 break;
			default :   System.out.println("<"+v+"> is not a specific type of Vehicle");
						vehicle=null;
						break;
		}
		
		return vehicle;
		
	}

}
