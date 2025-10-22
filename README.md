package Member4_Interface;

import Member1_Graph.Graph;
import Member2_Management.LocationManager;
import Member3_TreeStructure.AVLTree;
import Traversal.Traversal;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        LocationManager manager = new LocationManager(graph);
        AVLTree tree = new AVLTree();

        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Smart City Route Planner ---");
                System.out.println("1. Add a new location");
                System.out.println("2. Remove a location");
                System.out.println("3. Add a road between locations");
                System.out.println("4. Remove a road");
                System.out.println("5. Display all connections");
                System.out.println("6. Display all locations");
                System.out.println("7. Traverse from a location");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter location name: ");
                        String loc = sc.nextLine();
                        manager.addLocation(loc);
                        tree.insert(loc);
                        break;
                    case 2:
                        System.out.print("Enter location name to remove: ");
                        manager.removeLocation(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Enter source location: ");
                        String from = sc.nextLine();
                        System.out.print("Enter destination location: ");
                        String to = sc.nextLine();
                        manager.addRoad(from, to);
                        break;
                    case 4:
                        System.out.print("Enter source location: ");
                        from = sc.nextLine();
                        System.out.print("Enter destination location: ");
                        to = sc.nextLine();
                        manager.removeRoad(from, to);
                        break;
                    case 5:
                        graph.displayConnections();
                        break;
                    case 6:
                        tree.displayInOrder();
                        break;
                    case 7:
                        System.out.print("Enter starting location: ");
                        Traversal.depthFirstSearch(graph, sc.nextLine());
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
