package Lesson5;

public class ElectricCar implements Vehicle{

	public ElectricCar() {
		startEngine();
	}
	
	public void startEngine() {
		System.out.println("ElectricCar's engine started");
	}

}
