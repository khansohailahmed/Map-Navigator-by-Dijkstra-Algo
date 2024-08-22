package advancedsa;
import java.util.*;

// Represents a node in the graph, each node corresponds to a city
class Node {
    String name; // Name of the city
    Map<String, Integer> neighbors; // Neighbors of this city and the distance to them

    // Constructor to initialize the node with a city name
    public Node(String name) {
        this.name = name;
        this.neighbors = new HashMap<>();
    }
}

public class IndiaMapNavigator {
    private Map<String, Node> graph; // Graph representation with city names as keys and Node objects as values

    // Constructor to initialize the graph and create the nodes and edges
    public IndiaMapNavigator() {
        this.graph = new HashMap<>();
        createGraph(); // Method call to create the graph structure
    }

    // Method to create the graph with nodes (cities) and edges (distances between cities)
    private void createGraph() {
        // Create nodes (cities)
        Node delhi = new Node("Delhi");
        Node mumbai = new Node("Mumbai");
        Node bangalore = new Node("Bangalore");
        Node chennai = new Node("Chennai");
        Node hyderabad = new Node("Hyderabad");
        Node kolkata = new Node("Kolkata");
        Node ahmedabad = new Node("Ahmedabad");
        Node pune = new Node("Pune");
        Node jaipur = new Node("Jaipur");
        Node chandigarh = new Node("Chandigarh");
        Node lucknow = new Node("Lucknow");
        Node bhopal = new Node("Bhopal");
        Node indore = new Node("Indore");
        Node nagpur = new Node("Nagpur");
        Node surat = new Node("Surat");
        Node vadodara = new Node("Vadodara");
        Node rajkot = new Node("Rajkot");
        Node jammu = new Node("Jammu");
        Node srinagar = new Node("Srinagar");
        Node shimla = new Node("Shimla");
        Node dehradun = new Node("Dehradun");
        Node patna = new Node("Patna");
        Node ranchi = new Node("Ranchi");
        Node bhubaneswar = new Node("Bhubaneswar");
        Node kochi = new Node("Kochi");
        Node thiruvananthapuram = new Node("Thiruvananthapuram");
        Node visakhapatnam = new Node("Visakhapatnam");
        Node coimbatore = new Node("Coimbatore");
        Node madurai = new Node("Madurai");
        Node trichy = new Node("Trichy");
        Node pondicherry = new Node("Pondicherry");

        // Add nodes to the graph
        graph.put("Delhi", delhi);
        graph.put("Mumbai", mumbai);
        graph.put("Bangalore", bangalore);
        graph.put("Chennai", chennai);
        graph.put("Hyderabad", hyderabad);
        graph.put("Kolkata", kolkata);
        graph.put("Ahmedabad", ahmedabad);
        graph.put("Pune", pune);
        graph.put("Jaipur", jaipur);
        graph.put("Chandigarh", chandigarh);
        graph.put("Lucknow", lucknow);
        graph.put("Bhopal", bhopal);
        graph.put("Indore", indore);
        graph.put("Nagpur", nagpur);
        graph.put("Surat", surat);
        graph.put("Vadodara", vadodara);
        graph.put("Rajkot", rajkot);
        graph.put("Jammu", jammu);
        graph.put("Srinagar", srinagar);
        graph.put("Shimla", shimla);
        graph.put("Dehradun", dehradun);
        graph.put("Patna", patna);
        graph.put("Ranchi", ranchi);
        graph.put("Bhubaneswar", bhubaneswar);
        graph.put("Kochi", kochi);
        graph.put("Thiruvananthapuram", thiruvananthapuram);
        graph.put("Visakhapatnam", visakhapatnam);
        graph.put("Coimbatore", coimbatore);
        graph.put("Madurai", madurai);
        graph.put("Trichy", trichy);
        graph.put("Pondicherry", pondicherry);

        // Add edges (distances between cities)
        delhi.neighbors.put("Mumbai", 1400);
        delhi.neighbors.put("Chandigarh", 250);
        delhi.neighbors.put("Jaipur", 280);
        delhi.neighbors.put("Lucknow", 450);
        mumbai.neighbors.put("Bangalore", 980);
        mumbai.neighbors.put("Pune", 160);
        mumbai.neighbors.put("Surat", 290);
        bangalore.neighbors.put("Chennai", 350);
        bangalore.neighbors.put("Hyderabad", 560);
        bangalore.neighbors.put("Mumbai", 980);
        chennai.neighbors.put("Bangalore", 350);
        chennai.neighbors.put("Hyderabad", 560);
        chennai.neighbors.put("Kochi", 680);
        hyderabad.neighbors.put("Bangalore", 560);
        hyderabad.neighbors.put("Chennai", 560);
        hyderabad.neighbors.put("Visakhapatnam", 560);
        kolkata.neighbors.put("Ranchi", 340);
        kolkata.neighbors.put("Patna", 560);
        ahmedabad.neighbors.put("Mumbai", 490);
        ahmedabad.neighbors.put("Surat", 290);
        ahmedabad.neighbors.put("Rajkot", 220);
        pune.neighbors.put("Mumbai", 160);
        pune.neighbors.put("Bangalore", 940);
        jaipur.neighbors.put("Delhi", 280);
        jaipur.neighbors.put("Ahmedabad", 560);
        chandigarh.neighbors.put("Delhi", 250);
        chandigarh.neighbors.put("Shimla", 110);
        lucknow.neighbors.put("Delhi", 450);
        lucknow.neighbors.put("Bhopal", 560);
        bhopal.neighbors.put("Lucknow", 560);
        bhopal.neighbors.put("Indore", 190);
        indore.neighbors.put("Bhopal", 190);
        indore.neighbors.put("Surat", 410);
        nagpur.neighbors.put("Bhopal", 560);
        nagpur.neighbors.put("Hyderabad", 560);
        surat.neighbors.put("Mumbai", 290);
        surat.neighbors.put("Ahmedabad", 290);
        surat.neighbors.put("Indore", 410);
        vadodara.neighbors.put("Ahmedabad", 110);
        vadodara.neighbors.put("Surat", 140);
        rajkot.neighbors.put("Ahmedabad", 220);
        rajkot.neighbors.put("Jamnagar", 220);
        jammu.neighbors.put("Srinagar", 290);
        srinagar.neighbors.put("Jammu", 290);
        shimla.neighbors.put("Chandigarh", 110);
        shimla.neighbors.put("Dehradun", 220);
        dehradun.neighbors.put("Shimla", 220);
        dehradun.neighbors.put("Delhi", 280);
        patna.neighbors.put("Kolkata", 560);
        patna.neighbors.put("Ranchi", 340);
        ranchi.neighbors.put("Kolkata", 340);
        ranchi.neighbors.put("Patna", 340);
        bhubaneswar.neighbors.put("Kolkata", 560);
        bhubaneswar.neighbors.put("Visakhapatnam", 440);
        kochi.neighbors.put("Chennai", 680);
        kochi.neighbors.put("Thiruvananthapuram", 220);
        thiruvananthapuram.neighbors.put("Kochi", 220);
        visakhapatnam.neighbors.put("Hyderabad", 560);
        visakhapatnam.neighbors.put("Bhubaneswar", 440);
        coimbatore.neighbors.put("Chennai", 560);
        coimbatore.neighbors.put("Bangalore", 360);
        madurai.neighbors.put("Chennai", 440);
        madurai.neighbors.put("Trichy", 130);
        trichy.neighbors.put("Madurai", 130);
        trichy.neighbors.put("Chennai", 320);
        pondicherry.neighbors.put("Chennai", 160);
    }

    // Method for finding shortest path between two cities using Dijkstra's algorithm
    public List<String> navigate(String start, String end) {
        Map<String, Integer> distances = new HashMap<>(); // Stores the shortest distance from start to each city
        Map<String, String> previous = new HashMap<>(); // Stores the previous city in the shortest path
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> {
            return distances.get(a) - distances.get(b); // Priority queue to process cities with the smallest distance
        });

        distances.put(start, 0); // Distance from start to itself is 0
        queue.add(start); // Add start city to the queue

        while (!queue.isEmpty()) {
            String current = queue.poll(); // Get the city with the smallest distance
            if (current.equals(end)) {
                break; // If the end city is reached, stop the loop
            }

            Node currentNode = graph.get(current);
            if (currentNode == null) continue; // If the current node is null (no city found), continue to the next iteration

            // Iterate through all the neighbors of the current city
            for (Map.Entry<String, Integer> neighbor : currentNode.neighbors.entrySet()) {
                // Calculate the distance to the neighbor by adding the current city's distance and the distance to this neighbor
                int distance = distances.get(current) + neighbor.getValue();

                // If the calculated distance is shorter than the current known distance to the neighbor, update it
                if (!distances.containsKey(neighbor.getKey()) || distance < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), distance); // Update the shortest distance to this neighbor
                    previous.put(neighbor.getKey(), current); // Update the path to reach this neighbor
                    queue.add(neighbor.getKey()); // Add the neighbor to the queue to process its neighbors
                }
            }
        }

        List<String> path = new ArrayList<>();
        String current = end;
        
        // Construct the path from end to start by following the previous nodes
        while (current != null) {
            path.add(0, current); // Add each city to the beginning of the list to reverse the order
            current = previous.get(current); // Move to the previous city in the path
        }

        // Ensure that the method returns a path only if the destination is reached.
        if (!distances.containsKey(end)) {
            System.out.println("No path found from " + start + " to " + end);
            return new ArrayList<>(); // Return an empty list if no path is found
        }

        return path; // Return the constructed path
    }

    public static void main(String[] args) {
        IndiaMapNavigator navigator = new IndiaMapNavigator(); // Create an instance of the navigator
        List<String> path = navigator.navigate("Delhi", "Bangalore"); // Find the shortest path from Delhi to Bangalore
        
        // Output the path found by the navigator
        System.out.println("Path from Delhi to Bangalore: " + path);
    }
}
