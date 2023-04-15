package graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Pseudograph;

public class Via {
    public static Pseudograph <String, DefaultWeightedEdge> via () {
        Pseudograph <String, DefaultWeightedEdge> graph = new Pseudograph <> (DefaultWeightedEdge.class);

        // TODO Halifax - Sydney - Montreal : 340 km
        graphUtils.addEdge(graph, "Halifax", "Armdale", 6.0);
        graphUtils.addEdge(graph, "Armdale", "Rockingham", 4.0);
        graphUtils.addEdge(graph, "Rockingham", "Bedford", 7.0);
        graphUtils.addEdge(graph, "Bedford", "Windsor Junction", 8.0);
        graphUtils.addEdge(graph, "Windsor Junction", "Elmsdale", 27.0);
        graphUtils.addEdge(graph, "Elmsdale", "Milford", 10.0);
        graphUtils.addEdge(graph, "Milford", "Shubenacadie", 6.0);
        graphUtils.addEdge(graph, "Shubenacadie", "Stewiacke", 7.0);
        graphUtils.addEdge(graph, "Stewiacke", "Truro", 28.0);
        graphUtils.addEdge(graph, "Truro", "Oxford Junction", 75.0);
        graphUtils.addEdge(graph, "Oxford Junction", "Springhill Junction", 21.0);
        graphUtils.addEdge(graph, "Springhill Junction", "Amherst", 28.0);
        graphUtils.addEdge(graph, "Amherst", "Sackville", 16.0);
        graphUtils.addEdge(graph, "Sackville", "Moncton", 61.0);
        graphUtils.addEdge(graph, "Moncton", "Rogersville", 93.0);
        graphUtils.addEdge(graph, "Rogersville", "Newcastle", 35.0);
        graphUtils.addEdge(graph, "Mewcastle", "Bathrust", 71.0);
        graphUtils.addEdge(graph, "Bathurst", "Jacquet River", 46.0);
        graphUtils.addEdge(graph, "Jacquet River", "Campbellton", 55.0);
        graphUtils.addEdge(graph, "Campbellton", "Matapédia", 21.0);
        graphUtils.addEdge(graph, "Matapédia", "St-Alexis", 9.0);
        graphUtils.addEdge(graph, "St-Alexis", "Ste-Florence", 36.0);
        graphUtils.addEdge(graph, "Ste-Florence", "Causapscal", 11.0);
        graphUtils.addEdge(graph, "Causapscal", "Lac-au-Saumon", 12.0);
        graphUtils.addEdge(graph, "Lac-au-Saumon", "Amqui", 9.0);
        graphUtils.addEdge(graph, "Amqui", "Val-Brilliant", 14.0);
        graphUtils.addEdge(graph, "Val-Brilliant", "Sayabec", 11.0);
        graphUtils.addEdge(graph, "Sayabec", "St-Noël", 11.0);
        graphUtils.addEdge(graph, "St-Noël", "Padoue", 13.0);
        graphUtils.addEdge(graph, "Padoue", "St-Octave", 14.0);
        graphUtils.addEdge(graph, "St-Octave", "Mont-Joli", 9.0);
        graphUtils.addEdge(graph, "Mont-Joli", "Luceville", 13.0);
        graphUtils.addEdge(graph, "Luceville", "Rimouski", 16.0);
        graphUtils.addEdge(graph, "Rimouski", "Bic", 17.0);
        graphUtils.addEdge(graph, "Bic", "St-Fabien", 15.0);
        graphUtils.addEdge(graph, "St-Fabien", "St-Simon", 16.0);
        graphUtils.addEdge(graph, "St-Simon", "Trois-Pistoles", 14.0);
        graphUtils.addEdge(graph, "Trois-Pistoles", "Isle-Verte", 17.0);
        graphUtils.addEdge(graph, "Isle-Verte", "St-Arsène", 14.0);
        graphUtils.addEdge(graph, "St-Arsène", "Rivière-du-Loup", 12.0);
        graphUtils.addEdge(graph, "Rivière-du-Loup", "Chemin-du-Lac", 10.0);
        graphUtils.addEdge(graph, "Chemin-du-Lac", "St-Alexandre", 9.0);
        graphUtils.addEdge(graph, "St-Alexandre", "Ste-Hélène", 13.0);
        graphUtils.addEdge(graph, "Ste-Hélène", "St-Pascal", 9.0);
        graphUtils.addEdge(graph, "St-Pascal", "St-Philippe-de-Néri", 10.0);
        graphUtils.addEdge(graph, "St-Philippe-de-Néri", "La Pocatière", 15.0);
        graphUtils.addEdge(graph, "La Pocatière", "St-Jean-Port-Joli", 25.0);
        graphUtils.addEdge(graph, "St-Jean-Port-Joli", "L'Islet", 13.0);
		graphUtils.addEdge(graph, "L'Islet", "Montmagny", 22.0);
		graphUtils.addEdge(graph, "Montmagny", "St-Charles", 37.0);
		graphUtils.addEdge(graph, "St-Charles", "Lévis", 22.0);
		graphUtils.addEdge(graph, "Lévis", "Charny", 13.0);
		graphUtils.addEdge(graph, "Charny", "Drummondville", 145.0);
		graphUtils.addEdge(graph, "Drummondville", "St-Hyacinthe", 47.0);
		graphUtils.addEdge(graph, "St-Hyacinthe", "Mont St-Hilaire Est", 11.0);
		graphUtils.addEdge(graph, "Mont St-Hilaire Est", "Mont St-Hilaire", 1.0);
		graphUtils.addEdge(graph, "Mont St-Hilaire", "Otterburn Park", 1.0);
		graphUtils.addEdge(graph, "Otterburn Park", "Beloeil", 1.0);
		graphUtils.addEdge(graph, "Beloeil", "St-Basile-le-Grand", 6.0);
		graphUtils.addEdge(graph, "St-Basile-le-Grand", "St-Bruno", 5.0);
		graphUtils.addEdge(graph, "St-Bruno", "St-Hubert", 6.0);
		graphUtils.addEdge(graph, "St-Hubert", "St-Lambert", 7.0);
		graphUtils.addEdge(graph, "St-Lambert", "Montréal", 7.0);

	// Truro - Sydney
		graphUtils.addEdge(graph, "Truro", "Valley", 7.0);
		graphUtils.addEdge(graph, "Valley", "Union", 7.0);
		graphUtils.addEdge(graph, "Union", "Riversdale", 6.0);
		graphUtils.addEdge(graph, "Riversdale", "West River", 13.0);
		graphUtils.addEdge(graph, "West River", "Glengarry", 12.0);
		graphUtils.addEdge(graph, "Glengarry", "Lorne", 4.0);
		graphUtils.addEdge(graph, "Lorne", "Hopewell", 7.0);
		graphUtils.addEdge(graph, "Hopewwll", "Eureka", 2.0);
		graphUtils.addEdge(graph, "Eureka", "Stellarton", 7.0);
		graphUtils.addEdge(graph, "Stellarton", "New Glasgow", 4.0);
		graphUtils.addEdge(graph, "New Glasgow", "Egerton", 16.0);
		graphUtils.addEdge(graph, "Egerton", "Merigomish", 5.0);
		graphUtils.addEdge(graph, "Merigomish", "Avondale", 14.0);
		graphUtils.addEdge(graph, "Avondale", "James River", 16.0);
		graphUtils.addEdge(graph, "James River", "Antigonish", 15.0);
		graphUtils.addEdge(graph, "Antigonish", "Pomquet", 16.0);
		graphUtils.addEdge(graph, "Pomquet", "Heatherton", 4.0);
		graphUtils.addEdge(graph, "Heatherton", "Monastery", 16.0);
		graphUtils.addEdge(graph, "Monastery", "Havre Boucher", 16.0);
		graphUtils.addEdge(graph, "Havre Boucher", "Auld Cove", 12.0);
		graphUtils.addEdge(graph, "Auld Cove", "Port Hastings", 3.0);
		graphUtils.addEdge(graph, "Port Hastings", "Port Hawkesbury", 5.0);
		graphUtils.addEdge(graph, "Port Hawkesbury", "McIntyres Lake", 11.0);
		graphUtils.addEdge(graph, "McIntyres Lake", "West Bay Road", 11.0);
		graphUtils.addEdge(graph, "West Bay Road", "River Denys", 11.0);
		graphUtils.addEdge(graph, "River Denys", "Orangedale", 13.0);
		graphUtils.addEdge(graph, "Orangedale", "Alba", 8.0);
		graphUtils.addEdge(graph, "Alba", "Ottawa Brook", 6.0);
		graphUtils.addEdge(graph, "Ottawa Brook", "McKinnon Harbour", 4.0);
		graphUtils.addEdge(graph, "McKinnon Harbour", "Iona", 8.0);
		graphUtils.addEdge(graph, "Iona", "Grand Narrows", 1.0);
		graphUtils.addEdge(graph, "Grand Narrows", "Christmas Island", 5.0);
		graphUtils.addEdge(graph, "Christmas Island", "Boisdale", 23.0);
		graphUtils.addEdge(graph, "Boisdale", "Little Bras d'Or", 27.0);
		graphUtils.addEdge(graph, "Little Bras d'Or", "Sydney Mines", 6.0);
		graphUtils.addEdge(graph, "Sydney Mines", "North Sydney", 5.0);
		graphUtils.addEdge(graph, "North Sydney", "Leitches Creek", 7.0);
		graphUtils.addEdge(graph, "Leitches Creek", "Sydney", 17.0);
	
		// Moncton - Saint John
		graphUtils.addEdge(graph, "Moncton", "Salisbury", 21.0);
		graphUtils.addEdge(graph, "Salisbury", "River Glade", 8.0);
		graphUtils.addEdge(graph, "River Glade", "Petitcodiac", 8.0);
		graphUtils.addEdge(graph, "Petitcodiac", "Anagance", 9.0);
		graphUtils.addEdge(graph, "Anagance", "Penobsquis", 15.0);
		graphUtils.addEdge(graph, "Penobsquis", "Sussex", 12.0);
		graphUtils.addEdge(graph, "Sussex", "Apohaqui", 7.0);
		graphUtils.addEdge(graph, "Apohaqui", "Norton", 11.0);
		graphUtils.addEdge(graph, "Norton", "Bloomfield", 8.0);
		graphUtils.addEdge(graph, "Bloomfield", "Hampton", 9.0);
		graphUtils.addEdge(graph, "Hampton", "Rothesay", 21.0);
		graphUtils.addEdge(graph, "Rothesay", "Saint John", 12.0);

	// Matapédia - Gaspé
		graphUtils.addEdge(graph, "Matapédia", "Cross Point", 20.0);
		graphUtils.addEdge(graph, "Cross Point", "Nouvelle", 37.0);
		graphUtils.addEdge(graph, "Nouvelle", "Carleton", 14.0);
		graphUtils.addEdge(graph, "Carleton", "Maria", 14.0);
		graphUtils.addEdge(graph, "Maria", "Cascapédia", 12.0);
		graphUtils.addEdge(graph, "Cascapédia", "New Richmond", 14.0);
		graphUtils.addEdge(graph, "New Richmond", "Caplan", 15.0);
		graphUtils.addEdge(graph, "Caplan", "Bonaventure", 17.0);
		graphUtils.addEdge(graph, "Bonaventure", "New Carlisle", 14.0);
		graphUtils.addEdge(graph, "New Carlisle", "St-Godfroi", 18.0);
		graphUtils.addEdge(graph, "St-Godfroi", "Port-Daniel", 19.0);
		graphUtils.addEdge(graph, "Port-Daniel", "Newport", 23.0);
		graphUtils.addEdge(graph, "Newport", "Chandler", 11.0);
		graphUtils.addEdge(graph, "Chandler", "Grande-Rivière", 16.0);
		graphUtils.addEdge(graph, "Grande-Rivière", "Percé", 18.0);
		graphUtils.addEdge(graph, "Percé", "Barachois", 23.0);
		graphUtils.addEdge(graph, "Barachois", "Douglastown", 28.0);
		graphUtils.addEdge(graph, "Douglastown", "Gaspé", 12.0);

		// Montreal - Capreol
		graphUtils.addEdge(graph, "Montréal", "Dorval", 19.0);
		graphUtils.addEdge(graph, "Dorval", "Coteau", 44.0);
		graphUtils.addEdge(graph, "Coteau", "Glen Robertson", 25.0);
		graphUtils.addEdge(graph, "Glen Robertson", "Alexandria", 12.0);
		graphUtils.addEdge(graph, "Alexandria", "Maxville", 18.0);
		graphUtils.addEdge(graph, "Maxville", "Moose Creek", 10.0);
		graphUtils.addEdge(graph, "Moose Creek", "Casselman", 11.0);
		graphUtils.addEdge(graph, "Casselman", "Vars", 22.0);
		graphUtils.addEdge(graph, "Vars", "Ottawa", 26.0);
		graphUtils.addEdge(graph, "Ottawa", "Portage-du-Fort", 96.0);
		graphUtils.addEdge(graph, "Portage-du-Fort", "Pembroke", 44.0);
		graphUtils.addEdge(graph, "Pembroke", "Lake Traverse", 87.0);
		graphUtils.addEdge(graph, "Lake Traverse", "Odenback", 21.0);
		graphUtils.addEdge(graph, "Odenback", "Brent", 16.0);
		graphUtils.addEdge(graph, "Brent", "Government Park", 6.0);
		graphUtils.addEdge(graph, "Government Park", "Daventry", 10.0);
		graphUtils.addEdge(graph, "Daventry", "Kiosk", 19.0);
		graphUtils.addEdge(graph, "Kiosk", "North Bay", 74.0);
		graphUtils.addEdge(graph, "North Bay", "Field", 52.0);
		graphUtils.addEdge(graph, "Field", "Capreol", 82.0);

	// Capreol - Toronto
		graphUtils.addEdge(graph, "Capreol", "Sudbury", 22.0);
		graphUtils.addEdge(graph, "Sudbury", "Bolger", 139.0);
		graphUtils.addEdge(graph, "Bolger", "Parry Sound", 42.0);
		graphUtils.addEdge(graph, "Parry Sound", "South Parry", 4.0);
		graphUtils.addEdge(graph, "South Parry", "Washago", 94.0);
		graphUtils.addEdge(graph, "Washago", "Orillia", 20.0);
		graphUtils.addEdge(graph, "Orillia", "Beaverton", 36.0);
		graphUtils.addEdge(graph, "Beaverton", "Barrie", 2.0);
		graphUtils.addEdge(graph, "Barrie", "Leroy", 18.0);
		graphUtils.addEdge(graph, "Leroy", "Bradford", 16.0);
		graphUtils.addEdge(graph, "Bradford", "Newmarket", 12.0);
		graphUtils.addEdge(graph, "Newmarket", "Aurora", 7.0);
		graphUtils.addEdge(graph, "Aurora", "King", 11.0);
		graphUtils.addEdge(graph, "King", "Maple", 8.0);
		graphUtils.addEdge(graph, "Maple", "St Clair Avenue", 21.0);
		graphUtils.addEdge(graph, "St Clair Avenue", "Toronto", 8.0);

	// Capreol - Vancouver
		graphUtils.addEdge(graph, "Capreol", "Laforest", 49.0);
		graphUtils.addEdge(graph, "Laforest", "Westree", 55.0);
		graphUtils.addEdge(graph, "Westree", "Gogama", 35.0);
		graphUtils.addEdge(graph, "Gogama", "Foleyet", 100.0);
		graphUtils.addEdge(graph, "Foleyet", "Elsas", 56.0);
		graphUtils.addEdge(graph, "Elsas", "Oba", 120.0);
		graphUtils.addEdge(graph, "Oba", "Hornpayne", 62.0);
		graphUtils.addEdge(graph, "Hornepayne", "Hillsport", 68.0);
		graphUtils.addEdge(graph, "Hillsport", "Caramat", 57.0);
		graphUtils.addEdge(graph, "Caramat", "Longlac", 38.0);
		graphUtils.addEdge(graph, "Longlac", "Nakina", 48.0);
		graphUtils.addEdge(graph, "Nakina", "Auden", 90.0);
		graphUtils.addEdge(graph, "Auden", "Ferland", 43.0);
		graphUtils.addEdge(graph, "Ferland", "Mud River", 8.0);
		graphUtils.addEdge(graph, "Mud River", "Armstrong", 40.0);
		graphUtils.addEdge(graph, "Armstrong", "Collins", 34.0);
		graphUtils.addEdge(graph, "Collins", "Allanwater Bridge", 53.0);
		graphUtils.addEdge(graph, "Allanwater Bridge", "Savant Lake", 40.0);
		graphUtils.addEdge(graph, "Savant Lake", "Superior Junction", 86.0);
		graphUtils.addEdge(graph, "Superior Junction", "Sioux Lookout", 11.0);
		graphUtils.addEdge(graph, "Sioux Lookout", "Pelican", 10.0);
		graphUtils.addEdge(graph, "Pelican", "Hudson", 10.0);
		graphUtils.addEdge(graph, "Hudson", "Sunstrum", 31.0);
		graphUtils.addEdge(graph, "Sunstrum", "Millidge", 12.0);
		graphUtils.addEdge(graph, "Millidge", "Richan", 10.0);
		graphUtils.addEdge(graph, "Richan", "Amesdale", 8.0);
		graphUtils.addEdge(graph, "Amesdale", "Niddrie", 12.0);
		graphUtils.addEdge(graph, "Niddrie", "Morgan", 12.0);
		graphUtils.addEdge(graph, "Morgan", "Red Lake Road", 9.0);
		graphUtils.addEdge(graph, "Red Lake Road", "Quibell", 6.0);
		graphUtils.addEdge(graph, "Quibell", "McIntosh", 14.0);
		graphUtils.addEdge(graph, "McIntosh", "Canyon", 11.0);
		graphUtils.addEdge(graph, "Canyon", "Jones", 25.0);
		graphUtils.addEdge(graph, "Jones", "Farlane", 12.0);
		graphUtils.addEdge(graph, "Farlane", "Redditt", 6.0);
		graphUtils.addEdge(graph, "Redditt", "Ena Lake", 20.0);
		graphUtils.addEdge(graph, "Ena Lake", "Minaki", 13.0);
		graphUtils.addEdge(graph, "Minaki", "Wade", 10.0);
		graphUtils.addEdge(graph, "Wade", "Ottermere", 11.0);
		graphUtils.addEdge(graph, "Ottermere", "Malachi", 4.0);
		graphUtils.addEdge(graph, "Malachi", "Rice Lake", 12.0);
		graphUtils.addEdge(graph, "Rice Lake", "Winnitoba", 6.0);
		graphUtils.addEdge(graph, "Winnitoba", "Ophir", 4.0);
		graphUtils.addEdge(graph, "Ophir", "Decimal", 13.0);
		graphUtils.addEdge(graph, "Decimal", "Brereton Lake", 8.0);
		graphUtils.addEdge(graph, "Brereton Lake", "Indigo", 3.0);
		graphUtils.addEdge(graph, "Indigo", "Elma", 24.0);
		graphUtils.addEdge(graph, "Elma", "Hazel", 25.0);
		graphUtils.addEdge(graph, "Hazel", "Nourse", 8.0);
		graphUtils.addEdge(graph, "Nourse", "Vivian", 7.0);
		graphUtils.addEdge(graph, "Vivian", "Transcona", 36.0);
		graphUtils.addEdge(graph, "Transcona", "Winnipeg", 13.0);
		graphUtils.addEdge(graph, "Winnipeg", "Portage-la-Prairie", 89.0);
		graphUtils.addEdge(graph, "Portage-la-Prairie", "Brandon North", 118.0);
		graphUtils.addEdge(graph, "Brandon North", "Rivers", 24.0);
		graphUtils.addEdge(graph, "Rivers", "St Lazare", 98.0);
		graphUtils.addEdge(graph, "St Lazare", "Yarbo", 56.0);
		graphUtils.addEdge(graph, "Yarbo", "Melville", 66.0);
		graphUtils.addEdge(graph, "Melville", "Ituna", 56.0);
		graphUtils.addEdge(graph, "Ituna", "Raymore", 78.0);
		graphUtils.addEdge(graph, "Raymore", "Watrous", 74.0);
		graphUtils.addEdge(graph, "Watrous", "Saskatoon", 101.0);
		graphUtils.addEdge(graph, "Saskatoon", "Biggar", 89.0);
		graphUtils.addEdge(graph, "Biggar", "Unity", 94.0);
		graphUtils.addEdge(graph, "Unity", "Wainwright", 132.0);
		graphUtils.addEdge(graph, "Wainwright", "Viking", 71.0);
		graphUtils.addEdge(graph, "Viking", "Edmonton", 133.0);
		graphUtils.addEdge(graph, "Edmonton", "Evansburg", 109.0);
		graphUtils.addEdge(graph, "Evansburg", "Edson", 99.0);
		graphUtils.addEdge(graph, "Edson", "Hinton", 89.0);
		graphUtils.addEdge(graph, "Hinton", "Jasper", 82.0);
		graphUtils.addEdge(graph, "Jasper", "Red Pass Junction", 69.0);
		graphUtils.addEdge(graph, "Red Pass Junction", "Valemount", 51.0);
		graphUtils.addEdge(graph, "Valemount", "Blue River", 93.0);
		graphUtils.addEdge(graph, "Blue River", "Avola", 40.0);
		graphUtils.addEdge(graph, "Avola", "Vavenby", 45.0);
		graphUtils.addEdge(graph, "Vavenby", "Clearwater", 24.0);
		graphUtils.addEdge(graph, "Clearwater", "Kamloops Junction", 115.0);
		graphUtils.addEdge(graph, "Kamloops Junction", "Ashcroft", 79.0);
		graphUtils.addEdge(graph, "Ashcroft", "Lytton", 78.0);
		graphUtils.addEdge(graph, "Lytton", "Boston Bar", 45.0);
		graphUtils.addEdge(graph, "Boston Bar", "Hope", 65.0);
		graphUtils.addEdge(graph, "Hope", "Chilliwack", 51.0);
		graphUtils.addEdge(graph, "Chilliwack", "Matsqui", 25.0);
		graphUtils.addEdge(graph, "Matsqui", "Fort Langley", 25.0);
		graphUtils.addEdge(graph, "Fort Langley", "New Westminster", 27.0);
		graphUtils.addEdge(graph, "New Westminster", "Vancouver", 19.0);

		// Red Pass Junction - Prince Rupert TODO
		graphUtils.addEdge(graph, "Red Pass Junction", "Tête-Jaune", 40.0);
		graphUtils.addEdge(graph, "Tête-Jaune", "Croydon", 20.0);
		graphUtils.addEdge(graph, "Croydon", "Dunster", 10.0);
		graphUtils.addEdge(graph, "Dunster", "McBride", 32.0);
		graphUtils.addEdge(graph, "McBride", "Legrand", 21.0);
		graphUtils.addEdge(graph, "Lagrand", "Goat River", 24.0);
		graphUtils.addEdge(graph, "Goat River", "Crescent Spur", 10.0);
		graphUtils.addEdge(graph, "Screscent Spur", "Loos", 3.0);
		graphUtils.addEdge(graph, "Loos", "Rock Pit", 18.0);
		graphUtils.addEdge(graph, "Rock Pit", "Kidd", 8.0);
		graphUtils.addEdge(graph, "Kidd", "Dome Creek", 6.0);
		graphUtils.addEdge(graph, "Dome Creek", "Bend", 3.0);
		graphUtils.addEdge(graph, "Bend", "Penny", 19.0);
		graphUtils.addEdge(graph, "Penny", "Longworth", 16.0);
		graphUtils.addEdge(graph, "Longworth", "Hutton", 13.0);
		graphUtils.addEdge(graph, "Hutton", "Sinclair Mills", 5.0);
		graphUtils.addEdge(graph, "Sinclair Mills", "McGregor", 12.0);
		graphUtils.addEdge(graph, "McGregor", "Hansard", 3.0);
		graphUtils.addEdge(graph, "Hansard", "Upper Fraser", 6.0);
		graphUtils.addEdge(graph, "Upper Fraser", "Aleza Lake", 8.0);
		graphUtils.addEdge(graph, "Aleza Lake", "Giscome", 22.0);
		graphUtils.addEdge(graph, "Giscome", "Willow River", 7.0);
		graphUtils.addEdge(graph, "Willow River", "Shelley", 15.0);
		graphUtils.addEdge(graph, "Shelley", "Prince George", 16.0);
		graphUtils.addEdge(graph, "Prince George", "Vanderhoof", 112.0);
		graphUtils.addEdge(graph, "Vanderhoof", "Engen", 21.0);
		graphUtils.addEdge(graph, "Engen", "Fort Fraser", 19.0);
		graphUtils.addEdge(graph, "Fort Fraser", "Lejac", 15.0);
		graphUtils.addEdge(graph, "Lejac", "Endako", 19.0);
		graphUtils.addEdge(graph, "Endako", "Burns Lake", 56.0);
		graphUtils.addEdge(graph, "Burns Lake", "Houston", 83.0);
		graphUtils.addEdge(graph, "Houston", "Telkwa", 48.0);
		graphUtils.addEdge(graph, "Telkwa", "Smithers", 14.0);
		graphUtils.addEdge(graph, "Smithers", "New Hazelton", 74.0);
		graphUtils.addEdge(graph, "New Hazelton", "Skeena Crossing", 26.0);
		graphUtils.addEdge(graph, "Skeena Crossing", "Kitwanga", 18.0);
		graphUtils.addEdge(graph, "Kitwanga", "Woodcock", 12.0);
		graphUtils.addEdge(graph, "Woodcock", "Cedarvale", 9.0);
		graphUtils.addEdge(graph, "Cedarvale", "Ritchie", 13.0);
		graphUtils.addEdge(graph, "Ritchie", "Dorreen", 11.0);
		graphUtils.addEdge(graph, "Dorreen", "Pacific", 10.0);
		graphUtils.addEdge(graph, "Pacific", "Pitman", 9.0);
		graphUtils.addEdge(graph, "Pitman", "Usk", 10.0);
		graphUtils.addEdge(graph, "Usk", "Mileage 125.7", 11.0);
		graphUtils.addEdge(graph, "Mileage 125.7", "Terrace (Kitimat)", 10.0);
		graphUtils.addEdge(graph, "Terrace (Kitimat)", "Kwinitsa", 77.0);
		graphUtils.addEdge(graph, "Kwinitsa", "Tyee", 32.0);
		graphUtils.addEdge(graph, "Tyee", "Haysport", 5.0);
		graphUtils.addEdge(graph, "Haysport", "Cassiar", 14.0);
		graphUtils.addEdge(graph, "Cassiar", "Port Edward", 10.0);
		graphUtils.addEdge(graph, "Port Edward", "Prince Rupert", 14.0);
		
		// Montreal - Washington
		graphUtils.addEdge(graph, "Montréal", "Cantic", 71.0);
		graphUtils.addEdge(graph, "Cantic", "St Albans", 40.0);
		graphUtils.addEdge(graph, "St Albans", "Essex Junction", 39.0);
		graphUtils.addEdge(graph, "Essex Junction", "Waterbury", 35.0);
		graphUtils.addEdge(graph, "Waterbury", "Montpelier Junction", 16.0);
		graphUtils.addEdge(graph, "Montpelier Junction", "White River Junction", 98.0);
		graphUtils.addEdge(graph, "White River Junction", "Bellows Falls", 63.0);
		graphUtils.addEdge(graph, "Bellows Falls", "Brattleboro", 39.0);
		graphUtils.addEdge(graph, "Brattleboro", "Northampton", 67.0);
		graphUtils.addEdge(graph, "Northampton", "Springfield", 29.0);
		graphUtils.addEdge(graph, "Springfield", "Hartford", 40.0);
		graphUtils.addEdge(graph, "Hartford", "Berlin", 18.0);
		graphUtils.addEdge(graph, "Berlin", "Meriden", 11.0);
		graphUtils.addEdge(graph, "Meriden", "New Haven", 31.0);
		graphUtils.addEdge(graph, "New Haven", "Bridgeport", 27.0);
		graphUtils.addEdge(graph, "Bridgeport", "Stamford", 36.0);
		graphUtils.addEdge(graph, "Stamford", "Rye", 14.0);
		graphUtils.addEdge(graph, "Rye", "New York", 31.0);
		graphUtils.addEdge(graph, "New York", "Newark", 29.0);
		graphUtils.addEdge(graph, "Newark", "Princeton Junction", 62.0);
		graphUtils.addEdge(graph, "Princeton Junction", "Trenton", 15.0);
		graphUtils.addEdge(graph, "Trenton", "North Philadelphia", 45.0);
		graphUtils.addEdge(graph, "North Philadelphia", "Philadelphia", 6.0);
		graphUtils.addEdge(graph, "Philadelphia", "Wilmington", 42.0);
		graphUtils.addEdge(graph, "Wilmington", "Baltimore", 110.0);
		graphUtils.addEdge(graph, "Baltimore", "Capital Beltway", 50.0);
		graphUtils.addEdge(graph, "Capital Beltway", "Washington", 14.0);
		
		// New Westminster - San Diego
		graphUtils.addEdge(graph, "New Westminster", "Blaine", 38.0);
		graphUtils.addEdge(graph, "Blaine", "Bellingham", 36.0);
		graphUtils.addEdge(graph, "Bellingham", "Mt Vernon - Burlington", 43.0);
		graphUtils.addEdge(graph, "Mt Vernon - Burlington", "Everett", 61.0);
		graphUtils.addEdge(graph, "Everett", "Edmonds", 24.0);
		graphUtils.addEdge(graph, "Edmonds", "Seattle", 29.0);
		graphUtils.addEdge(graph, "Seattle", "Portland", 299.0);
		graphUtils.addEdge(graph, "Portland", "Oakland", 1145.0);
		graphUtils.addEdge(graph, "Oakland", "Los Angeles", 751.0);
		graphUtils.addEdge(graph, "Los Angeles", "San Diego", 340.0);
		
		// Montreal - New York
		graphUtils.addEdge(graph, "Montréal", "Montréal West", 8.0);
		graphUtils.addEdge(graph, "Montréal West", "Lacolle", 50.0);
		graphUtils.addEdge(graph, "Lacolle", "Rouses Point", 10.0);
		graphUtils.addEdge(graph, "Rouses Point", "Plattsburgh", 38.0);
		graphUtils.addEdge(graph, "Plattsburgh", "Fort Ticonderoga", 110.0);
		graphUtils.addEdge(graph, "Fort Ticonderoga", "Saratoga Springs", 99.0);
		graphUtils.addEdge(graph, "Saratoga Springs", "Albany-Rensselaer", 73.0);
		graphUtils.addEdge(graph, "Albany-Rensselaer", "New York", 227.0);
		
		// Port Huron - Chicago
		graphUtils.addEdge(graph, "Port Huron", "Lapeer", 71.0);
		graphUtils.addEdge(graph, "Lapeer", "Flint", 32.0);
		graphUtils.addEdge(graph, "Flint", "Durand", 27.0);
		graphUtils.addEdge(graph, "Durand", "East Lansing", 49.0);
		graphUtils.addEdge(graph, "East Lansing", "Battle Creek", 77.0);
		graphUtils.addEdge(graph, "Battle Creek", "Kalamazoo", 38.0);
		graphUtils.addEdge(graph, "Kalamazoo", "Niles", 76.0);
		graphUtils.addEdge(graph, "Niles", "Chicago", 143.0);
		
		// Detroit - Battle Creek
		graphUtils.addEdge(graph, "Detroit", "Ann Arbour", 58.0);
		graphUtils.addEdge(graph, "Ann Arbour", "Jackson", 56.0);
		graphUtils.addEdge(graph, "Jackson", "Battle Creek", 77.0);
		
		// Detroit - Albany
		graphUtils.addEdge(graph, "Detroit", "Windsor", 3.0);
		graphUtils.addEdge(graph, "Windsor", "Buffalo", 380.0);
		graphUtils.addEdge(graph, "Buffalo", "Albany-Rensselaer", 478.0);
		
		// Charny - Quebec
		graphUtils.addEdge(graph, "Quebec", "Ste-Foy", 18.0);
		graphUtils.addEdge(graph, "Ste-Foy", "Charny", 5.0);
		
		// Dorval - Toronto
		graphUtils.addEdge(graph, "Dorval", "Cornwall", 92.0);
		graphUtils.addEdge(graph, "Cornwall", "Prescott", 74.0);
		graphUtils.addEdge(graph, "Prescott", "Brockville", 19.0);
		graphUtils.addEdge(graph, "Brockville", "Gananoque", 46.0);
		graphUtils.addEdge(graph, "Gananoque", "Kingston", 35.0);
		graphUtils.addEdge(graph, "Kingston", "Napanee", 37.0);
		graphUtils.addEdge(graph, "Napanee", "Belleville", 35.0);
		graphUtils.addEdge(graph, "Belleville", "Trenton Junction", 20.0);
		graphUtils.addEdge(graph, "Trenton Junction", "Cobourg", 50.0);
		graphUtils.addEdge(graph, "Cobourg", "Port Hope", 11.0);
		graphUtils.addEdge(graph, "Port Hope", "Oshawa", 50.0);
		graphUtils.addEdge(graph, "Oshawa", "Guildwood", 31.0);
		graphUtils.addEdge(graph, "Guildwood", "Toronto", 20.0);
		
		// Ottawa - Brockville
		graphUtils.addEdge(graph, "Ottawa", "Smiths Falls", 66.0);
		graphUtils.addEdge(graph, "Smiths Falls", "Brockville", 45.0);
		
		// Toronto - Windsor
		graphUtils.addEdge(graph, "Toronto", "Oakville", 34.0);
		graphUtils.addEdge(graph, "Oakville", "Burlington", 18.0);
		graphUtils.addEdge(graph, "Burlington", "Hamilton", 11.0);
		graphUtils.addEdge(graph, "Hamilton", "Dundas", 4.0);
		graphUtils.addEdge(graph, "Dundas", "Brantford", 29.0);
		graphUtils.addEdge(graph, "Brantford", "Woodstock", 43.0);
		graphUtils.addEdge(graph, "Woodstock", "Ingersoll", 15.0);
		graphUtils.addEdge(graph, "Ingersoll", "London", 31.0);
		graphUtils.addEdge(graph, "London", "Glencoe", 49.0);
		graphUtils.addEdge(graph, "Glencoe", "Chatham", 56.0);
		graphUtils.addEdge(graph, "Chatham", "Windsor", 70.0);
		
		// London - Sarnia
		graphUtils.addEdge(graph, "London", "Strathroy", 32.0);
		graphUtils.addEdge(graph, "Strathroy", "Watford", 22.0);
		graphUtils.addEdge(graph, "Watford", "Wyoming", 19.0);
		graphUtils.addEdge(graph, "Wyoming", "Sarnia", 22.0);
		
		// Toronto - London via Kitcheneer
		graphUtils.addEdge(graph, "Toronto", "West Toronto", 8.0);
		graphUtils.addEdge(graph, "West Toronto", "Weston", 6.0);
		graphUtils.addEdge(graph, "Westpn", "Malton", 11.0);
		graphUtils.addEdge(graph, "Malton", "Brampton", 9.0);
		graphUtils.addEdge(graph, "Brampton", "Georgetown", 13.0);
		graphUtils.addEdge(graph, "Georgetown", "Guelph", 32.0);
		graphUtils.addEdge(graph, "Guelph", "Kitchener", 22.0);
		graphUtils.addEdge(graph, "Kitchener", "Stratford", 42.0);
		graphUtils.addEdge(graph, "Stratford", "St Marys", 17.0);
		graphUtils.addEdge(graph, "St Marys", "London", 35.0);
		
		// Burlington - Niagara Falls
		graphUtils.addEdge(graph, "Burlington", "Hamilton", 11.0);
		graphUtils.addEdge(graph, "Hamilton", "Grimsby", 27.0);
		graphUtils.addEdge(graph, "Grimsby", "St Catharines", 9.0);
		graphUtils.addEdge(graph, "St Catharines", "Niagara Falls", 34.0);
		
		// Toronto - Stouffville
		graphUtils.addEdge(graph, "Toronto", "Agincourt", 22.0);
		graphUtils.addEdge(graph, "Agincourt", "Milliken", 5.0);
		graphUtils.addEdge(graph, "Milliken", "Unionville", 4.0);
		graphUtils.addEdge(graph, "Unionville", "Markham", 5.0);
		graphUtils.addEdge(graph, "Markham", "Soutffville", 10.0);
		
		// St-Hyacinthe - Coaticook
		graphUtils.addEdge(graph, "St-Hyacinthe", "St-Liboire", 15.0);
		graphUtils.addEdge(graph, "St-Liboire", "Upton", 5.0);
		graphUtils.addEdge(graph, "Upton", "Actonvale", 10.0);
		graphUtils.addEdge(graph, "Actonvale", "South Durham", 19.0);
		graphUtils.addEdge(graph,  "South Durham", "Richmond", 17.0);
		graphUtils.addEdge(graph, "Richmond", "Windsor", 16.0);
		graphUtils.addEdge(graph, "Windsor", "Bromptonville", 13.0);
		graphUtils.addEdge(graph, "Bromptonville", "Sherbrooke", 10.0);
		graphUtils.addEdge(graph, "Sherbooke", "Lennoxville", 5.0);
		graphUtils.addEdge(graph, "Lennoxville", "Waterville", 11.0);
		graphUtils.addEdge(graph, "Waterville", "Compton", 6.0);
		graphUtils.addEdge(graph, "Compton", "Coaticook", 13.0);
		
		// Richmond - Charny
		graphUtils.addEdge(graph, "Richmond", "St-Cyr", 11.0);
		graphUtils.addEdge(graph, "St-Cyr", "Danville", 9.0);
		graphUtils.addEdge(graph, "Danville", "Warwick", 19.0);
		graphUtils.addEdge(graph, "Warwick", "Victoriaville", 12.0);
		graphUtils.addEdge(graph, "Victoriaville", "Princeville", 15.0);
		graphUtils.addEdge(graph, "Princeville", "Plessissville", 10.0);
		graphUtils.addEdge(graph, "Plessissville", "Ste-Julie", 13.0);
		graphUtils.addEdge(graph, "Ste-Julie", "Lyster", 7.0);
		graphUtils.addEdge(graph, "Lyster", "Dosquet", 13.0);
		graphUtils.addEdge(graph, "Dosquet", "St-Agapit", 13.0);
		graphUtils.addEdge(graph, "St-Agapit", "Chaudière", 19.0);
		graphUtils.addEdge(graph, "Chaudière", "Charny", 2.0);
		
		// Chambord - Dolbeau
		graphUtils.addEdge(graph, "Chamboard", "Roberval", 19.0);
		graphUtils.addEdge(graph, "Roberval", "Pointe-Bleue", 8.0);
		graphUtils.addEdge(graph, "Pointe-Bleue", "St-Prime", 9.0);
		graphUtils.addEdge(graph, "St-Prime", "St-Félicien", 12.0);
		graphUtils.addEdge(graph, "St-Félicien", "Normandin", 21.0);
		graphUtils.addEdge(graph, "Normandin", "Albenel", 8.0);
		graphUtils.addEdge(graph, "Albenel", "Dolbeau", 15.0);
		
		// Moncton - Charny
		graphUtils.addEdge(graph, "Moncton", "Chipman", 93.0);
		graphUtils.addEdge(graph, "Chipman", "McGivney", 64.0);
		graphUtils.addEdge(graph, "McGivney", "Napadogan", 34.0);
		graphUtils.addEdge(graph, "Napadogan", "Juniper", 25.0);
		graphUtils.addEdge(graph, "Juniper", "Plaster Rock", 52.0);
		graphUtils.addEdge(graph, "Plaster Rock", "Grand Falls", 45.0);
		graphUtils.addEdge(graph, "Grand Falls", "St Leonard", 18.0);
		graphUtils.addEdge(graph, "St Leonard", "Edmundston", 41.0);
		graphUtils.addEdge(graph, "Edmundston", "Rivière-Bleue", 73.0);
		graphUtils.addEdge(graph, "Rivière-Bleue", "Estcourt", 16.0);
		graphUtils.addEdge(graph, "Estcourt", "Monk", 110.0);
		graphUtils.addEdge(graph, "Monk", "Ste-Claire", 118.0);
		graphUtils.addEdge(graph, "Ste-Claire", "Joffre", 47.0);
		graphUtils.addEdge(graph, "Joffre", "Charny", 2.0);
		
		// Quebec - Clermont
		graphUtils.addEdge(graph, "Quebec", "Limoilou", 1.0);
		graphUtils.addEdge(graph, "Limoilou", "Montmorency", 9.0);
		graphUtils.addEdge(graph, "Montmorency", "L'Ange-Gardien", 6.0);
		graphUtils.addEdge(graph, "L'Angee-Gardien", "Château-Richer", 9.0);
		graphUtils.addEdge(graph, "Château-Richer", "Ste-Anne-de-Baupré", 8.0);
		graphUtils.addEdge(graph, "Ste-Anne-de-Baupré", "Beaupré", 4.0);
		graphUtils.addEdge(graph, "Beaupré", "St-Joachim", 3.0);
		graphUtils.addEdge(graph, "St-Joachim", "Sault-au-Cochon", 26.0);
		graphUtils.addEdge(graph, "Sault-au-Cochon", "Labatis", 5.0);
		graphUtils.addEdge(graph, "Labatis", "Grande-Pointe", 4.0);
		graphUtils.addEdge(graph, "Grande-Pointe", "Petite-Rivière", 5.0);
		graphUtils.addEdge(graph, "Petite-Rivière", "Maillard", 3.0);
		graphUtils.addEdge(graph, "Maillard", "Baie-St-Paul", 13.0);
		graphUtils.addEdge(graph, "Baie-St-Paul", "Gravel & Thibault", 6.0);
		graphUtils.addEdge(graph, "Gravel & Thimbault", "Les Éboulements", 7.0);
		graphUtils.addEdge(graph, "Les Éboulements", "Cap-aux-Oies", 11.0);
		graphUtils.addEdge(graph, "Cap-aux-Oies", "Bouliane", 3.0);
		graphUtils.addEdge(graph, "Bouliane", "Ruisseau-Jureux", 3.0);
		graphUtils.addEdge(graph, "Ruisseau-Jureau", "St-Irénée", 3.0);
		graphUtils.addEdge(graph, "St-Irénée", "Pointe-au-Pic", 9.0);
		graphUtils.addEdge(graph, "Pointe-au-Pic", "La Malbaie", 3.0);
		graphUtils.addEdge(graph, "La Malbaie", "Clermont", 7.0);
		
		// Senneterre - Noranda-Rouyn
		graphUtils.addEdge(graph, "Senneterre", "Val-d'Or", 59.0);
		graphUtils.addEdge(graph, "Val-d'Or", "Malartic", 27.0);
		graphUtils.addEdge(graph, "Malartic", "Cadillac", 22.0);
		graphUtils.addEdge(graph, "Cadillac", "Noranda-Rouyn", 55.0);
		
		// Limoilou - Riviere-a-Pierre
		graphUtils.addEdge(graph, "Limoilou", "Loretteville", 13.0);
		graphUtils.addEdge(graph, "Loretteville", "Valcartier", 12.0);
		graphUtils.addEdge(graph, "Valcartier", "Lac-Sergent", 18.0);
		graphUtils.addEdge(graph, "Lac-Sergent", "Bourg-Louis", 4.0);
		graphUtils.addEdge(graph, "Bourg-Louis", "St-Raymond", 7.0);
		graphUtils.addEdge(graph, "St-Raymond", "Allen's Mill", 12.0);
		graphUtils.addEdge(graph, "Allen's Mill", "Perthuis", 14.0);
		graphUtils.addEdge(graph, "Perthuis", "Rivière-à-Pierre", 10.0);
		
		// Montreal - Chicoutimi
		graphUtils.addEdge(graph, "Montréal", "Mont Royal", 6.0);
		graphUtils.addEdge(graph, "Mont Royal", "Ahuntsic", 6.0);
		graphUtils.addEdge(graph, "Ahuntsic", "Pointe-aux-Trembles", 19.0);
		graphUtils.addEdge(graph, "Pointe-aux-Trembles", "St-Paul-L'Ermite", 9.0);
		graphUtils.addEdge(graph, "St-Paul-L'Ermite", "L'Assomption", 8.0);
		graphUtils.addEdge(graph, "L'Assomption", "L'Épiphanie", 5.0);
		graphUtils.addEdge(graph, "L'Épiphanie", "Salomé", 8.0);
		graphUtils.addEdge(graph, "Salomé", "Crabtree", 4.0);
		graphUtils.addEdge(graph, "Crabtree", "Joliette", 8.0);
		graphUtils.addEdge(graph, "Joliette", "Ste-Élizabeth", 10.0);
		graphUtils.addEdge(graph, "Ste-Élizabeth", "St-Norbert", 8.0);
		graphUtils.addEdge(graph, "St-Norbert", "St-Cuthbert", 3.0);
		graphUtils.addEdge(graph, "St-Cuthbert", "St-Barthélémy", 9.0);
		graphUtils.addEdge(graph, "St-Barthélémy", "St-Justin", 8.0);
		graphUtils.addEdge(graph, "St-Justin", "Ste-Ursule", 7.0);
		graphUtils.addEdge(graph, "Ste-Ursule", "Prémont", 4.0);
		graphUtils.addEdge(graph, "Prémont", "St-Paulin", 5.0);
		graphUtils.addEdge(graph, "St-Paulin", "Charette", 9.0);
		graphUtils.addEdge(graph, "Charette", "St-Boniface", 10.0);
		graphUtils.addEdge(graph, "St-Boniface", "Shawinigan", 11.0);
		graphUtils.addEdge(graph, "Shawinigan", "Grande Mère", 8.0);
		graphUtils.addEdge(graph, "Grand Mère", "Garneau", 6.0);
		graphUtils.addEdge(graph, "Garneau", "Hérouxville", 6.0);
		graphUtils.addEdge(graph, "Hérouxville", "St-Tite", 7.0);
		graphUtils.addEdge(graph, "St-Tite", "Ste-Thècle", 12.0);
		graphUtils.addEdge(graph, "Ste-Thècle", "Hervey", 6.0);
		graphUtils.addEdge(graph, "Hervey", "Lac-aux-Sables", 8.0);
		graphUtils.addEdge(graph, "Lac-aux-Sables", "Montauban", 7.0);
		graphUtils.addEdge(graph, "Montauban", "Rousseau", 6.0);
		graphUtils.addEdge(graph, "Rousseau", "Rivière-à-Pierre", 13.0);
		graphUtils.addEdge(graph, "Rivière-à-Pierre", "Talbot Club", 11.0);
		graphUtils.addEdge(graph, "Talbot Club", "Talbot", 1.0);
		graphUtils.addEdge(graph, "Talbot", "Lemieux", 5.0);
		graphUtils.addEdge(graph, "Lemieux", "Laurentides", 3.0);
		graphUtils.addEdge(graph, "Laurentides", "Laurent", 2.0);
		graphUtils.addEdge(graph, "Laurent", "Migwick", 9.0);
		graphUtils.addEdge(graph, "Migwick", "Linton", 4.0);
		graphUtils.addEdge(graph, "Linton", "Orléans Club", 1.0);
		graphUtils.addEdge(graph, "Orléans Club", "Jacques-Cartier Club", 7.0);
		graphUtils.addEdge(graph, "Jacques-Cartier Club", "Falrie", 3.0);
		graphUtils.addEdge(graph, "Falrie", "St-Hilaire", 2.0);
		graphUtils.addEdge(graph, "St-Hilaire", "Iroquois Club", 7.0);
		graphUtils.addEdge(graph, "Iroquois Club", "Stadacona", 3.0);
		graphUtils.addEdge(graph, "Stadacona", "Sanford", 7.0);
		graphUtils.addEdge(graph, "Sanford", "Pearl Lake", 6.0);
		graphUtils.addEdge(graph, "Pearl Lake", "Hirondelle", 2.0);
		graphUtils.addEdge(graph, "Hirondelle", "Club Nicol", 4.0);
		graphUtils.addEdge(graph, "Club Nicol", "Triton Club", 4.0);
		graphUtils.addEdge(graph, "Triton Club", "Lac-Édouard", 8.0);
		graphUtils.addEdge(graph, "Lac-Édouard", "Club Grégoire", 13.0);
		graphUtils.addEdge(graph, "Club Grégoire", "Micro Wave Tower", 2.0);
		graphUtils.addEdge(graph, "Micro Wave Tower", "Summit Club", 2.0);
		graphUtils.addEdge(graph, "Summit Club", "Summit", 2.0);
		graphUtils.addEdge(graph, "Summmit", "Kiskisink", 16.0);
		graphUtils.addEdge(graph, "Kiskisink", "Métabetchouan Club", 0.5);
		graphUtils.addEdge(graph, "Métabetchouan Club", "Van Bruyssels", 1.0);
		graphUtils.addEdge(graph, "Van Bruyssels", "Kondiaronk", 10.0);
		graphUtils.addEdge(graph, "Kondiaronk", "Lizotte", 10.0);
		graphUtils.addEdge(graph, "Lizotte", "Mink Lake", 5.0);
		graphUtils.addEdge(graph, "Mink Lake", "St-André", 5.0);
		graphUtils.addEdge(graph, "St-André", "Lac-Bouchette", 10.0);
		graphUtils.addEdge(graph, "Lac-Bouchette", "Bilodeau", 8.0);
		graphUtils.addEdge(graph, "Bilodeau", "Chambord", 19.0);
		graphUtils.addEdge(graph, "Chambord", "Desbiens", 9.0);
		graphUtils.addEdge(graph, "Desbiens", "Métabetchouan", 6.0);
		graphUtils.addEdge(graph, "Métabetchouan", "St-Gédéon", 9.0);
		graphUtils.addEdge(graph, "St-Gédéon", "Hébertville", 11.0);
		graphUtils.addEdge(graph, "Hébertville", "Jonquière", 32.0);
		graphUtils.addEdge(graph, "Jonqière", "Arvida", 5.0);
		graphUtils.addEdge(graph, "Arvida", "Chicoutimi", 11.0);
		
		// Hervey - Cochrane
		graphUtils.addEdge(graph, "Hervey", "Doheny", 30.0);
		graphUtils.addEdge(graph, "Doheny", "La Tuque", 51.0);
		graphUtils.addEdge(graph, "La Tuque", "Fitzpatrick", 5.0);
		graphUtils.addEdge(graph, "Fitzpatrick", "Cressman", 24.0);
		graphUtils.addEdge(graph, "Cressman", "Club Vermillion", 7.0);
		graphUtils.addEdge(graph, "Club Vermillion", "Rapide-Blanc", 2.0);
		graphUtils.addEdge(graph, "Rapide-Blanc", "Lac-Darey", 13.0);
		graphUtils.addEdge(graph, "Lac-Darey", "Duplessis", 10.0);
		graphUtils.addEdge(graph, "Duplessis", "McTavis Club", 13.0);
		graphUtils.addEdge(graph, "McTavis Club", "Windigo", 2.0);
		graphUtils.addEdge(graph, "Windigo", "Ferguson", 9.0);
		graphUtils.addEdge(graph, "Ferguson", "Nat Defence", 6.0);
		graphUtils.addEdge(graph, "Nat Defence", "St Maurice Riv Boom", 2.0);
		graphUtils.addEdge(graph, "St Maurice Riv Boom", "Weymont", 3.0);
		graphUtils.addEdge(graph, "Weymont", "Sanmaur", 3.0);
		graphUtils.addEdge(graph, "Sanmaur", "Cann", 7.0);
		graphUtils.addEdge(graph, "Cann", "Club Bélanger", 5.0);
		graphUtils.addEdge(graph, "Club Bélanger", "Nat Defence 2", 9.0);
		graphUtils.addEdge(graph, "Nat Defence 2", "Hibbard", 3.0);
		graphUtils.addEdge(graph, "Hibbard", "Casey", 15.0);
		graphUtils.addEdge(graph, "Casey", "McCarthy", 17.0);
		graphUtils.addEdge(graph, "McCarthy", "Sisco Club", 2.0);
		graphUtils.addEdge(graph, "Sisco Club", "Wapoos", 9.0);
		graphUtils.addEdge(graph, "Wapoos", "Parent", 12.0);
		graphUtils.addEdge(graph, "Parent", "Timbrell", 13.0);
		graphUtils.addEdge(graph, "Timbrell", "Club Rita Inc", 8.0);
		graphUtils.addEdge(graph, "Club Rita Inc", "Strachan", 5.0);
		graphUtils.addEdge(graph, "Strachan", "Maniwawa Club", 4.0);
		graphUtils.addEdge(graph, "Maniwawa Club", "Nat Defence 3", 5.0);
		graphUtils.addEdge(graph, "Nat Defence 3", "Greening", 3.0);
		graphUtils.addEdge(graph, "Greening", "Oskelaneo Lodge", 6.0);
		graphUtils.addEdge(graph, "Oskelaneo Lodge", "Oskelaneo River", 11.0);
		graphUtils.addEdge(graph, "Oskelaneo River", "Clova", 12.0);
		graphUtils.addEdge(graph, "Clova", "Coquar", 10.0);
		graphUtils.addEdge(graph, "Coquar", "Monet", 12.0);
		graphUtils.addEdge(graph, "Monet", "Consolidated Bathurst", 11.0);
		graphUtils.addEdge(graph, "Consolidated Bathurst", "Kapitachuan Club", 3.0);
		graphUtils.addEdge(graph, "Kapitachuan Club", "Bourmont", 2.0);
		graphUtils.addEdge(graph, "Bourmont", "Club Beaudin Inc", 6.0);
		graphUtils.addEdge(graph, "Club Beaudin Inc", "Da-Rou-Lac Lodge", 7.0);
		graphUtils.addEdge(graph, "Da-Rou-Lac-Lodge", "Langlade", 0.5);
		graphUtils.addEdge(graph, "Langlade", "Gagnon", 12.0);
		graphUtils.addEdge(graph, "Gagnon", "Dix", 2.0);
		graphUtils.addEdge(graph, "Dix", "Bolger, Que", 13.0);
		graphUtils.addEdge(graph, "Bolger, Que", "Forsythe", 9.0);
		graphUtils.addEdge(graph, "Forsythe", "Paradis", 12.0);
		graphUtils.addEdge(graph, "Paradis", "Press", 12.0);
		graphUtils.addEdge(graph, "Press", "Signal", 10.0);
		graphUtils.addEdge(graph, "Signal", "Mégiscane", 21.0);
		graphUtils.addEdge(graph, "Mégiscane", "Senneterre", 13.0);
		graphUtils.addEdge(graph, "Senneterre", "Belcourt", 9.0);
		graphUtils.addEdge(graph, "Belcourt", "Barraute", 21.0);
		graphUtils.addEdge(graph, "Barraute", "Landrienne", 28.0);
		graphUtils.addEdge(graph, "Landrienne", "Amos", 12.0);
		graphUtils.addEdge(graph, "Amos", "Clercs-St-Viateur", 9.0);
		graphUtils.addEdge(graph, "Clercs-St-Viateur", "Villemontel", 11.0);
		graphUtils.addEdge(graph, "Villemontel", "Launay", 13.0);
		graphUtils.addEdge(graph, "Launay", "Taschereau", 12.0);
		graphUtils.addEdge(graph, "Taschereau", "Authier", 15.0);
		graphUtils.addEdge(graph, "Authier", "Macamic", 11.0);
		graphUtils.addEdge(graph, "Macamic", "La Sarre", 16.0);
		graphUtils.addEdge(graph, "La Sarre", "Dupuy", 12.0);
		graphUtils.addEdge(graph, "Dupuy", "La Reine", 11.0);
		graphUtils.addEdge(graph, "La Reine", "Eades", 29.0);
		graphUtils.addEdge(graph, "Eades", "Mace", 4.0);
		graphUtils.addEdge(graph, "Mace", "Lowbush River", 18.0);
		graphUtils.addEdge(graph, "Lowbush River", "Stimson", 33.0);
		graphUtils.addEdge(graph, "Stimson", "Norembega", 9.0);
		graphUtils.addEdge(graph, "Norembega", "Brower", 9.0);
		graphUtils.addEdge(graph, "Brower", "Cochrane", 15.0);
		
		// Richmond Hill
		graphUtils.addEdge(graph, "St Clair Ave", "Richmond Hill", 26.0);
		graphUtils.addEdge(graph, "Richmond Hill", "Newmarket", 11.0);
		
		// Washago - North Bay
		graphUtils.addEdge(graph, "Washago", "Gravenhurst", 38.0);
		graphUtils.addEdge(graph, "Gravenhurst", "Bracebridge", 16.0);
		graphUtils.addEdge(graph, "Bracebridge", "Utterson", 21.0);
		graphUtils.addEdge(graph, "Utterson", "Huntsville", 17.0);
		graphUtils.addEdge(graph, "Huntsville", "Burk's Falls", 41.0);
		graphUtils.addEdge(graph, "Burk's Falls", "Sundridge", 19.0);
		graphUtils.addEdge(graph, "Sundridge", "South River", 9.0);
		graphUtils.addEdge(graph, "South River", "Powassan", 30.0);
		graphUtils.addEdge(graph, "Powassan", "North Bay", 33.0);
		
		// North Bay - Swastika
		graphUtils.addEdge(graph, "North Bay", "Temagami", 118.0);
		graphUtils.addEdge(graph, "Temagami", "Latchford", 35.0);
		graphUtils.addEdge(graph, "Latchford", "Cobalt", 14.0);
		graphUtils.addEdge(graph, "Cobalt", "Haileybury", 8.0);
		graphUtils.addEdge(graph, "Haileybury", "New Liskeard", 8.0);
		graphUtils.addEdge(graph, "New Liskeard", "Earlton", 20.0);
		graphUtils.addEdge(graph, "Earlton", "Englehart", 22.0);
		graphUtils.addEdge(graph, "Engelhart", "Swastika", 42.0);
		
		// Swastika - Noranda-Rouyn
		graphUtils.addEdge(graph, "Swastika", "Kirkland Lake", 9.0);
		graphUtils.addEdge(graph, "Kirkland Lake", "Larder Lake", 27.0);
		graphUtils.addEdge(graph, "Larder Lake", "Cheminis", 16.0);
		graphUtils.addEdge(graph, "Cheminis", "Noranda-Rouyn", 45.0);
		
		// Swastika - Porquis
		graphUtils.addEdge(graph, "Swastika", "Ramore", 48.0);
		graphUtils.addEdge(graph, "Ramore", "Matheson", 17.0);
		graphUtils.addEdge(graph, "Matheson", "Val-Gagné", 16.0);
		graphUtils.addEdge(graph, "Val-Gangé", "Porquis", 15.0);
		
		// Pourquis - Timmins
		graphUtils.addEdge(graph, "Pourquis", "Connaught", 16.0);
		graphUtils.addEdge(graph, "Connaught", "South Porcupine", 27.0);
		graphUtils.addEdge(graph, "South Porcupine", "Timmins", 10.0);
		
		// Porquis - Cochrane
		graphUtils.addEdge(graph, "Porquis", "Cochrane", 45.0);
		
		// Cochrane - Kapuskasing
		graphUtils.addEdge(graph, "Cochrane", "Frederick", 10.0);
		graphUtils.addEdge(graph, "Frederick", "Smooth Rock", 39.0);
		graphUtils.addEdge(graph, "Smooth Rock", "Strickland", 18.0);
		graphUtils.addEdge(graph, "Strickland", "Fauquier", 13.0);
		graphUtils.addEdge(graph, "Fauquier", "Moonbeam", 10.0);
		graphUtils.addEdge(graph, "Moonbeam", "Kapuskasing", 22.0);
		
		// Kapuskasing - Hearst
		graphUtils.addEdge(graph, "Kapuskasing", "Valrita", 9.0);
		graphUtils.addEdge(graph, "Valrita", "Harty", 11.0);
		graphUtils.addEdge(graph, "Harty", "Opasatika", 15.0);
		graphUtils.addEdge(graph, "Opasatika", "Lowther", 12.0);
		graphUtils.addEdge(graph, "Lowther", "Mattice", 18.0);
		graphUtils.addEdge(graph, "Mattice", "Hallebourg", 19.0);
		graphUtils.addEdge(graph, "Hallenbourg", "Hearst", 12.0);
		
		// Thunder Bay North - Sioux lookout
		graphUtils.addEdge(graph, "Thunder Bay North", "Thunder Bay", 7.0);
		graphUtils.addEdge(graph, "Thunder Bay", "Neebing", 8.0);
		graphUtils.addEdge(graph, "Neebing", "Twin City", 5.0);
		graphUtils.addEdge(graph, "Twin City", "Kakabeka Falls", 16.0);
		graphUtils.addEdge(graph, "Kakabeka Falls", "Mokomon", 13.0);
		graphUtils.addEdge(graph, "Mokomon", "Ellis", 15.0);
		graphUtils.addEdge(graph, "Ellis", "Raith", 29.0);
		graphUtils.addEdge(graph, "Raith", "Linko", 27.0);
		graphUtils.addEdge(graph, "Linko", "Larson", 23.0);
		graphUtils.addEdge(graph, "Larson", "Mack", 10.0);
		graphUtils.addEdge(graph, "Mack", "Graham", 18.0);
		graphUtils.addEdge(graph, "Graham", "Quorn", 44.0);
		graphUtils.addEdge(graph, "Quorn", "Tannin", 20.0);
		graphUtils.addEdge(graph, "Tannin", "Valora", 20.0);
		graphUtils.addEdge(graph, "Valora", "Umfreville", 24.0);
		graphUtils.addEdge(graph, "Umfreville", "Alcona", 18.0);
		graphUtils.addEdge(graph, "Alcona", "Sioux Lookout", 27.0);
		
		// Kakabeka Falls - Winnipeg
		graphUtils.addEdge(graph, "Kakabeka Falls", "Conmee", 21.0);
		graphUtils.addEdge(graph, "Conmee", "Shabaqua", 28.0);
		graphUtils.addEdge(graph, "Shabaqua", "Mabella", 8.0);
		graphUtils.addEdge(graph, "Mabella", "Shebandowan", 7.0);
		graphUtils.addEdge(graph, "Shebandowan", "Rossmere", 6.0);
		graphUtils.addEdge(graph, "Rossmere", "Postans", 17.0);
		graphUtils.addEdge(graph, "Postans", "Kashabowie", 7.0);
		graphUtils.addEdge(graph, "Kashabowie", "Keego", 15.0);
		graphUtils.addEdge(graph, "Keego", "Huronian", 10.0);
		graphUtils.addEdge(graph, "Huronian", "Owakonze", 8.0);
		graphUtils.addEdge(graph, "Owakonze", "Wells Camp", 4.0);
		graphUtils.addEdge(graph, "Wells Camp", "Abiwin", 16.0);
		graphUtils.addEdge(graph, "Abiwin", "Kawene", 11.0);
		graphUtils.addEdge(graph, "Kawene", "Sapawe", 11.0);
		graphUtils.addEdge(graph, "Sapawe", "Atitokan", 23.0);
		graphUtils.addEdge(graph, "Atitokan", "Flanders", 36.0);
		graphUtils.addEdge(graph, "Flanders", "Calm Lake", 6.0);
		graphUtils.addEdge(graph, "Calm Lake", "Glenorchy", 19.0);
		graphUtils.addEdge(graph, "Glenorchy", "Mine Centre", 16.0);
		graphUtils.addEdge(graph, "Mine Centre", "Bear Pass", 26.0);
		graphUtils.addEdge(graph, "Bear Pass", "Fort Frances", 40.0);
		graphUtils.addEdge(graph, "Fort Frances", "Devlin", 20.0);
		graphUtils.addEdge(graph, "Devlin", "Emo", 12.0);
		graphUtils.addEdge(graph, "Emo", "Barwick", 11.0);
		graphUtils.addEdge(graph, "Barwick", "Stratton", 14.0);
		graphUtils.addEdge(graph, "Stratton", "Pinewood", 10.0);
		graphUtils.addEdge(graph, "Pinewood", "Sleemans", 10.0);
		graphUtils.addEdge(graph, "Sleemans", "Rainy River", 11.0);
		graphUtils.addEdge(graph, "Rainy River", "Baudette", 2.0);
		graphUtils.addEdge(graph, "Baudette", "Williams", 27.0);
		graphUtils.addEdge(graph, "Milliams", "Roosevelt", 11.0);
		graphUtils.addEdge(graph, "Roosevelt", "Warroad", 21.0);
		graphUtils.addEdge(graph, "Warroad", "International Boundary", 7.0);
		graphUtils.addEdge(graph, "International Boundary", "Sprague", 24.0);
		graphUtils.addEdge(graph, "Sprauge", "Badger", 32.0);
		graphUtils.addEdge(graph, "Badger", "Carrick", 9.0);
		graphUtils.addEdge(graph, "Carrick", "Woodridge", 9.0);
		graphUtils.addEdge(graph, "Woodridge", "Marchand", 28.0);
		graphUtils.addEdge(graph, "Marchand", "La Broquerie", 12.0);
		graphUtils.addEdge(graph, "La Broquerie", "Giroux", 8.0);
		graphUtils.addEdge(graph, "Giroux", "Ste Anne", 13.0);
		graphUtils.addEdge(graph, "Ste Anne", "Winnipeg", 43.0);
		
		// Portage-la-Prairie - Hudson Bay
		graphUtils.addEdge(graph, "Portage-la-Prairie", "Katrime", 38.0);
		graphUtils.addEdge(graph, "Katrime", "Gladstone", 21.0);
		graphUtils.addEdge(graph, "Gladstone", "McCreary", 77.0);
		graphUtils.addEdge(graph, "McCreary", "Laurier", 14.0);
		graphUtils.addEdge(graph, "Laurier", "Ochre River", 25.0);
		graphUtils.addEdge(graph, "Ochre River", "Dauphin", 20.0);
		graphUtils.addEdge(graph, "Dauphin", "Gilbert Plains", 32.0);
		graphUtils.addEdge(graph, "Gilbert Plains", "Grandview", 16.0);
		graphUtils.addEdge(graph, "Grandview", "Roblin", 53.0);
		graphUtils.addEdge(graph, "Roblin", "Makaroff", 19.0);
		graphUtils.addEdge(graph, "Makaroff", "Togo", 8.0);
		graphUtils.addEdge(graph, "Togo", "Runnymede", 14.0);
		graphUtils.addEdge(graph, "Runnymede", "Kamsack", 21.0);
		graphUtils.addEdge(graph, "Kamsack", "Veregin", 13.0);
		graphUtils.addEdge(graph, "Veregin", "Mikado", 13.0);
		graphUtils.addEdge(graph, "Mikado", "Canora", 12.0);
		graphUtils.addEdge(graph, "Canora", "Sturgis", 36.0);
		graphUtils.addEdge(graph, "Sturgis", "Endeavour", 28.0);
		graphUtils.addEdge(graph, "Endeavour", "Tall Pines", 22.0);
		graphUtils.addEdge(graph, "Tall Pines", "Reserve", 16.0);
		graphUtils.addEdge(graph, "Reserve", "Bertwell", 15.0);
		graphUtils.addEdge(graph, "Bertwell", "Clemenceau", 8.0);
		graphUtils.addEdge(graph, "Clemenceau", "Hudson Bay", 26.0);
		
		// Dauphin - Hudson Bay
		graphUtils.addEdge(graph, "Dauphin", "Sifton", 26.0);
		graphUtils.addEdge(graph, "Sifton", "Ukraina", 14.0);
		graphUtils.addEdge(graph, "Ukraina", "Ethelbert", 13.0);
		graphUtils.addEdge(graph, "Ethelbert", "Garland", 14.0);
		graphUtils.addEdge(graph, "Garland", "Pine River", 17.0);
		graphUtils.addEdge(graph, "Pine River", "Sclater", 17.0);
		graphUtils.addEdge(graph, "Sclater", "Cowan", 11.0);
		graphUtils.addEdge(graph, "Cowan", "Renwer", 18.0);
		graphUtils.addEdge(graph, "Renwer", "Minitonas", 15.0);
		graphUtils.addEdge(graph, "Minitonas", "Swan River", 18.0);
		graphUtils.addEdge(graph, "Swan River", "Bowsman", 16.0);
		graphUtils.addEdge(graph, "Bowsman", "Birch River", 19.0);
		graphUtils.addEdge(graph, "Birch River", "Mafeking", 33.0);
		graphUtils.addEdge(graph, "Mafeking", "Whitmore", 6.0);
		graphUtils.addEdge(graph, "Whitmore", "Baden", 8.0);
		graphUtils.addEdge(graph, "Baden", "Barrows", 17.0);
		graphUtils.addEdge(graph, "Barrows", "National Mills", 9.0);
		graphUtils.addEdge(graph, "National Mills", "Westgate", 5.0);
		graphUtils.addEdge(graph, "Westgate", "Hudson Bay", 50.0);
		
		// Hudson Bay - The Pas
		graphUtils.addEdge(graph, "Hudson Bay", "Wachee", 14.0);
		graphUtils.addEdge(graph, "Wachee", "Ceba", 15.0);
		graphUtils.addEdge(graph, "Ceba", "Chemong", 15.0);
		graphUtils.addEdge(graph, "Chemong", "Otosquen", 13.0);
		graphUtils.addEdge(graph, "Otosquen", "Cantyre", 13.0);
		graphUtils.addEdge(graph, "Cantyre", "Turnberry", 11.0);
		graphUtils.addEdge(graph, "Turnberry", "Whithorn", 16.0);
		graphUtils.addEdge(graph, "Whithorn", "Westray", 13.0);
		graphUtils.addEdge(graph, "Westray", "Freshford", 15.0);
		graphUtils.addEdge(graph, "Freshford", "The Pas", 17.0);
		
		// The Pas - Churchill
		graphUtils.addEdge(graph, "The Pas", "Tremaudan", 12.0);
		graphUtils.addEdge(graph, "Tremaudan", "Orok", 9.0);
		graphUtils.addEdge(graph, "Orok", "Atikameg Lake", 6.0);
		graphUtils.addEdge(graph, "Atikameg Lake", "Finger", 7.0);
		graphUtils.addEdge(graph, "Finger", "Budd", 14.0);
		graphUtils.addEdge(graph, "Budd", "Halcrow", 12.0);
		graphUtils.addEdge(graph, "Halcrow", "Cormorant", 7.0);
		graphUtils.addEdge(graph, "Cormorant", "Dering", 5.0);
		graphUtils.addEdge(graph, "Dering", "Rawebb", 15.0);
		graphUtils.addEdge(graph, "Rawebb", "Dyce", 13.0);
		graphUtils.addEdge(graph, "Dyce", "Paterson", 13.0);
		graphUtils.addEdge(graph, "Paterson", "Wekusko", 18.0);
		graphUtils.addEdge(graph, "Wekusko", "Turnbull", 19.0);
		graphUtils.addEdge(graph, "Turnbull", "Ponton", 22.0);
		graphUtils.addEdge(graph, "Ponton", "Button", 12.0);
		graphUtils.addEdge(graph, "Button", "Dunlop", 12.0);
		graphUtils.addEdge(graph, "Dunlop", "Pipun", 12.0);
		graphUtils.addEdge(graph, "Pipun", "Wabowden", 12.0);
		graphUtils.addEdge(graph, "Wabowden", "Medard", 8.0);
		graphUtils.addEdge(graph, "Medard", "Lyddal", 11.0);
		graphUtils.addEdge(graph, "Lyddal", "Odhill", 15.0);
		graphUtils.addEdge(graph, "Odhill", "Earchman", 10.0);
		graphUtils.addEdge(graph, "Earchman", "La Perouse", 11.0);
		graphUtils.addEdge(graph, "La Perouse", "Hockin", 11.0);
		graphUtils.addEdge(graph, "Hockin", "Thicket Portage", 11.0);
		graphUtils.addEdge(graph, "Thicket Portage", "Leven", 12.0);
		graphUtils.addEdge(graph, "Leven", "Thompson", 49.0);
		graphUtils.addEdge(graph, "Leven", "Sipiwesk", 12.0);
		graphUtils.addEdge(graph, "Sipiwesk", "Matago", 20.0);
		graphUtils.addEdge(graph, "Matago", "Pikwitonei", 2.0);
		graphUtils.addEdge(graph, "Pikwitonei", "Bridgar", 8.0);
		graphUtils.addEdge(graph, "Bridgar", "Wilde", 20.0);
		graphUtils.addEdge(graph, "Wilde", "Arnot", 9.0);
		graphUtils.addEdge(graph, "Arnot", "Mile 238.3", 4.0);
		graphUtils.addEdge(graph, "Mile 238.3", "Boyd", 18.0);
		graphUtils.addEdge(graph, "Boyd", "Pit Siding", 10.0);
		graphUtils.addEdge(graph, "Pit Siding", "Munk", 21.0);
		graphUtils.addEdge(graph, "Munk", "Mile 278.6", 15.0);
		graphUtils.addEdge(graph, "Mile 278.6", "Ilford", 12.0);
		graphUtils.addEdge(graph, "Ilford", "Nonsuch", 16.0);
		graphUtils.addEdge(graph, "Nonsuch", "Wivenhoe", 13.0);
		graphUtils.addEdge(graph, "Wivenhoe", "Luke", 24.0);
		graphUtils.addEdge(graph, "Luke", "Gillam", 12.0);
		graphUtils.addEdge(graph, "Gillam", "Kettle Rapids", 12.0);
		graphUtils.addEdge(graph, "Kettle Rapids", "Bird", 22.0);
		graphUtils.addEdge(graph, "Bird", "Amery", 12.0);
		graphUtils.addEdge(graph, "Amery", "Charlebois", 15.0);
		graphUtils.addEdge(graph, "Charlebois", "Weir River", 15.0);
		graphUtils.addEdge(graph, "Weir River", "Lawledge", 14.0);
		graphUtils.addEdge(graph, "Lawledge", "Thibaudeau", 15.0);
		graphUtils.addEdge(graph, "Thibaudeau", "Silcox", 14.0);
		graphUtils.addEdge(graph, "Silcox", "Herchmer", 19.0);
		graphUtils.addEdge(graph, "Herchmer", "Kellett", 9.0);
		graphUtils.addEdge(graph, "Kellett", "O'Day", 14.0);
		graphUtils.addEdge(graph, "O'Day", "Back", 13.0);
		graphUtils.addEdge(graph, "Back", "M'Clintock", 13.0);
		graphUtils.addEdge(graph, "M'Clintock", "Belcher", 14.0);
		graphUtils.addEdge(graph, "Belcher", "Cromarty", 15.0);
		graphUtils.addEdge(graph, "Cromarty", "Chesnaye", 14.0);
		graphUtils.addEdge(graph, "Chesnaye", "Lamprey", 14.0);
		graphUtils.addEdge(graph, "Lamprey", "Bylot", 12.0);
		graphUtils.addEdge(graph, "Bylot", "Digges", 12.0);
		graphUtils.addEdge(graph, "Digges", "Tidal", 14.0);
		graphUtils.addEdge(graph, "Tidal", "Churchill", 13.0);
		
		// Saskatoon - Melfort
		graphUtils.addEdge(graph, "Saskatoon", "Richmond, SK", 10.0);
		graphUtils.addEdge(graph, "Richmond, SK", "Warman", 18.0);
		graphUtils.addEdge(graph, "Warman", "Aberdeen", 22.0);
		graphUtils.addEdge(graph, "Aberdeen", "Smuts", 18.0);
		graphUtils.addEdge(graph, "Smuts", "Alvena", 13.0);
		graphUtils.addEdge(graph, "Alvena", "Carpenter", 10.0);
		graphUtils.addEdge(graph, "Carpenter", "Wakaw", 15.0);
		graphUtils.addEdge(graph, "Wakaw", "Lepine", 12.0);
		graphUtils.addEdge(graph, "Lepine", "Reynaud", 10.0);
		graphUtils.addEdge(graph, "Reynaud", "Tarnopol", 9.0);
		graphUtils.addEdge(graph, "Tarnopol", "Yellow Creek", 13.0);
		graphUtils.addEdge(graph, "Yellow Creek", "Meskanaw", 11.0);
		graphUtils.addEdge(graph, "Meskanaw", "Ethelton", 12.0);
		graphUtils.addEdge(graph, "Ethelton", "Melfort", 24.0);
		
		// Prince Albert - Melfort
		graphUtils.addEdge(graph, "Prince Albert", "Davis", 15.0);
		graphUtils.addEdge(graph, "Davis", "Birch Hills", 26.0);
		graphUtils.addEdge(graph, "Birch Hills", "Brancepath", 12.0);
		graphUtils.addEdge(graph, "Brancepath", "Weldon", 8.0);
		graphUtils.addEdge(graph, "Weldon", "Kinistino", 9.0);
		graphUtils.addEdge(graph, "Kinistino", "Beatty", 17.0);
		graphUtils.addEdge(graph, "Beatty", "Melfort", 13.0);
		
		// Melfort - Crooked River
		graphUtils.addEdge(graph, "Melfort", "Star City", 22.0);
		graphUtils.addEdge(graph, "Star City", "Tisdale", 20.0);
		graphUtils.addEdge(graph, "Tisdale", "Eldersley", 15.0);
		graphUtils.addEdge(graph, "Eldersley", "Crooked River", 6.0);
		
		// Mistatim - Hudson Bay
		graphUtils.addEdge(graph, "Mistatim", "Prairie River", 26.0);
		graphUtils.addEdge(graph, "Prairie River", "Silas", 7.0);
		graphUtils.addEdge(graph, "Silas", "Veillardville", 24.0);
		graphUtils.addEdge(graph, "Veillardville", "Hudson Bay", 10.0);
		
		// Crooked River - Reserve
		graphUtils.addEdge(graph, "Crooked River", "Bjorkdale", 18.0);
		graphUtils.addEdge(graph, "Bjorkdale", "Porcupine Plain", 31.0);
		graphUtils.addEdge(graph, "Porcupine Plain", "Carragana", 11.0);
		graphUtils.addEdge(graph, "Carragana", "Somme", 9.0);
		graphUtils.addEdge(graph, "Somme", "Weekes", 7.0);
		graphUtils.addEdge(graph, "Weekes", "Dillabough", 8.0);
		graphUtils.addEdge(graph, "Dillabough", "Reserve", 13.0);
		
		// The Pas - Lynn Lake
		graphUtils.addEdge(graph, "The Pas", "Prospector", 16.0);
		graphUtils.addEdge(graph, "Prospector", "Root Lake", 13.0);
		graphUtils.addEdge(graph, "Root Lake", "Wanless", 13.0);
		graphUtils.addEdge(graph, "Wanless", "Atik", 13.0);
		graphUtils.addEdge(graph, "Atik", "Simonhouse", 8.0);
		graphUtils.addEdge(graph, "Simonhouse", "Cranberry Portage", 16.0);
		graphUtils.addEdge(graph, "Cranberry Portage", "Optic Lake", 26.0);
		graphUtils.addEdge(graph, "Optic Lake", "Heming Lake", 12.0);
		graphUtils.addEdge(graph, "Heming Lake", "Sherridon", 30.0);
		graphUtils.addEdge(graph, "Sherridon", "Ruddock", 21.0);
		graphUtils.addEdge(graph, "Ruddock", "Charles", 35.0);
		graphUtils.addEdge(graph, "Charles", "Pawistik", 30.0);
		graphUtils.addEdge(graph, "Pawistik", "Mile 151.8", 1.0);
		graphUtils.addEdge(graph, "Mile 151.8", "Pukatawagan", 8.0);
		graphUtils.addEdge(graph, "Pukatawagan", "Jetait", 36.0);
		graphUtils.addEdge(graph, "Jetait", "Herriot", 38.0);
		graphUtils.addEdge(graph, "Herriot", "Drybrough", 19.0);
		graphUtils.addEdge(graph, "Drybrough", "McVeigh", 22.0);
		graphUtils.addEdge(graph, "McVeigh", "Lynn Lake", 22.0);
		
		// Dauphin - Winipegosis
		graphUtils.addEdge(graph, "Dauphin", "Valley River", 14.0);
		graphUtils.addEdge(graph, "Valley River", "Sifton", 12.0);
		graphUtils.addEdge(graph, "Sifton", "Fishing River", 10.0);
		graphUtils.addEdge(graph, "Fishing River", "Fork River", 9.0);
		graphUtils.addEdge(graph, "Fork River", "Winnipegosis", 17.0);
		
		// Flin Flon - Osbourne Lake
		graphUtils.addEdge(graph, "Flin Flon", "Channing", 9.0);
		graphUtils.addEdge(graph, "Channing", "Schist Lake", 11.0);
		graphUtils.addEdge(graph, "Schist Lake", "Athapap", 15.0);
		graphUtils.addEdge(graph, "Athapap", "Camp Whitney", 2.0);
		graphUtils.addEdge(graph, "Camp Whitney", "Millwater", 7.0);
		graphUtils.addEdge(graph, "Millwater", "Optic Lake", 32.0);
		graphUtils.addEdge(graph, "Optic Lake", "Roblaytin", 20.0);
		graphUtils.addEdge(graph, "Roblaytin", "Baldy", 31.0);
		graphUtils.addEdge(graph, "Baldy", "Chisel Lake", 22.0);
		graphUtils.addEdge(graph, "Chisel Lake", "Stall Lake", 13.0);
		graphUtils.addEdge(graph, "Stall Lake", "Osbourne Lake", 28.0);
		
		// Edmonton - Drumheller
		graphUtils.addEdge(graph, "Edmonton", "New Sarepta", 50.0);
		graphUtils.addEdge(graph, "New Sarepta", "Hay Lakes", 10.0);
		graphUtils.addEdge(graph, "Hay Lakes", "Camrose", 28.0);
		graphUtils.addEdge(graph, "Camrose", "Viewpoint", 18.0);
		graphUtils.addEdge(graph, "Viewpoint", "Edberg", 12.0);
		graphUtils.addEdge(graph, "Edberg", "Meeting Creek", 14.0);
		graphUtils.addEdge(graph, "Meeting Creek", "Donalda", 15.0);
		graphUtils.addEdge(graph, "Donalda", "Red Willow", 16.0);
		graphUtils.addEdge(graph, "Red Willow", "Stettler", 17.0);
		graphUtils.addEdge(graph, "Stettler", "Warden", 8.0);
		graphUtils.addEdge(graph, "Warden", "Fenn", 13.0);
		graphUtils.addEdge(graph, "Fenn", "Big Valley", 13.0);
		graphUtils.addEdge(graph, "Big Valley", "Scollard", 12.0);
		graphUtils.addEdge(graph, "Scollard", "Rumsey", 11.0);
		graphUtils.addEdge(graph, "Rumsey", "Rowley", 10.0);
		graphUtils.addEdge(graph, "Rowley", "Morrin", 12.0);
		graphUtils.addEdge(graph, "Morrin", "Drumheller", 32.0);
		
		// Edmonton - Grand Centre
		graphUtils.addEdge(graph, "Edmonton", "Gibbons", 36.0);
		graphUtils.addEdge(graph, "Gibbons", "Coronado", 8.0);
		graphUtils.addEdge(graph, "Coronado", "Redwater", 14.0);
		graphUtils.addEdge(graph, "Redwater", "Radway", 22.0);
		graphUtils.addEdge(graph, "Radway", "Waskatenau", 11.0);
		graphUtils.addEdge(graph, "Waskatenau", "Warspite", 12.0);
		graphUtils.addEdge(graph, "Warspite", "Smoky Lake", 12.0);
		graphUtils.addEdge(graph, "Smoky Lake", "Edwand", 16.0);
		graphUtils.addEdge(graph, "Edwand", "Bellis", 9.0);
		graphUtils.addEdge(graph, "Bellis", "Vilna", 15.0);
		graphUtils.addEdge(graph, "Vilna", "Spedden", 14.0);
		graphUtils.addEdge(graph, "Spedden", "Ashmont", 10.0);
		graphUtils.addEdge(graph, "Ashmont", "Abilene", 6.0);
		graphUtils.addEdge(graph, "Abilene", "Owlseye", 7.0);
		graphUtils.addEdge(graph, "Owlseye", "St Paul", 12.0);
		graphUtils.addEdge(graph, "Abilene", "Mallaig", 16.0);
		graphUtils.addEdge(graph, "Mallaig", "Therien", 7.0);
		graphUtils.addEdge(graph, "Therien", "Glendon", 8.0);
		graphUtils.addEdge(graph, "Glendon", "Bonnyville", 28.0);
		graphUtils.addEdge(graph, "Bonnyville", "Fort Kent", 10.0);
		graphUtils.addEdge(graph, "Fort Kent", "Ardmore", 9.0);
		graphUtils.addEdge(graph, "Ardmore", "Grand Centre", 21.0);
		
		// Edmonton - North Battleford
		graphUtils.addEdge(graph, "Edmonton", "Fort Saskatchewan", 27.0);
		graphUtils.addEdge(graph, "Fort Saskatchewan", "Bruderheim", 22.0);
		graphUtils.addEdge(graph, "Bruderheim", "Larmont", 11.0);
		graphUtils.addEdge(graph, "Larmont", "Chipman", 12.0);
		graphUtils.addEdge(graph, "Chipman", "Mundare", 23.0);
		graphUtils.addEdge(graph, "Mundare", "Vegreville", 22.0);
		graphUtils.addEdge(graph, "Vegreville", "Lavoy", 14.0);
		graphUtils.addEdge(graph, "Lavoy", "Ranfurly", 15.0);
		graphUtils.addEdge(graph, "Ranfurly", "Innisfree", 12.0);
		graphUtils.addEdge(graph, "Innisfree", "Minburn", 14.0);
		graphUtils.addEdge(graph, "Minburn", "Mannville", 13.0);
		graphUtils.addEdge(graph, "Mannville", "Vermilion", 24.0);
		graphUtils.addEdge(graph, "Vermilion", "Islay", 24.0);
		graphUtils.addEdge(graph, "Islay", "Kitscoty", 16.0);
		graphUtils.addEdge(graph, "Kitscoty", "Blackfoot", 13.0);
		graphUtils.addEdge(graph, "Blackfoot", "Lloydminster", 11.0);
		graphUtils.addEdge(graph, "Lloydminster", "Marshall", 19.0);
		graphUtils.addEdge(graph, "Marshall", "Lashburn", 13.0);
		graphUtils.addEdge(graph, "Lashburn", "Waseca", 11.0);
		graphUtils.addEdge(graph, "Waseca", "Maidstone", 13.0);
		graphUtils.addEdge(graph, "Maidstone", "Paynton", 25.0);
		graphUtils.addEdge(graph, "Paynton", "Delmas", 24.0);
		graphUtils.addEdge(graph, "Delmas", "North Battleford", 31.0);
		
		// Kamloops Junction - Penticton
		graphUtils.addEdge(graph, "Kamloops Junction", "Kamloops", 5.0);
		graphUtils.addEdge(graph, "Kamloops", "Monte Lake", 27.0);
		graphUtils.addEdge(graph, "Monte Lake", "Westwold", 28.0);
		graphUtils.addEdge(graph, "Westwold", "Falkland", 14.0);
		graphUtils.addEdge(graph, "Falkland", "Vernon", 48.0);
		graphUtils.addEdge(graph, "Vernon", "Oyama", 16.0);
		graphUtils.addEdge(graph, "Oyama", "Winfield", 17.0);
		graphUtils.addEdge(graph, "Winfield", "Kelowna", 24.0);
		graphUtils.addEdge(graph, "Kelowna", "Westbank", 12.0);
		graphUtils.addEdge(graph, "Westbank", "Peachland", 12.0);
		graphUtils.addEdge(graph, "Peachland", "Summerland", 24.0);
		graphUtils.addEdge(graph, "Summerland", "Trout Creek", 6.0);
		graphUtils.addEdge(graph, "Trout Creek", "Penticton", 12.0);
		
		// Hillsport - Manitouwadge
		graphUtils.addEdge(graph, "Hillsport", "Geco", 37.0);
		graphUtils.addEdge(graph, "Geco", "Manitouwadge", 8.0);
		
		// Hearst - Nakina
		graphUtils.addEdge(graph, "Hearst", "Calstock", 36.0);
		graphUtils.addEdge(graph, "Calstock", "Ameson", 33.0);
		graphUtils.addEdge(graph, "Ameson", "Savoff", 34.0);
		graphUtils.addEdge(graph, "Savoff", "Pagwa River", 19.0);
		graphUtils.addEdge(graph, "Pagwa River", "Pagwa", 4.0);
		graphUtils.addEdge(graph, "Pagwa", "Oghalla", 42.0);
		graphUtils.addEdge(graph, "Oghalla", "Grant", 34.0);
		graphUtils.addEdge(graph, "Grant", "Nakina", 30.0);
		
        return graph;
    }
}
