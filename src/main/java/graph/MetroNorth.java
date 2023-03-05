package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class MetroNorth {
    public static Pseudograph <String, DefaultWeightedEdge> metroNorth () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> (DefaultWeightedEdge.class);

	// Hudson Line         6.8
        graphUtils.addEdge(graph, "New York Grand Central", "Harlem-125th Street", 6.8);
	graphUtils.addEdge(graph, "Harlem-125th Street", "Yankees-East 153rd Street", 2.9);
	graphUtils.addEdge(graph, "Yankees-East 153rd Street", "Morris Heights", 3.3);
	graphUtils.addEdge(graph, "Morris Heights", "University Heights", 1.0);
	graphUtils.addEdge(graph, "University Heights", "Marble Hill", 1.8);
	graphUtils.addEdge(graph, "Marble Hill", "Spuyten Duyvil", 2.1);
	graphUtils.addEdge(graph, "Spuyten Duyvil", "Riverdale", 3.0);
	graphUtils.addEdge(graph, "Riverdale", "Ludlow", 2.1);
	graphUtils.addEdge(graph, "Ludlow", "Yonkers", 1.3);
	graphUtils.addEdge(graph, "Yonkers", "Glenwood", 1.8);
	graphUtils.addEdge(graph, "Glenwood", "Greystone", 2.5);
	graphUtils.addEdge(graph, "Greystone", "Hastings-on-Hudson", 2.8);
	graphUtils.addEdge(graph, "Hastings-on-Hudson", "Dobbs Ferry", 1.9);
	graphUtils.addEdge(graph, "Dobbs Ferry", "Ardsley-on-Hudson", 1.6);
	graphUtils.addEdge(graph, "Ardsley-on-Hudson", "Irvington", 1.6);
	graphUtils.addEdge(graph, "Irvington", "Tarrytown", 4.1);
	graphUtils.addEdge(graph, "Tarrytown", "Philipse Manor", 2.0);
	graphUtils.addEdge(graph, "Philipse Manor", "Scarborough", 4.9);
	graphUtils.addEdge(graph, "Scarborough", "Ossining", 2.1);
	graphUtils.addEdge(graph, "Ossining", "Croton-Harmon", 3.8);
	graphUtils.addEdge(graph, "Croton-Harmon", "Cortlandt", 8.4);
	graphUtils.addEdge(graph, "Cortlandt", "Peekskill", 4.5);
	graphUtils.addEdge(graph, "Peekskill", "Manitou", 7.7);
	graphUtils.addEdge(graph, "Manitou", "Garrison", 6.3);
	graphUtils.addEdge(graph, "Garrison", "Cold Spring", 4.2);
	graphUtils.addEdge(graph, "Cold Spring", "Breakneck Ridge", 4.0);
	graphUtils.addEdge(graph, "Breakneck Bridge", "Beacon", 6.5);
	graphUtils.addEdge(graph, "Beacon", "New Hamburg", 11.2);
	graphUtils.addEdge(graph, "New Hamburg", "Poughkeepsie", 12.1);

	// Harlem Line
	graphUtils.addEdge(graph, "Harlem-125th Street", "Melrose", 3.0);
	graphUtils.addEdge(graph, "Melrose", "Tremont", 2.9);
	graphUtils.addEdge(graph, "Tremont", "Fordham", 1.6);
	graphUtils.addEdge(graph, "Fordham", "Botanical Garden", 0.6); // Shortest
	graphUtils.addEdge(graph, "Botanical Garden", "Williams Bridge", 1.6);
	graphUtils.addEdge(graph, "Williams Bridge", "Woodlawn", 2.1);
	graphUtils.addEdge(graph, "Woodlawn", "Wakefield", 1.3);
	graphUtils.addEdge(graph, "Wakefield", "Mount Vernon West", 0.8);
	graphUtils.addEdge(graph, "Mount Vernon West", "Fleetwood", 1.9);
        graphUtils.addEdge(graph, "Fleetwood", "Bronxville", 1.6);
	graphUtils.addEdge(graph, "Bronxville", "Tuckahoe", 1.1);
	graphUtils.addEdge(graph, "Tuckahoe", "Crestwood", 1.2);
	graphUtils.addEdge(graph, "Crestwood", "Scarsdale", 3.7);
	graphUtils.addEdge(graph, "Scarsdale", "Hartsdale", 2.6);
	graphUtils.addEdge(graph, "Hartsdale", "White Plains", 2.7);
	graphUtils.addEdge(graph, "White Plains", "North White Plains", 2.4);
	graphUtils.addEdge(graph, "North White Plains", "Valhalla", 2.7);
	graphUtils.addEdge(graph, "Valhalla", "Mount Pleasant", 2.8);
	graphUtils.addEdge(graph, "Mount Pleasant", "Hawthorne", 1.6);
	graphUtils.addEdge(graph, "Hawthorne", "Pleasantville", 3.7);
	graphUtils.addEdge(graph, "Pleasantville", "Chappaqua", 3.3);
	graphUtils.addEdge(graph, "Chappaqua", "Mount Kisco", 6.8);
	graphUtils.addEdge(graph, "Mount Kisco", "Bedford Hills", 4.4);
	graphUtils.addEdge(graph, "Bedford Hills", "Katonah", 3.2);
	graphUtils.addEdge(graph, "Katonah", "Goldens Bridge", 4.0);
	graphUtils.addEdge(graph, "Goldens Bridge", "Purdy's", 3.7);
	graphUtils.addEdge(graph, "Purdy's", "Croton Falls", 2.8);
	graphUtils.addEdge(graph, "Croton Falls", "Brewster", 6.7);
	graphUtils.addEdge(graph, "Brewster", "Southeast", 2.1);
	graphUtils.addEdge(graph, "Southeast", "Patterson", 11.3);
	graphUtils.addEdge(graph, "Patterson", "Pawlig", 5.6);
	graphUtils.addEdge(graph, "Pawlig", "Appalachian Trail", 3.6);
	graphUtils.addEdge(graph, "Appalachian Trail", "Harlem Valley-Wingdale", 4.9);
	graphUtils.addEdge(graph, "Harlem Valley-Wingdale", "Dover Plains", 12.1); // Longest
	graphUtils.addEdge(graph, "Dover Plains", "Tenmile River", 5.6);
	graphUtils.addEdge(graph, "Tenmile River", "Wassaic", 3.3);

	// Harlem Line
	graphUtils.addEdge(graph, "Woodlawn", "Mount Vernon East", 3.5);
	graphUtils.addEdge(graph, "Mount Vernon East", "Pelham", 1.9);
	graphUtils.addEdge(graph, "Pelham", "New Rochelle", 2.4);
	graphUtils.addEdge(graph, "New Rochelle", "Larchmont", 3.4);
	graphUtils.addEdge(graph, "Larchmont", "Mamaroneck", 2.9);
	graphUtils.addEdge(graph, "Mamaroneck", "Harrison", 2.7);
	graphUtils.addEdge(graph, "Harrison", "Rye", 3.1);
	graphUtils.addEdge(graph, "Rye", "Port Chester", 2.6);
	graphUtils.addEdge(graph, "Port Chester", "Greenwich", 2.6);
	graphUtils.addEdge(graph, "Greenwich", "Cos Cob", 2.4);
	graphUtils.addEdge(graph, "Cos Cob", "Riverside", 1.0);
	graphUtils.addEdge(graph, "Riverside", "Old Greenwich", 1.8);
	graphUtils.addEdge(graph, "Old Greenwich", "Stamford", 2.9);
	graphUtils.addEdge(graph, "Stamford", "Norton Heights", 5.2);

	// New Cannan Branch
	graphUtils.addEdge(graph, "Stamford", "Glenbrook", 3.5);
	graphUtils.addEdge(graph, "Glenbrook", "Springdale", 2.8);
	graphUtils.addEdge(graph, "Springdale", "Talmadge Hill", 3.4);
	graphUtils.addEdge(graph, "Talmadge Hill", "New Canaan", 3.5);

        return graph;
    }
}
