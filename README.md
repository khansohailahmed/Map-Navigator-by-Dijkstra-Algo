# India Map Navigator using Dijkstra's Algorithm

## Project Overview

The **India Map Navigator** is a Java-based program that finds the shortest path between two cities in India using **Dijkstra's Algorithm**. It represents the cities as nodes in a graph, with the roads between them as weighted edges. The weights represent the distances between cities, allowing the algorithm to calculate the shortest route from a starting city to a destination.

## Key Concepts

### Graph Representation

- **Nodes (Cities)**: Each city is a node in the graph.
- **Edges (Roads)**: The roads between cities are edges, and each edge has a weight representing the distance between two cities.

### Core Components

1. **Node Class**: Represents each city.
   - Attributes:
     - `name`: The name of the city.
     - `neighbors`: A map of neighboring cities and the distances to them.

2. **IndiaMapNavigator Class**: Manages the overall graph and provides methods to navigate between cities.
   - Attributes:
     - `graph`: Stores the cities and their connections as a map of nodes and edges.
   - Methods:
     - `createGraph()`: Initializes the graph, adding cities and establishing connections (roads) between them.
     - `navigate(String start, String end)`: Uses **Dijkstra's Algorithm** to find the shortest path between the starting city (`start`) and destination city (`end`).

### Dijkstra's Algorithm

Dijkstra's Algorithm finds the shortest path between two nodes in a graph by iteratively exploring the nearest city (node) until the destination is reached.

#### Algorithm Steps

1. **Initialization**: Set the distance to the start city as 0 and all other cities as infinity. Use a priority queue to explore the city with the smallest known distance.
   
2. **Exploration**: For each city, explore its neighboring cities. If a shorter path is found to a neighboring city, update the shortest distance and add it to the priority queue.

3. **Completion**: Repeat this process until the destination city is reached. Backtrack using the `previous` map to reconstruct the shortest path.

### Example Use Case

**Problem**: Find the shortest path from Delhi to Bangalore.

1. **Initialization**: Set the distance from Delhi to 0 and all other cities to infinity.
2. **First Iteration**: Delhi is processed first, and its neighbors (Mumbai, Chandigarh, Jaipur, Lucknow) are evaluated.
3. **Subsequent Iterations**: Cities with the smallest distances are processed iteratively until Bangalore is reached.
4. **Path Construction**: Backtrack from Bangalore using the `previous` map to find the shortest route from Delhi.

**Example Output**:  
```
Path from Delhi to Bangalore: [Delhi, Mumbai, Bangalore]
```

## Applications

- **Navigation Systems**: GPS systems use similar algorithms to calculate the shortest or fastest route between two locations.
- **Network Routing**: In computer networks, Dijkstra's algorithm helps find the shortest path for data to travel across networks.
- **Transport & Logistics**: Dijkstra's algorithm optimizes routes for transportation and delivery services, reducing travel time and costs.

## Technologies Used

- **Java**: Core programming language used for implementing Dijkstra's algorithm and managing the graph structure.
- **Priority Queue**: Used to efficiently fetch the city with the shortest known distance.
- **Graph Data Structure**: Cities are stored as nodes with their neighbors (connected cities) and distances.

## Installation and Setup Instructions

### Prerequisites

1. **Java Development Kit (JDK)**: Ensure JDK 8 or later is installed on your machine.
2. **Integrated Development Environment (IDE)**: Use any Java IDE such as Eclipse, IntelliJ IDEA, or NetBeans to run the program.

### Steps to Set Up

1. **Clone the Repository**  
   Clone the GitHub repository to your local machine:
   ```bash
   git clone https://github.com/khansohailahmed/India-Map-Navigator.git
   ```

2. **Compile and Run the Program**
   Open the project in your preferred IDE or compile it from the command line:
   ```bash
   javac IndiaMapNavigator.java
   java IndiaMapNavigator
   ```

3. **Run a Navigation Query**
   When prompted, input the starting city and destination city to find the shortest path using Dijkstra's Algorithm:
   ```bash
   Enter start city: Delhi
   Enter destination city: Bangalore
   ```

4. **View Output**
   The program will print the shortest path and distance between the cities, for example:
   ```
   Shortest path from Delhi to Bangalore: [Delhi, Mumbai, Bangalore]
   Total distance: 2100 km
   ```

## Project Structure

```
├── src
│   ├── IndiaMapNavigator.java  # Main class with graph and navigation logic
│   ├── Node.java               # Node class representing each city
│   └── Dijkstra.java           # Dijkstra's algorithm implementation
└── README.md                   # This readme file
```

### Classes

- **Node**: Represents each city and its neighboring cities with distances.
- **IndiaMapNavigator**: Handles the creation of the graph and navigation between cities.
- **Dijkstra**: Implements Dijkstra's algorithm for finding the shortest path.

## Contributing

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push the changes to your fork.
5. Open a pull request with a description of your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any issues or questions, feel free to reach out via [khansohailtufailahmed@gmail.com].
