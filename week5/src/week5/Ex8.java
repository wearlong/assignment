/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author chpeter868
 */


class Ex8 { 
  
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    Node root; 
  
    Ex8() {  
        root = null;  
    } 
  
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      

    Node insertRec(Node root, int key) { 
  
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    } 
  
    void inorder()  { 
       inorderRec(root); 
    } 
  

    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
  
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        Ex8 tree = new Ex8(); 
        
        //insert order by [2 7 9 4 1 5 3 6 0 8]
        tree.insert(2); 
        tree.insert(7); 
        tree.insert(9); 
        tree.insert(1); 
        tree.insert(4); 
        tree.insert(5); 
        tree.insert(3); 
        tree.insert(6);
        tree.insert(0); 
        tree.insert(8); 
  
        // print the  
        tree.inorder(); 
    } 
} 
