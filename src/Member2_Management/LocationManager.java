package Member2_Management;

import Member1_Graph.Graph;

public class LocationManager {
    private Graph graph;

    public LocationManager(Graph graph) {
        this.graph = graph;
    }

    public void addLocation(String name) {
        graph.addLocation(name);
        System.out.println("Location added: " + name);
    }

    public void removeLocation(String name) {
        graph.removeLocation(name);
        System.out.println("Location removed: " + name);
    }

    public void addRoad(String from, String to) {
        graph.addRoad(from, to);
        System.out.println("Road added between " + from + " and " + to);
    }

    public void removeRoad(String from, String to) {
        graph.removeRoad(from, to);
        System.out.println("Road removed between " + from + " and " + to);
    }
}
