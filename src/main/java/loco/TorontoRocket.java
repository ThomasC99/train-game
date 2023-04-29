package loco;

import car.Car;

public class TorontoRocket extends Loco {
	public TorontoRocket () {
		super(3100000, 205000, "Toronto Rocket", 88/3.6);
		getCars().add(new Car(0, 1458, "", 0));
	}
}

/*
578 km/h		33 MW
*/