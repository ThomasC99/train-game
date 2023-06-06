package loco;

import java.util.ArrayList;
import car.Car;
import java.io.Serializable;
import java.util.Iterator;

public class Loco implements Serializable {
    
	private double maxSpeed = -1;
    private double power;
    private double weight;
    private String name;
    private ArrayList<Car> cars;
    private double currentSpeed = 0;
    private double cost = 0;
	private double tracktiveEffort;
	
    public Loco (double power, double weight, String name, double maxSpeed, double cost,
		int capacity) {
        this(power, weight, name, maxSpeed, cost);
    }
	
	public Loco (double power, double weight, String name, double maxSpeed, double cost,
		double tracktiveEffort) {
		this.tracktiveEffort = tracktiveEffort;
		this.power = power;
        this.weight = weight;
        this.name = name;
        this.cars = new ArrayList<Car>();
		this.cost = cost;
		this.maxSpeed = maxSpeed;
	}
    
	public Loco (double power, double weight, String name, double maxSpeed, double cost) {
        this(power, weight, name, maxSpeed);
        this.cost = cost;
    }
    
	public Loco (double power, double weight, String name) {
        this.power = power;
        this.weight = weight;
        this.name = name;
        this.cars = new ArrayList<Car>();
    }
    
	public Loco (double power, double weight, String name, double maxSpeed) {
        this(power, weight, name);
        this.maxSpeed = maxSpeed;
    }
	
	public Loco () {
		this.power = 0;
		this.weight = 0;
		this.name = "";
		this.cars = new ArrayList <> ();
		this.tracktiveEffort = 0;
	}
    
	public double getMaxSpeed () {
        return maxSpeed;
    }
    
	public double getPower () {
        return power;
    }
    
	public void setPower (double power) {
        this.power = power;
    }
	
	public void setWeight (double weight) {
		this.weight = weight;
	}
    
	public double getWeight () {
        if (getCars().size() > 0) {
            double total_weight = weight;
            for (int i = 0; i < getCars().size(); i ++) {
                total_weight += getCars().get(i).getWeight();
            }
            return total_weight;
        } else {
            return weight;
        }
    }
    
	public String getName () {
        return name;
    }
    
	public ArrayList <Car> getCars () {
        return cars;
    }
    
	public void addCar (Car car) {
        cars.add(car);
    }
    
	public double getCurrentSpeed () {
        return currentSpeed;
    }
	
	private double maximumAcceleration () {
		if (getTracktiveEffort() == 0) return 1;
		return getTracktiveEffort() / getWeight();
	}
    
	public void accelerate () {
        if (currentSpeed == 0) {
            this.currentSpeed += maximumAcceleration();
        } else {
            if (getPower() / (getWeight() * getCurrentSpeed()) > maximumAcceleration()) {
                this.currentSpeed += maximumAcceleration();
            } else {
                this.currentSpeed += getPower() / (getWeight() * getCurrentSpeed());
            }
        }
        if (getCurrentSpeed() > getMaxSpeed() && getMaxSpeed() > 0) {
            this.currentSpeed = getMaxSpeed();
        }
    }
    
	public void decelerate () {
        if (currentSpeed > 1) {
            setSpeed(currentSpeed - 1);
        } else {
            setSpeed(0);
        }
    }
    
	public double stoppingDistance () {
        return 0.5 * Math.pow(getCurrentSpeed(), 2) / 1000;
    }
    
	public void setSpeed (double speed) {
        this.currentSpeed = speed;
    }
    
	public void setMaxSpeed (double speed) {
        this.maxSpeed = speed;
    }
    
	public double getCost () {
        return cost;
    }
	
	public int getCapacity () {
		Iterator <Car> iter = getCars().iterator();
		int capacity = 0;
		while (iter.hasNext()) {
			capacity += iter.next().getCapacity();
		}
		return capacity;
	}
	
	public int getCapacityUsed () {
		int capacityUsed = 0;
		Iterator <Car> iter = getCars().iterator();
		while (iter.hasNext()) {
			capacityUsed += iter.next().getCapacityUsed();
		}
		return capacityUsed;
	}
	
	public double getTracktiveEffort () {
		return tracktiveEffort;
	}
	
	public void setTracktiveEffort (double tracktiveEffort) {
		this.tracktiveEffort = tracktiveEffort;
	}
}
