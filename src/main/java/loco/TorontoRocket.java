package loco;

import car.Car;

public class TorontoRocket extends Loco {
	public TorontoRocket () {
		super(3100000, 205000, "Toronto Rocket", 88/3.6);
		getCars().add(new Car(0, 1458, "", 0));
	}
}

/*
27 km	354 km/h

3 MW	52 km/h

0.5 km	80 km/h
1 km	114 km/h
2 km	161 km/h
3 km	198 km/h
4 km	228 km/h
5 km	255 km/h
6 km	279 km/h
7 km	302 km/h
8 km	322 km/h

d = 1/2 a t^2
2d = a t^2
2d / a = t^2
sqrt(2d / a) = t^2
*/