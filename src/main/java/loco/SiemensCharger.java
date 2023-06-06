package loco;

import java.util.ArrayList;
import car.Car;
import java.io.Serializable;
import java.util.Iterator;

public class SiemensCharger extends Loco implements Serializable {
	public SiemensCharger () {
		super(3000000, 120000, "Seimens Charger", 200/3.6, 0, 290000.0);
	}
}