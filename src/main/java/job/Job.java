package job;
import java.util.ArrayList;
import java.util.Random;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import main.Main;

public class Job {
    private String origin;
    private String destination;
    private double value;
    public Job (String origin, String destination, double value) {
        this.origin = origin;
        this.destination = destination;
        this.value = value;
    }
    public String getOrigin () {
        return origin;
    }
    public String getDestination () {
        return destination;
    }
    public double getValue () {
        return value;
    }
    public static Job generateRandomJob (String origin) {
        ArrayList <String> destinations = new ArrayList <String> (Main.graph.vertexSet());
        Random rand = new Random ();
	String destination = destinations.get(rand.nextInt(destinations.size()));
        DijkstraShortestPath <String, DefaultWeightedEdge> path = new DijkstraShortestPath(Main.graph);
        Job job = new Job (origin, destination, path.getPathWeight(origin, destination));
        if (job.getValue() == 0) {
            return generateRandomJob(origin);
        }
        return job;
    }
    public double getJobValue (String origin, String destination) {
        return Main.graph.getEdgeWeight(Main.graph.getEdge(origin, destination));
    }
}