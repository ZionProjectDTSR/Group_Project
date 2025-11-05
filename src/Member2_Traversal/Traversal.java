package Member2_Traversal;

import Member1_Graph.Graph;
import java.util.*;

public class Traversal {
    public static void depthFirstSearch(Graph graph, String start) {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                System.out.println("Visited: " + current);
                visited.add(current);
                for (String neighbor : graph.getNeighbors(current)) {
                    stack.push(neighbor);
                }
            }
        }
    }
}
