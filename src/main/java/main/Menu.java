package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Menu {
    static void reccomendPath (HashMap <String, Integer> jobs, String location, DijkstraShortestPath <String, DefaultWeightedEdge> path) {
        String dest = "";
        HashMap <String, Integer> map = Main.jobSummary();
        Iterator <String> iter = map.keySet().iterator();
        dest = iter.next();
        while (iter.hasNext()) {
            String str = iter.next();
            if (map.get(str) > map.get(dest)) {
                dest = str;
            }
        }
        double dist = path.getPathWeight(location, dest);;
        System.out.println("Closest job destination is " + dest + " (" + dist + " km)");
        GraphPath <String, DefaultWeightedEdge> recPath = path.getPath(location, dest);
        ArrayList <String> list = new ArrayList <> (recPath.getVertexList());
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
