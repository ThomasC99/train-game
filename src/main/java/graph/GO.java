package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class GO {
    public static Pseudograph <String, DefaultWeightedEdge> go () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> 
            (DefaultWeightedEdge.class);
        
        // Lakeshore West
        graphUtils.addEdge(graph, "Union", "Exhibition", 3.2);
        graphUtils.addEdge(graph, "Exhibition", "Mimico", 7.6);
        graphUtils.addEdge(graph, "Mimico", "Long Branch", 4.6);
        graphUtils.addEdge(graph, "Long Branch", "Port Credit", 5.2);
        graphUtils.addEdge(graph, "Port Credit", "Clarkson", 6.3);
        graphUtils.addEdge(graph, "Clarkson", "Oakville", 7.5);
        graphUtils.addEdge(graph, "Oakville", "Bronte", 5.4);
        graphUtils.addEdge(graph, "Bronte", "Appleby", 5.1);
        graphUtils.addEdge(graph, "Appleby", "Burlington", 6.6);
        graphUtils.addEdge(graph, "Burlington", "Aldershot", 4.2);
        graphUtils.addEdge(graph, "Aldershot", "Hamilton", 7.5);
        graphUtils.addEdge(graph, "Aldershot", "West Harbour", 7.4);
        graphUtils.addEdge(graph, "West Harbour", "Confederation", 9.2);
        graphUtils.addEdge(graph, "Confederation", "Grimsby", 17.2);
        graphUtils.addEdge(graph, "Grimsby", "St Catharines", 25.1);
        graphUtils.addEdge(graph, "St Cathatines", "Niagara Falls", 18.0);

        // Lakeshore East
        graphUtils.addEdge(graph, "Union", "Danforth", 8.4);
        graphUtils.addEdge(graph, "Danforth", "Scarborough", 5.4);
        graphUtils.addEdge(graph, "Scarborough", "Eglinton", 3.3);
        graphUtils.addEdge(graph, "Eglinton", "Guildwood", 3.2);
        graphUtils.addEdge(graph, "Guildwood", "Rouge Hill", 6.3);
        graphUtils.addEdge(graph, "Rouge Hill", "Pickering", 7.0);
        graphUtils.addEdge(graph, "Pickering", "Ajax", 3.9);
        graphUtils.addEdge(graph, "Ajax", "Whitby", 8.7);
        graphUtils.addEdge(graph, "Whitby", "Oshawa", 4.3);
        
        // Milton
        graphUtils.addEdge(graph, "Union", "Bloor", 6.2);
        graphUtils.addEdge(graph, "Bloor", "Kipling", 9.4);
        graphUtils.addEdge(graph, "Kipling", "Dixie", 4.4);
        graphUtils.addEdge(graph, "Dixie", "Cooksville", 4.8);
        graphUtils.addEdge(graph, "Cooksville", "Erindale", 4.3);
        graphUtils.addEdge(graph, "Erindale", "Streetsville", 3.6);
        graphUtils.addEdge(graph, "Streetsville", "Meadowvale", 4.5);
        graphUtils.addEdge(graph, "Meadowvale", "Lisgar", 6.5);
        graphUtils.addEdge(graph, "Lisgar", "Milton", 6.5);

        // Kitchener
        graphUtils.addEdge(graph, "Bloor", "Weston", 7.6);
        graphUtils.addEdge(graph, "Weston", "Etobicoke North", 3.9);
        graphUtils.addEdge(graph, "Etobicoke North", "Malton", 6.0);
        graphUtils.addEdge(graph, "Malton", "Bramalea", 6.1);
        graphUtils.addEdge(graph, "Bramalea", "Brampton", 6.1);
        graphUtils.addEdge(graph, "Brampton", "Mount Pleasant", 4.7);
        graphUtils.addEdge(graph, "Mount Pleasant", "Georgetown", 8.3);
        graphUtils.addEdge(graph, "Georgetown", "Acton", 10.0);
        graphUtils.addEdge(graph, "Acton", "Guelph", 21.4);
        graphUtils.addEdge(graph, "Guelph", "Kitchener", 22.4);
        graphUtils.addEdge(graph, "Kitchener", "Stratford", 42.3);
        graphUtils.addEdge(graph, "Stratford", "St Marys", 17.0);
        graphUtils.addEdge(graph, "St Marys", "London", 35.0);

        // UP Express
        graphUtils.addEdge(graph, "Etobicoke North", "Pearson Airport", 5.6);

        // Barrie Line
        graphUtils.addEdge(graph, "Union", "Downsview Park", 17.1);
        graphUtils.addEdge(graph, "Downsview Park", "York University", 2.7);
        graphUtils.addEdge(graph, "York Univsersity", "Rutherford", 7.0);
        graphUtils.addEdge(graph, "Rutherford", "Maple", 2.7);
        graphUtils.addEdge(graph, "Maple", "King City", 7.0);
        graphUtils.addEdge(graph, "King City", "Aurora", 11.6);
        graphUtils.addEdge(graph, "Aurora", "Newmarket", 6.9);
        graphUtils.addEdge(graph, "Aurora", "East Gwillimbury", 2.4);
        graphUtils.addEdge(graph, "East Gwillimbury", "Bradford", 9.0);
        graphUtils.addEdge(graph, "Bradford", "Innisfil", 17.3);
        graphUtils.addEdge(graph, "Innisfil", "Barrie South", 11.3);
        graphUtils.addEdge(graph, "Barrie South", "Allandale Waterfront", 6.4);

        // Richmond Hill
        graphUtils.addEdge(graph, "Union", "Oriole", 19.6);
        graphUtils.addEdge(graph, "Oriole", "Old Cummer", 3.1);
        graphUtils.addEdge(graph, "Old Cummer", "Langstaff", 6.8);
        graphUtils.addEdge(graph, "Langstaff", "Richmond Hill", 4.3);
        graphUtils.addEdge(graph, "Richmond Hill", "Gormley", 8.5);
        graphUtils.addEdge(graph, "Gormley", "Bloomington", 3.6);

        // Stouffville
        graphUtils.addEdge(graph, "Scarborough", "Kennedy", 2.6);
        graphUtils.addEdge(graph, "Kennedy", "Agincourt", 6.5);
        graphUtils.addEdge(graph, "Agincourt", "Milliken", 4.5);
        graphUtils.addEdge(graph, "Milliken", "Unionville", 3.2);
        graphUtils.addEdge(graph, "Unionville", "Centennial", 4.4);
        graphUtils.addEdge(graph, "Centennial", "Markham", 1.7);
        graphUtils.addEdge(graph, "Markham", "Mount Joy", 2.0);
        graphUtils.addEdge(graph, "Mount Joy", "Sotuffville", 8.1);
        graphUtils.addEdge(graph, "Stouffville", "Old Elm", 2.8);

        // Other tracks
        graphUtils.addEdge(graph, "London", "Aldershot", 160.0);
        graphUtils.addEdge(graph, "Kipling", "Long Branch", 7.0);
        graphUtils.addEdge(graph, "Bramalea", "York University", 24.1);
        graphUtils.addEdge(graph, "Bramalea", "Rutherford", 25.8);
        graphUtils.addEdge(graph, "Bramalea", "Old Cummer", 32.2);
        graphUtils.addEdge(graph, "Bramalea", "Langstaff", 30.6);
        graphUtils.addEdge(graph, "Georgetown", "Aldershot", 49.9);

        return graph;
    }
}
