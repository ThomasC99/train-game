package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class LIRR {
    public static Pseudograph <String, DefaultWeightedEdge> lirr () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> (DefaultWeightedEdge.class);

        // Atlantic Branch
        graphUtils.addEdge(graph, "Atlantic Terminal", "Nostrand Avenue", 2.6);
        graphUtils.addEdge(graph, "Nostrand Avenue", "East New York", 3.8);
        graphUtils.addEdge(graph, "East New York", "Jamaica", 8.6);
        
        return graph;
    }
}
