package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.*;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;



import car.*;



import graph.*;



import job.Job;



import loco.*;

import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.ext.JGraphXAdapter;

import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.layout.mxIGraphLayout;
import com.mxgraph.util.mxCellRenderer;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;

/*
Conventional : < 130 km/h                   2.2 MW
Higher Speed : 130 km/h - 200 km/h          3.4 MW
High Speed : 200 km/h - 310 km/h            5.2 MW
Very High Speed : 310 km/h - 500 km/h       8.4 MW
Ultra High Speed : > 500 km/h
Record : 578 km/h                           9.7 MW
1,440 km/h                                  24 MW
 */

public class Main {
    static Loco l;
    static Scanner input = new Scanner (System.in);
    static String location;
    static double money = 0;
    public static Pseudograph <String, DefaultWeightedEdge> master;
    public static Pseudograph <String, DefaultWeightedEdge> graph;
    public static DijkstraShortestPath <String, DefaultWeightedEdge> path;
    static ArrayList <Car> toBuy = new ArrayList <> ();
    public static void main (String [] args) throws Exception {
        // graph = World.world();
        master = World.world();
	// JGraphXAdapter <String, DefaultWeightedEdge> graphAdapter = new JGraphXAdapter <> (master);
	// mxIGraphLayout layout = new mxCircleLayout (graphAdapter);
	// layout.execute(graphAdapter.getDefaultParent());
	// BufferedImage image = mxCellRenderer.createBufferedImage(graphAdapter, null, 2, Color.WHITE, true, null);
	// File img = new File ("../../../../graph.png");
	// ImageIO.write(image, "PMG", img);

        graph = new Pseudograph <> (DefaultWeightedEdge.class);
        location = "Ottawa";

        Set <DefaultWeightedEdge> edges = master.edgesOf(location);
        Iterator <DefaultWeightedEdge> iter = edges.iterator();
        DefaultWeightedEdge edge = iter.next();
        graphUtils.addEdge(graph, master.getEdgeSource(edge), master.getEdgeTarget(edge), master.getEdgeWeight(edge));

        master.removeEdge(edge);
        Iterator <String> iter2 = master.vertexSet().iterator();
        ArrayList <String> remove = new ArrayList <> ();
        while (iter2.hasNext()) {
            String vertex = iter2.next();
            if (master.edgesOf(vertex).size() == 0) {
                remove.add(vertex);
            }
        }
        for (int i = 0; i < remove.size(); i++) {
            master.removeVertex(remove.get(i));
        }

        path = new DijkstraShortestPath <String, DefaultWeightedEdge> (graph);
        l = new RegionalLoco();
        l.addCar(new GenericRegional());
        mainMenu();
    }
    static void mainMenu () {
        while (true) {
            System.out.println("1. Load passengers");
            System.out.println("2. Depart");
            System.out.println("3. Store");
            System.out.println("4. Manifest");
            System.out.println("5. Quit");
            int choice = 0;
            do {
                try {
                    choice = input.nextInt();
                } catch (InputMismatchException e) {
                }
            } while (choice < 1 || choice > 5);
            System.out.println("\n\n");
            if (choice == 1) {
                loadPassengers();
                System.out.println("\n\n");
            } else if (choice == 2) {
                departures();
            } else if (choice == 3) {
                store();
            } else if (choice == 4) {
                manifest();
                System.out.println("\n\n");
                mainMenu();
            } else if (choice == 5) {
                break;
            }
        }
    }
    static void departures () {
        System.out.println("1. Stop in " + location);
        ArrayList <DefaultWeightedEdge> options = new ArrayList <> (graph.edgesOf(location));
        for (int i = 0; i < options.size(); i++) {
            if (graph.getEdgeTarget(options.get(i)) == location) {
                System.out.println((i + 2) + ". Head to " + graph.getEdgeSource(options.get(i)) + " (" + graph.getEdgeWeight(options.get(i)) + " km)");
            } else {
                System.out.println((i + 2) + ". Head to " + graph.getEdgeTarget(options.get(i)) + " (" + graph.getEdgeWeight(options.get(i)) + " km)");
            }
        }
        Menu.reccomendPath(jobSummary(), location, path);
        int choice = 0;
        do {
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
            }
        } while (choice < 1 && choice > (1 + options.size()));
        System.out.println("\n\n");
        if (choice == 1) {
            l.setSpeed(0);
            completeJobs();
        } else {
            choice -= 2;
            Util.travel(graph.getEdgeWeight(options.get(choice)), l);
            System.out.println("\n\n");
            if (graph.getEdgeTarget(options.get(choice)) == location) {
                location = graph.getEdgeSource(options.get(choice));
            } else {
                location = graph.getEdgeTarget(options.get(choice));
            }
            departures();
        }
    }
    static void loadPassengers () {
        for (int i = 0; i < l.getCars().size(); i++) {
            boolean result = true;
            do {
                Job job = Job.generateRandomJob(location);
                result = l.getCars().get(i).addJob(job);
                if (result) {
                    System.out.println("Added passenger going to " + job.getDestination());
                }
            } while (result);
        }
    }
    static void completeJobs () {
        double earned = 0;
        int departed = 0;
        for (int i = 0; i < l.getCars().size(); i++) {
            ArrayList <Job> delete = new ArrayList<>();
            for (int j = 0; j < l.getCars().get(i).getJobs().size(); j++) {
                if (l.getCars().get(i).getJobs().get(j).getDestination() == location) {
                    delete.add(l.getCars().get(i).getJobs().get(j));
                    earned += l.getCars().get(i).getJobs().get(j).getValue();
                    departed++;
                }
            }
            l.getCars().get(i).getJobs().removeAll(delete);
        }
        System.out.println(departed + " passenger departed for a total revenue of " + earned);
        System.out.println("\n\n");
        money += earned;
    }
    static void manifest () {
        int capacity = 0;
        int capacityUsed = 0;
        double totalWeight = l.getWeight();
        HashMap <String, Integer> map = jobSummary();
        for (int i = 0; i < l.getCars().size(); i++) {
            Car car = l.getCars().get(i);
            capacity += car.getCapacity();
            capacityUsed += car.getJobs().size();
        }
        System.out.println("Money         : " + money);
        System.out.println("Locomotive    : " + l.getName());
        if (l.getPower() < 1000) {
            System.out.println("Power         : " + l.getPower() + " W");
        } else if (1000 <= l.getPower() && l.getPower() < 1000000) {
            System.out.println("Power         : " + (int)(l.getPower() / 1000) + " kW");
        } else {
            System.out.println("Power         : " + (int)(l.getPower() / 1000000) + " MW");
        }
        if (totalWeight < 1000) {
            System.out.println("Total weight    : " + totalWeight + " kg");
        } else {
            System.out.println(String.format("Total weight : %.1f t", totalWeight / 1000));
        }
        System.out.println("Capacity      : " + capacity);
        System.out.println("Capacity used : " + capacityUsed);
        System.out.println();
        Iterator <String> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            String const1 = iter.next();
            System.out.println(const1 + " : " + map.get(const1));
        }
    }
    static void store () {
        while (true) {
            ArrayList <DefaultWeightedEdge> edges = new ArrayList <> ();
            Iterator <String> v = graph.vertexSet().iterator();
            while (v.hasNext()) {
                String v_tmp = v.next();
                if (master.containsVertex(v_tmp)) {
                    Set <DefaultWeightedEdge> v_edges = master.edgesOf(v_tmp);
                    if (v_edges.size() > 0) {
                        edges.addAll(v_edges);
                    }
                }
            }

            System.out.println("Money : " + money);
            System.out.println();
            System.out.println("1. Upgrade loco power");
            if (l.getPower() < 1000) {
                System.out.println("   Current Power : " + l.getPower() + " W");
                System.out.println("   After upgrade : " + (l.getPower() * 1.01));
            } else if (1000 <= l.getPower() && l.getPower() < 1000000) {
                System.out.println("   Current Power : " + (int)(l.getPower() / 1000) + " kW");
                System.out.println("   After upgrade : " + (int)(l.getPower() * 1.01 / 1000) + " kW");
            } else {
                System.out.println("   Current Power : " + (int)(l.getPower() / 1000000) + " MW");
                System.out.println("   After upgrade : " + (int)(l.getPower() * 1.01 / 1000000) + " MW");
            }
            System.out.println("   Cost          : " + (l.getPower() / 1000));
            System.out.println("2. Upgrade loco maximum speed");
            System.out.println("   Current       : " + (int)(l.getMaxSpeed() * 3.6));
            System.out.println("   Cost          : " + (int)l.getMaxSpeed());
            System.out.println("   After Upgrade : " + (int)((l.getMaxSpeed() + 1) * 3.6));
            for (int i = 0; i < toBuy.size(); i++) {
                System.out.println((i + 3) + ". Buy new " + toBuy.get(i).getName());
                System.out.println("   Cost     : " + toBuy.get(i).cost);
                if (toBuy.get(i).getWeight() < 1000) {
                    System.out.println("   Weight   : " + toBuy.get(i).getWeight() + " kg");
                } else {
                    System.out.println("   Weight   : " + toBuy.get(i).getWeight() + " t");
                }
                System.out.println("   Capacity : " + toBuy.get(i).getCapacity());
            }
            for (int i = 0; i < edges.size(); i++) {
                System.out.println((i + 3 + toBuy.size()) + ". Buy route : " + master.getEdgeSource(edges.get(i)) + " - " +
                    master.getEdgeTarget(edges.get(i)));
                System.out.println("   Cost   : " + master.getEdgeWeight(edges.get(i)) * 100);
                System.out.println("   Length : " + master.getEdgeWeight(edges.get(i)) + " km");
            }
            System.out.println((toBuy.size() + edges.size() + 3) + ". Back");
            int choice;
            do {
                choice = input.nextInt();
            } while (choice < 1 && choice > 3);
            System.out.println("\n\n");
            if (choice == 1) {
                if (money >= l.getPower() / 1000) {
                    money -= l.getPower() / 1000;
                    l.setPower(l.getPower() * 1.01);
                }
            } else if (choice == 2) {
                if (money >= l.getMaxSpeed()) {
                    money -= l.getMaxSpeed();
                    l.setMaxSpeed(l.getMaxSpeed() + 1);
                }
            } else if (choice == toBuy.size() + edges.size() + 3) {
                break;
            } else if (choice <= toBuy.size() + 2 && choice >= 3) {
                choice -= 3;
                if (toBuy.get(choice).cost <= money) {
                    money -= toBuy.get(choice).cost;
                    l.addCar(toBuy.get(choice));
                    toBuy.remove(choice);
                }
            } else if (choice > toBuy.size() + 2 && choice < toBuy.size() + edges.size() + 3) {
                choice = choice - toBuy.size() - 3;
                DefaultWeightedEdge edge = edges.get(choice);
                if (money >= master.getEdgeWeight(edge) * 100) {
                    money -= master.getEdgeWeight(edge) * 100;
                    if (!graph.containsVertex(master.getEdgeSource(edge))) {
                        graph.addVertex(master.getEdgeSource(edge));
                    }
                    if (!graph.containsVertex(master.getEdgeTarget(edge))) {
                        graph.addVertex(master.getEdgeTarget(edge));
                    }
                    graphUtils.addEdge(graph, master.getEdgeSource(edge), master.getEdgeTarget(edge), master.getEdgeWeight(edge));
                    master.removeEdge(edge);
                    Iterator <String> iter2 = master.vertexSet().iterator();
                    ArrayList <String> remove = new ArrayList <> ();
                    while (iter2.hasNext()) {
                        String vertex = iter2.next();
                        if (master.edgesOf(vertex).size() == 0) {
                            remove.add(vertex);
                        }
                    }
                    for (int i = 0; i < remove.size(); i++) {
                        master.removeVertex(remove.get(i));
                    }

                    path = new DijkstraShortestPath <String, DefaultWeightedEdge> (graph);
                }
            }
        }
        mainMenu();
    }
    static HashMap <String, Integer> jobSummary () {
        HashMap <String, Integer> map = new HashMap<>();
        for (int i = 0; i < l.getCars().size(); i++) {
            Car car = l.getCars().get(i);
            for (int j = 0; j < car.getJobs().size(); j++) {
                Job job = car.getJobs().get(j);
                if (map.containsKey(job.getDestination())) {
                    int before = map.get(job.getDestination());
                    before++;
                    map.replace(job.getDestination(), before);
                } else {
                    map.put(job.getDestination(), 1);
                }
            }
        }
        return map;
    }
}
