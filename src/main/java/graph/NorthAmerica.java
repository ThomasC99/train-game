package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class NorthAmerica {
    public static Pseudograph <String, DefaultWeightedEdge> world () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> 
            (DefaultWeightedEdge.class);

	// Companies TODO
	// Amtrak
	// Canadian Southern
	// CN
	// CP
	// Curran Dinsmore
	// Grand Trunk
	// Intercolonial
	// Official Guide
	// Russell's
	// Southern Pacific
	// Via
        
	// New York
        graphUtils.addEdge(graph, "Utica", "Syracuse", 84.8);
	graphUtils.addEdge(graph, "Syracuse", "Rochester", 129.6);
	graphUtils.addEdge(graph, "Rochester", "Buffalo", 112.0);

	// cross state / province connections

        return graph;
    }
}
