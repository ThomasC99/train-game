package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class Shinkansen {
	
	private static Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> (DefaultWeightedEdge.class);
	
	public static Pseudograph <String, DefaultWeightedEdge> shinkansen () {
		
		// Tokaido Shinkansen
		graphUtils.addEdge(graph, "Tokyo", "Shinagawa", 6.8);
		graphUtils.addEdge(graph, "Shinagawa", "Shin-Yokohama", 18.7);
		graphUtils.addEdge(graph, "Shin-Yokohama", "Odawara", 51.2);
		graphUtils.addEdge(graph, "Odawara", "Atami", 18.7);
		graphUtils.addEdge(graph, "Atami", "Mishima", 15.9);
		graphUtils.addEdge(graph, "Mishima", "Shin-Fuji", 23.7);
		graphUtils.addEdge(graph, "Shin-Fuji", "Shizuoka", 32.4);
		graphUtils.addEdge(graph, "Shizuoka", "Kakegawa", 43.9);
		
		return graph;
	}
}