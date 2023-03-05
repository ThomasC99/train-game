package loco;

import java.util.ArrayList;

import car.Car;

public class Loco {
    private double maxSpeed = -1;
    private double power;
    private double weight;
    private String name;
    private ArrayList<Car> cars;
    private double currentSpeed = 0;
    private double cost = 0;
    public Loco (double power, double weight, String name, double maxSpeed, double cost, int capacity) {
        this(power, weight, name, maxSpeed, cost);
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
    public double getMaxSpeed () {
        return maxSpeed;
    }
    public double getPower () {
        return power;
    }
    public void setPower (double power) {
        this.power = power;
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
    public void accelerate () {
        if (currentSpeed == 0) {
            this.currentSpeed += 1;
        } else {
            if (getPower() / (getWeight() * getCurrentSpeed()) > 1) {
                this.currentSpeed += 1;
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
}