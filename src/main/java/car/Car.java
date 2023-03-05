package car;

import java.util.ArrayList;

import job.Job;

public class Car {
    private double weight;
    private int capacity;
    private String name;
    private ArrayList <Job> jobs;
    public double cost;
    public Car (double weight, int capacity, String name, double cost) {
        this.weight = weight;
        this.capacity = capacity;
        this.name = name;
        this.jobs = new ArrayList <Job> ();
        this.cost = cost;
    }
    public double getWeight () {
        return weight;
    }
    public int getCapacity () {
        return capacity;
    }
    public double getCapacityUsed () {
        return jobs.size();
    }
    public String getName () {
        return name;
    }
    public boolean addJob (Job job) {
        if (jobs.size() == getCapacity()) {
            return false;
        } else {
            jobs.add(job);
            return true;
        }
    }
    public ArrayList <Job> getJobs () {
        return jobs;
    }
}