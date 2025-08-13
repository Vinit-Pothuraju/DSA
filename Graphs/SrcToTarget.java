import java.util.*;

// Unweighted, undirected graph with dynamic edge addition
public class SrcToTarget {
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
    public static void Allpath(ArrayList<Edge>[] graph, int curr,String path, boolean[] visited,int target) {
        if(curr==target){
            System.out.println(path);
            return;
        }
        
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(visited[e.dest]==false){
                 visited[curr]=true;
                Allpath(graph,e.dest,path+e.dest,visited,target);
                visited[curr]=false;
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
        System.out.println("All Path traversal: ");
        Allpath(graph, 0, "0", visited,5);
        
    }
}
