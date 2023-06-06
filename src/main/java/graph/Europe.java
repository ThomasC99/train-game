package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class Europe {
    public static Pseudograph <String, DefaultWeightedEdge> europe () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> 
            (DefaultWeightedEdge.class);
		
		
		// UK HS-1
		graphUtils.addEdge(graph, "London St Pancras", "Stratford International", 9.0);
		graphUtils.addEdge(graph, "Stratford International", "Ebbsfleet International", 28.0);
		graphUtils.addEdge(graph, "Ebbsfleet International", "Ashford International", 19.0);
		
		
		
		// Midland Main Line
		graphUtils.addEdge(graph, "London St Pancras", "Kentish Town", 2.35); // 2.35 km
		graphUtils.addEdge(graph, "Kentish Town", "West Hempstead", 3.79); // 6.14 km
		
		
		
		// Eurotunnel
		// graphUtils.addEdge(graph, "Ashford International", "Calais-Fréthun", 61.0);

        return graph;
    }
}
