package loco;

import car.Car;

public class Talent extends Loco {
	public Talent () {
		super(630000, 116000, "Bombardier Talent", 140/3.6);
		getCars().add(new Car(0, 285, "", 0));
	}
}