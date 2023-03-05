package graph;

import java.util.ArrayList;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class graphUtils { 
    public static void addEdge (Pseudograph <String, DefaultWeightedEdge> graph, String origin, String destination, double weight) {
		if (!graph.vertexSet().contains(origin)) {
			graph.addVertex(origin);
		}
		if (!graph.vertexSet().contains(destination)) {
			graph.addVertex(destination);
		}
		graph.setEdgeWeight(graph.addEdge(origin, destination), weight);
	}
    public static Pseudograph <String, DefaultWeightedEdge> combine
	(Pseudograph <String, DefaultWeightedEdge> g1, Pseudograph <String, DefaultWeightedEdge> g2) {
		ArrayList <String> vertexList = new ArrayList <> (g2.vertexSet());
		for (int i = 0; i < vertexList.size(); i++) {
			String tmp = vertexList.get(i);
			if (!g1.vertexSet().contains(tmp)) {
				g1.addVertex(tmp);
			}
		}
		ArrayList <DefaultWeightedEdge> edgeList = new ArrayList <> (g2.edgeSet());
		for (int i = 0; i < edgeList.size(); i++) {
			DefaultWeightedEdge edge = edgeList.get(i);
			if (!g1.edgeSet().contains(edge)) {
				g1.setEdgeWeight(g1.addEdge(g2.getEdgeSource(edge), g2.getEdgeTarget(edge)), g2.getEdgeWeight(edge));
			}
		}
		return g1;
	}
}
