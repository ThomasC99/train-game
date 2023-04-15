package loco;

import car.Car;

public class TurboTrain extends Loco {
	public TurboTrain () {
		super(1491000, 168300, "Turbo Train", 274/3.6);
		getCars().add(new Car(0, 322, "", 0));
	}
}