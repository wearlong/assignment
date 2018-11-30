package Ex7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chpeter868
 */

class ListQueue extends LinkedList {
    
        public ListQueue() {    // <== constructor, different from ListStackComp.java
		super();
    }
    
    public boolean empty() {
         if (super.isEmpty()) {
             return true;
         } else {
             return false;
         }
    }
	
    public void enqueue(Object item) {
        super.addToTail(item);
    }

    public Object dequeue() {
        Object item = null;
	super.removeFromHead();
	return item;
    }       
    
    public Object initialize() {
        for (int i = 1; i > 0; i++) {
				if (empty()) {
                                        return "A queue is empty";
				} else {
					dequeue();
				}
			}
        return null;
    }  
    

}

