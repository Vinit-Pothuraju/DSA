import java.util.*;

// Unweighted, undirected graph with dynamic edge addition
public class DynamicAdjList {
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

    // BFS traversal from a given start node
    public static void BFST(ArrayList<Edge>[] graph, int V, boolean[] visited, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (!visited[cur]) {
                System.out.print(cur + " ");
                visited[cur] = true;

                for (Edge e : graph[cur]) {
                    q.add(e.dest);
                }
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
        System.out.print("BFS traversal: ");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                BFST(graph, V, visited, i);
            }
        }
    }
}

