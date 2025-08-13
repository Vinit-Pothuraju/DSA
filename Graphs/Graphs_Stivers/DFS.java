package Graphs_Stivers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void DFSearch(int n){
        Queue<Integer> q=new LinkedList<>() ;
        boolean visited[]=new boolean[n];
        q.add(0);
        while (!q.isEmpty()) {
            int cur=q.poll();
            if(visited[cur]==false){
                System.out.print(cur+" ");
                visited[cur]=true;
                for(int i=0;i<adj.get(cur).size();i++){
                    q.add(adj.get(cur).get(i));
                }
            }
        }
     }

    public static void main(String[] args) {
       
        int n = 10;

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 5);
        addEdge(2, 6);
        addEdge(3, 4);
        addEdge(3, 7);
        addEdge(7, 8);
        addEdge(8, 4);

        for(int i=0;i<n;i++){
        System.out.print(i+" :->");
        for(int j=0;j<adj.get(i).size();j++){
            System.out.print(adj.get(i).get(j)+",");
        }
        System.out.println();
       }
        BFSearch(n);
    }

}
