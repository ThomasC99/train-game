package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class Rhaetian {
    public static Pseudograph <String, DefaultWeightedEdge> rhaetian () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> (DefaultWeightedEdge.class);

        graphUtils.addEdge(graph, "Samedan", "Punt Muragl", 2.83);

        return graph;
    }   
}