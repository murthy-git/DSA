package Algorithms;

import DS.Models.BinaryNode;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeTraversal {
    public void inOrderTraversal(BinaryNode node){
        if(node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data);
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(BinaryNode node){
        if(node != null) {
            System.out.print(node.data);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(BinaryNode node){
        if(node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data);
        }
    }

    public void levelOrderTraversal(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            BinaryNode current_node = queue.poll();
            System.out.println(current_node.data);
            if (current_node.left!=null){queue.add(current_node.left);}
            if (current_node.right!=null){queue.add(current_node.right);}
        }
    }

    public void levelOrderTraversalAtLevel(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            int current_queue_size = queue.size();
            for(int i = 0; i < current_queue_size; i++){
                BinaryNode current_node = queue.poll();
                System.out.print(String.valueOf(current_node.data) + ' ');
                if (current_node.left!=null){queue.add(current_node.left);}
                if (current_node.right!=null){queue.add(current_node.right);}
            }
            System.out.println();
        }
    }
}
