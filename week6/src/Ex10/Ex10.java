/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex10;

/**
 *
 * @author chpeter868
 */

class Ex10 { 
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    Node root; 
  
    Ex10() { 
        root = null; 
    } 
  
    void deleteKey(int key)  { 
        root = deleteRec(root, key); 
    } 
  
    Node deleteRec(Node root, int key)  { 
        if (root == null)  return root; 
  
        if (key < root.key) {
            root.left = deleteRec(root.left, key); 
        }
        else if (key > root.key) {
            root.right = deleteRec(root.right, key); 
        } else  { 
            if (root.left == null) {
                return root.right; 
            }
            else if (root.right == null) { 
                return root.left; 
            }
  
            root.key = minValue(root.right); 
            root.right = deleteRec(root.right, root.key); 
        } 
        return root; 
    } 
  
    int minValue(Node root) { 
        int minv = root.key; 
        while (root.left != null) { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 
  
    void insert(int key) { 
        root = insertRec(root, key); 
    } 
  
    Node insertRec(Node root, int key) { 
  
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) { 
            root.right = insertRec(root.right, key); 
        }
  
        return root; 
    } 
  
    void inorder() { 
        inorderRec(root); 
    } 
  
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.key + " "); 
            inorderRec(root.right); 
        } 
    } 
  
    public static void main(String[] args) { 
        Ex10 tree = new Ex10(); 
  
        //insert the sequeue in [2, 7, 9, 4, 1, 5, 3, 6, 0, 8]
        tree.insert(2); 
        tree.insert(7); 
        tree.insert(9); 
        tree.insert(4); 
        tree.insert(1); 
        tree.insert(5); 
        tree.insert(3); 
        tree.insert(6); 
        tree.insert(0); 
        tree.insert(8); 
        System.out.println("The tree is"); 
        tree.inorder(); 
  
        //delete the item in sequeue
        System.out.println("\nDelete 1"); 
        tree.deleteKey(1); 
        System.out.println("The tree is"); 
        tree.inorder(); 
  
        System.out.println("\nDelete 5"); 
        tree.deleteKey(5); 
        System.out.println("The tree is"); 
        tree.inorder(); 
  
        System.out.println("\nDelete 9"); 
        tree.deleteKey(9); 
        System.out.println("The tree is"); 
        tree.inorder(); 
        System.out.println("");
    } 
} 
