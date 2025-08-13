package Graphs_Stivers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjList {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(1, 2);
        addEdge(1, 6);
        addEdge(2, 3);
        addEdge(2, 4);
        addEdge(6, 7);
        addEdge(6, 9);
        addEdge(7, 8);
        addEdge(8, 5);
        addEdge(4, 5);

       for(int i=0;i<n;i++){
        System.out.print(i+" :->");
        for(int j=0;j<adj.get(i).size();j++){
            System.out.print(adj.get(i).get(j)+",");
        }
        System.out.println();
       }
      
    }

}
