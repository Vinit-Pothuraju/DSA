import java.util.*;

// Unweighted, undirected graph with dynamic edge addition
public class DFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Function to add edge (both directions for undirected graph)
    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest));
        graph[dest].add(new Edge(dest, src));
    }

    // DFS traversal from a given start node
    public static void DFST(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false){
                DFST(graph,e.dest,visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Dynamically add edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 3, 5);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);

        // For fully connected components (with subgraphs)
        boolean[] visited = new boolean[V];
        System.out.print("DFS traversal: ");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFST(graph, i, visited);
            }
        }
    }
}
