package Member1_Graph;

import java.util.*;

public class Graph {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addLocation(String location) {
        adjList.putIfAbsent(location, new ArrayList<>());
    }

    public void removeLocation(String location) {
        adjList.remove(location);
        for (List<String> neighbors : adjList.values()) {
            neighbors.remove(location);
        }
    }

    public void addRoad(String from, String to) {
        if (adjList.containsKey(from) && adjList.containsKey(to)) {
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }
    }

    public void removeRoad(String from, String to) {
        if (adjList.containsKey(from)) adjList.get(from).remove(to);
        if (adjList.containsKey(to)) adjList.get(to).remove(from);
    }

    public void displayConnections() {
        for (String location : adjList.keySet()) {
            System.out.println(location + " -> " + adjList.get(location));
        }
    }

    public List<String> getNeighbors(String location) {
        return adjList.getOrDefault(location, new ArrayList<>());
    }

    public Set<String> getLocations() {
        return adjList.keySet();
    }
}
