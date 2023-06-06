package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class Path {
    public static Pseudograph <String, DefaultWeightedEdge> path () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> (DefaultWeightedEdge.class);
		
		graphUtils.addEdge(graph, "33rd Street", "23rd Street", 0.8);
		graphUtils.addEdge(graph, "23rd Street", "14th Street", 0.7);
		graphUtils.addEdge(graph, "14th Street", "9th Street", 0.4);
		graphUtils.addEdge(graph, "9th Street", "Christopher Street", 0.7);
		graphUtils.addEdge(graph, "Christopher Street", "Hoboken", 1.8);
		graphUtils.addEdge(graph, "Hoboken", "Newport", 1.1);
		graphUtils.addEdge(graph, "Christopher Street", "Newport", 2.9);
		graphUtils.addEdge(graph, "Newport", "Exchange Place", 1.2);
		graphUtils.addEdge(graph, "Exchange Place", "World Trade Center", 1.9);
		graphUtils.addEdge(graph, "Exchange Place", "Grove Street", 1.0);
		graphUtils.addEdge(graph, "Grove Street", "Newport", 1.7);
		graphUtils.addEdge(graph, "Grove Street", "Journal Square", 2.4);
		graphUtils.addEdge(graph, "Journal Square", "Harrison", 8.2);
		graphUtils.addEdge(graph, "Harrison", "Newark", 0.9);
		
		return graph;
	}
}	