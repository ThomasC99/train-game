package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class NorthAmerica {

    static Pseudograph <String, DefaultWeightedEdge> graph;

    static void canadianSouthern () {
        // Utica - Buffalo
        graphUtils.addEdge(graph, "Utica", "Syracuse", 84.8);
        graphUtils.addEdge(graph, "Syracuse", "Rochester", 129.6);
        graphUtils.addEdge(graph, "Rochester", "Buffalo", 112.0);

        // Buffalo - Toledo
    }

    public static Pseudograph <String, DefaultWeightedEdge> network () {
        graph = new Pseudograph <> (DefaultWeightedEdge.class);
        canadianSouthern();
        return graph;
    }
}
// 80
