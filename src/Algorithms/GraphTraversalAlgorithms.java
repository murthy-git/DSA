package Algorithms;

import DS.Models.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversalAlgorithms {
    public void depthFirstSearch(Vertex vertex, HashMap<Vertex, Boolean> visited){
        if(!visited.containsKey(vertex)) {
            System.out.println(vertex.data);
            visited.put(vertex, true);
            for (Vertex neighbour : vertex.neighbours) {
                depthFirstSearch(neighbour, visited);
            }
        }
    }

    public void breadthFirstSearch(Vertex vertex, HashMap<Vertex, Boolean> visited){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertex);
        while (!queue.isEmpty()){
            Vertex current_vertex = queue.poll();
            System.out.println(current_vertex.data);
            visited.put(current_vertex, true);
            for(Vertex neighbour: current_vertex.neighbours){
                if(!visited.containsKey(neighbour) && !queue.contains(neighbour)){
                    queue.add(neighbour);
                }
            }
        }
    }
}
