package ex04.quiz;

public class Car {
	
	private IBattery battery;
	
	public Car(IBattery battery) {
		this.battery = battery;
	}
	
	//get
	public IBattery getBattery() {
		return battery;
	}
}

