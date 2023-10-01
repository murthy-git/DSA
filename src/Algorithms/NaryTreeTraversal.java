package Algorithms;

import DS.Models.NaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class NaryTreeTraversal {
    public void preOrderTraversal(NaryNode node){
        System.out.println(node.data);
        for(NaryNode child: node.children){
            preOrderTraversal(child);
        }
    }

    public void postOderTraversal(NaryNode node){
        for(NaryNode child: node.children){
            postOderTraversal(child);
        }
        System.out.println(node.data);
    }

    public void levelOrderTraversal(NaryNode node){
        Queue<NaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            NaryNode current_node = queue.poll();
            System.out.println(current_node.data);
            queue.addAll(current_node.children);
        }
    }

    public void levelOrderTraversalAtLevel(NaryNode node){
        Queue<NaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            int current_queue_length = queue.size();
            for(int i = 0; i < current_queue_length; i++){
                NaryNode current_node = queue.poll();
                System.out.print(String.valueOf(current_node.data) + ' ');
                queue.addAll(current_node.children);
            }
            System.out.println();
        }
    }
}
