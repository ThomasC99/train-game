package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class World {
    public static Pseudograph <String, DefaultWeightedEdge> world () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> 
            (DefaultWeightedEdge.class);

	graphUtils.addEdge(graph, "Ottawa", "Vars", 26.0);
	graphUtils.addEdge(graph, "Vars", "Casselman", 21.0);
	graphUtils.addEdge(graph, "Casselman", "Moose Creek", 13.0);
	graphUtils.addEdge(graph, "Moose Creek", "Maxville", 10.0);
	graphUtils.addEdge(graph, "Maxville", "Alexandria", 17.0);
	graphUtils.addEdge(graph, "Alexandria", "Glen Robertson", 11.0);
	graphUtils.addEdge(graph, "Glen Robertson", "Coteau", 26.0);
	graphUtils.addEdge(graph, "Coteau", "Dorval", 43.0);
	graphUtils.addEdge(graph, "Dorval", "Montreal", 20.0);

        return graph;
    }
}
