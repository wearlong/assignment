/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex5;


/**
 *
 * @author chpeter868
 */

class ListNode {
	private Object data;
	private ListNode next;
        
	public ListNode() {
            this.data = null; this.next = null;
        }
        
        public ListNode(Object o) {
            this.data = o; this.next = null;
        }
        
	public ListNode(Object o, ListNode nextNode) {
            data = o; next = nextNode;
        }
        
        public void setData(Object data) {
            this.data = data;
        }
        
	public Object getData() {
            return data; 
        }
        
        public void setNext(ListNode next){
            this.next = next;
        }
        
	public ListNode getNext() { 
            return next; 
        } 
} // class ListNode

class EmptyListException extends RuntimeException {
	public EmptyListException () { super ("List is empty"); }
} // class EmptyListException

class LinkedList {
	private ListNode head;
	private ListNode tail;
        
	public LinkedList() { 
            head = tail = null; 
        }
        
	public boolean isEmpty() { 
            return head == null;
        }
        
	public void addToHead(Object item) {
            if(isEmpty()) {
                head = tail = new ListNode(item);
            }
            else {
                head = new ListNode(item,head);
            }
	}
        
	public void addToTail(Object item) {
            if(isEmpty()) {
                head = tail = new ListNode(item);
            }
            else {
                tail.setNext(new ListNode(item));
                tail = tail.getNext();
            }
	}
        
	public Object removeFromHead() throws EmptyListException {
	Object item = null;
            if(isEmpty()) {
                throw new EmptyListException();
            }
            item = head.getData();
            if(head == tail) {
                head = tail = null;
            }
            else {
                head = head.getNext();
            }
            return item;
	}
        
	public Object removeFromTail() throws EmptyListException {
            Object item = null;
            if(isEmpty()) {
                throw new EmptyListException();
            }
            item = tail.getData();
            if(head == tail) {
                head = tail = null;
            }
            else{
                ListNode current = head;
                while(current.getNext() != tail)
                    current = current.getNext();
                tail = current;
                current.setNext(null);
            }
            return item;
	}
	public String toString () {
		String s = "[ ";
		ListNode current = head;
		while (current != null) {
			s += current.getData() + " ";
			current = current.getNext();
		}
		return s + "]";
	}
} // class LinkedList
