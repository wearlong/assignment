/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.io.*; 
import java.util.*;
/**
 *
 * @author chpeter868
 */
public class Ex13 {
 
    private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; //Adjacency Lists 
  
    Ex13(int v) { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    // used to add an edge into the graph 
    void addEdge(int v,int w) { 
        adj[v].add(w); 
    } 
  
    // used to prints BFS 
    void BFS(int s) { 
        boolean visited[] = new boolean[V]; 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        visited[s]=true; 
        queue.add(s); 
        while (queue.size() != 0) { 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) { 
                int n = i.next(); 
                if (!visited[n]) { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
  
    void DFSUtil(int v,boolean visited[])  { 
        visited[v] = true; 
        System.out.print(v+" "); 
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) { 
            int n = i.next(); 
            if (!visited[n]) {
                DFSUtil(n, visited); 
            }
        } 
    } 
  
    // used to print DFS 
    void DFS(int v)   { 
        boolean visited[] = new boolean[V]; 
        DFSUtil(v, visited); 
    } 
    
    
    public static void main(String args[])  { 
        Ex13 g = new Ex13(6); 
        
        //add edge of the graph
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 3);
        g.addEdge(4, 5);
        g.addEdge(5, 2);
  
        System.out.println("BFS "+ "(starting from vertex 2)"); 
        g.BFS(2); 
        System.out.println();
        
        System.out.println("DFS "+ "(starting from vertex 2)"); 
        g.DFS(2); 
        System.out.println();
    } 
}
    

